/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package ru.synq.smev.soap.client;

import org.apache.cxf.Bus;
import org.apache.cxf.BusFactory;
import org.apache.cxf.bus.spring.SpringBusFactory;
import org.apache.cxf.interceptor.transform.TransformOutInterceptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;
import ru.synq.smev.soap.xml.security.XmlDSignTools;

import javax.annotation.PostConstruct;

import static java.util.Collections.singletonMap;

@Service
public class SoapClient {

    @Autowired ResourceLoader resourceLoader;

    @PostConstruct
    public void init() throws Exception {
        XmlDSignTools.init();
        SpringBusFactory bf = new SpringBusFactory();
        Bus bus = bf.createBus(resourceLoader.getResource("classpath:wssec.xml").getURL());
        BusFactory.setDefaultBus(bus);

        TransformOutInterceptor transformOutInterceptor = new TransformOutInterceptor();
        transformOutInterceptor.setOutTransformElements(singletonMap("{http://www.w3.org/2005/08/addressing}Action", ""));
        bus.getOutInterceptors().add(transformOutInterceptor);

        /*if (pfrPort instanceof Closeable) {
            ((Closeable)pfrPort).close();
        }
        bus.shutdown(true);*/
    }
}
