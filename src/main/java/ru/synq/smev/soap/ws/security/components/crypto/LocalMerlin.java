/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package ru.synq.smev.soap.ws.security.components.crypto;
 
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.Key;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertStore;
import java.security.cert.CertificateFactory;
import java.security.cert.CollectionCertStoreParameters;
import java.security.cert.X509CRL;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Properties;
 

import org.apache.ws.security.WSSecurityException;
import org.apache.ws.security.components.crypto.CredentialException;
import org.apache.ws.security.components.crypto.Merlin;
 
/**
 * Замена базового провайдера работы с хранилищами сертификатов и ключей.
 * Цель - использование особенностей работы c хранилищем закрытых ключей JCP (HDImageStore).
 *  
 * @author Aleksey Sushko
 */
public class LocalMerlin extends Merlin {
 
 private static final String HD_IMAGE_STORE = "HDImageStore";
 private static final org.apache.commons.logging.Log LOG = 
   org.apache.commons.logging.LogFactory.getLog(Merlin.class);
private static final boolean DO_DEBUG = true;
 
 /**
  * Дубликат закрытой функции из базового класса.
  */
 private static String createKeyStoreErrorMessage(KeyStore keystore) throws KeyStoreException {
  Enumeration<String> aliases = keystore.aliases();
  StringBuilder sb = new StringBuilder(keystore.size() * 7);
  boolean firstAlias = true;
  while (aliases.hasMoreElements()) {
   if (!firstAlias) {
    sb.append(", ");
   }
   sb.append(aliases.nextElement());
   firstAlias = false;
  }
  String msg = " in keystore of type [" + keystore.getType()
    + "] from provider [" + keystore.getProvider()
    + "] with size [" + keystore.size() + "] and aliases: {"
    + sb.toString() + "}";
  return msg;
 }
  
  
 public LocalMerlin() {
  super();
 }
 
 public LocalMerlin(Properties properties, ClassLoader loader)
   throws CredentialException, IOException {
  super(properties, loader);
 }
 
 public LocalMerlin(Properties properties) throws CredentialException,
   IOException {
  super(properties);
 }
 
 /**
  * Базовый Merlin не загружает хранилище личных ключей и доверенных сертификатов,
  * если файл не указан.
  * Цель - при отсутствии имени файла, система поднимает хранилище личных ключей.
  */
// @Override
// public void loadProperties(Properties properties, ClassLoader loader)
//   throws CredentialException, IOException {
//  super.loadProperties(properties, loader);
//   
//  String provider = properties.getProperty(CRYPTO_KEYSTORE_PROVIDER);
//  if (provider != null)
//   provider = provider.trim();
//   
//  if(keystore == null) {
//   String passwd = properties.getProperty(KEYSTORE_PASSWORD, "security");
//   String type = properties.getProperty(KEYSTORE_TYPE, KeyStore.getDefaultType());
//    
//   if(passwd != null)
//    passwd = passwd.trim();
//   if(type != null)
//    type = type.trim();
//    
//   if(HD_IMAGE_STORE.equals(type))
//    keystore = load(null, passwd, provider, type);
//  }
//   
//  if(truststore == null) {
//   String passwd = properties.getProperty(TRUSTSTORE_PASSWORD, "changeit");
//   String type = properties.getProperty(TRUSTSTORE_TYPE, KeyStore.getDefaultType());
//    
//   if(passwd != null)
//    passwd = passwd.trim();
//   if(type != null)
//    type = type.trim();
//    
//   if(HD_IMAGE_STORE.equals(type))
//    truststore = load(null, passwd, provider, type);
//  }
// }
 
 /**
  * Gets the private key corresponding to the identifier.
  *
  * @param identifier The implementation-specific identifier corresponding to the key
  * @param password The password needed to get the key
  * @return The private key
  */
 @Override
 public PrivateKey getPrivateKey(
   String identifier,
   String password
   ) throws WSSecurityException {
  if (keystore == null) {
   throw new WSSecurityException("The keystore is null");
  }
  try {
   if (identifier == null || !keystore.isKeyEntry(identifier)) {
    String msg = "Cannot find key for alias: [" + identifier + "]";
    String logMsg = createKeyStoreErrorMessage(keystore);
    LOG.error(msg + logMsg);
    throw new WSSecurityException(msg);
   }
   if (password == null && privatePasswordSet) {
    password = properties.getProperty(KEYSTORE_PRIVATE_PASSWORD);
    if (password != null) {
     password = password.trim();
    }
   }
    
   Key keyTmp = loadPrivateKey(identifier, password);
   if (!(keyTmp instanceof PrivateKey)) {
    String msg = "Key is not a private key, alias: [" + identifier + "]";
    String logMsg = createKeyStoreErrorMessage(keystore);
    LOG.error(msg + logMsg);
    throw new WSSecurityException(msg);
   }
   return (PrivateKey) keyTmp;
  } catch (KeyStoreException ex) {
   throw new WSSecurityException(
     WSSecurityException.FAILURE, "noPrivateKey", new Object[]{ex.getMessage()}, ex
     );
  } catch (UnrecoverableKeyException ex) {
   throw new WSSecurityException(
     WSSecurityException.FAILURE, "noPrivateKey", new Object[]{ex.getMessage()}, ex
     );
  } catch (NoSuchAlgorithmException ex) {
   throw new WSSecurityException(
     WSSecurityException.FAILURE, "noPrivateKey", new Object[]{ex.getMessage()}, ex
     );
  }
 }
 
 /**
  * Получение закрытого ключа из хранилища.
  * Для хранилища HDImageStore пустой пароль передается как null.
  * Базовый вариант передает пустой массив char[]{}. 
  */
 protected Key loadPrivateKey(String identifier, String password)
   throws KeyStoreException, NoSuchAlgorithmException,
   UnrecoverableKeyException {
   
  char[] passwordArray = null;
   
  if(password == null) { 
   String type = keystore.getType();
   if(HD_IMAGE_STORE.equals(type))
    passwordArray = null;
   else
    passwordArray = new char[]{};
  }
  else {
   passwordArray = password.toCharArray();
  }
   
  Key keyTmp = keystore.getKey(identifier, passwordArray);
   
  return keyTmp;
 }
 
 public void loadProperties(Properties properties, ClassLoader loader) 
	        throws CredentialException, IOException {
	        if (properties == null) {
	            return;
	        }
	        this.properties = properties;
	        //
	        // Load the provider(s)
	        //
	        String provider = properties.getProperty(CRYPTO_KEYSTORE_PROVIDER);
	        if (provider != null) {
	            provider = provider.trim();
	        }
	        String certProvider = properties.getProperty(CRYPTO_CERT_PROVIDER);
	        if (certProvider != null) {
	            setCryptoProvider(certProvider);
	        }
	        //
	        // Load the KeyStore
	        //
	        String alias = properties.getProperty(KEYSTORE_ALIAS);
	        if (alias != null) {
	            alias = alias.trim();
	            defaultAlias = alias;
	        }
	        String keyStoreLocation = properties.getProperty(KEYSTORE_FILE);
	        if (keyStoreLocation == null) {
	            keyStoreLocation = properties.getProperty(OLD_KEYSTORE_FILE);
	        }
	        if (keyStoreLocation != null) {
	            keyStoreLocation = keyStoreLocation.trim();
	            InputStream is = null;
	            
	            
	            //ANNI01
	            if(!HD_IMAGE_STORE.equals(properties.getProperty(KEYSTORE_TYPE, KeyStore.getDefaultType()))) {
            		is=loadInputStream(loader, keyStoreLocation);
            	}
	            
	            try {
	            	if(HD_IMAGE_STORE.equals(properties.getProperty(KEYSTORE_TYPE, KeyStore.getDefaultType()))) {
	            		is=null;
	            	}
	                String passwd = properties.getProperty(KEYSTORE_PASSWORD, "security");
	                if (passwd != null) {
	                    passwd = passwd.trim();
	                }
	                String type = properties.getProperty(KEYSTORE_TYPE, KeyStore.getDefaultType());
	                if (type != null) {
	                    type = type.trim();
	                }
	                keystore = load(is, passwd, provider, type);
	                if (DO_DEBUG) {
	                    LOG.debug(
	                        "The KeyStore " + keyStoreLocation + " of type " + type 
	                        + " has been loaded"
	                    );
	                }
	                String privatePasswd = properties.getProperty(KEYSTORE_PRIVATE_PASSWORD);
	                if (privatePasswd != null) {
	                    privatePasswordSet = true;
	                }
	            } finally {
	                if (is != null) {
	                    is.close();
	                }
	            }
	        } else {
	            if (DO_DEBUG) {
	                LOG.debug("The KeyStore is not loaded as KEYSTORE_FILE is null");
	            }
	        }
	        
	        //
	        // Load the TrustStore
	        //
	        String trustStoreLocation = properties.getProperty(TRUSTSTORE_FILE);
	        if (trustStoreLocation != null) {
	            trustStoreLocation = trustStoreLocation.trim();
	            InputStream is = loadInputStream(loader, trustStoreLocation);

	            try {
	                String passwd = properties.getProperty(TRUSTSTORE_PASSWORD, "changeit");
	                if (passwd != null) {
	                    passwd = passwd.trim();
	                }
	                String type = properties.getProperty(TRUSTSTORE_TYPE, KeyStore.getDefaultType());
	                if (type != null) {
	                    type = type.trim();
	                }
	                truststore = load(is, passwd, provider, type);
	                if (DO_DEBUG) {
	                    LOG.debug(
	                        "The TrustStore " + trustStoreLocation + " of type " + type 
	                        + " has been loaded"
	                    );
	                }
	                loadCACerts = false;
	            } finally {
	                if (is != null) {
	                    is.close();
	                }
	            }
	        } else {
	            String loadCacerts = properties.getProperty(LOAD_CA_CERTS, "false");
	            if (loadCacerts != null) {
	                loadCacerts = loadCacerts.trim();
	            }
	            if (Boolean.valueOf(loadCacerts).booleanValue()) {
	                String cacertsPath = System.getProperty("java.home") + "/lib/security/cacerts";
	                if (cacertsPath != null) {
	                    cacertsPath = cacertsPath.trim();
	                }
	                InputStream is = new FileInputStream(cacertsPath);
	                try {
	                    String cacertsPasswd = properties.getProperty(TRUSTSTORE_PASSWORD, "changeit");
	                    if (cacertsPasswd != null) {
	                        cacertsPasswd = cacertsPasswd.trim();
	                    }
	                    truststore = load(is, cacertsPasswd, null, KeyStore.getDefaultType());
	                    if (DO_DEBUG) {
	                        LOG.debug("CA certs have been loaded");
	                    }
	                    loadCACerts = true;
	                } finally {
	                    if (is != null) {
	                        is.close();
	                    }
	                }
	            }
	        }
	        //
	        // Load the CRL file
	        //
	        String crlLocation = properties.getProperty(X509_CRL_FILE);
	        if (crlLocation != null) {
	            crlLocation = crlLocation.trim();
	            InputStream is = loadInputStream(loader, crlLocation);

	            try {
	                CertificateFactory cf = getCertificateFactory();
	                X509CRL crl = (X509CRL)cf.generateCRL(is);
	                
	                if (provider == null || provider.length() == 0) {
	                    crlCertStore = 
	                        CertStore.getInstance(
	                            "Collection",
	                            new CollectionCertStoreParameters(Collections.singletonList(crl))
	                        );
	                } else {
	                    crlCertStore = 
	                        CertStore.getInstance(
	                            "Collection",
	                            new CollectionCertStoreParameters(Collections.singletonList(crl)),
	                            provider
	                        );
	                }
	                if (DO_DEBUG) {
	                    LOG.debug(
	                        "The CRL " + crlLocation + " has been loaded"
	                    );
	                }
	            } catch (Exception e) {
	                if (DO_DEBUG) {
	                    LOG.debug(e.getMessage(), e);
	                }
	                throw new CredentialException(CredentialException.IO_ERROR, "ioError00", e);
	            } finally {
	                if (is != null) {
	                    is.close();
	                }
	            }
	        }
	    }
}