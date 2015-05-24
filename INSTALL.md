Установка на linux
==================

## Oracle Java 7

apt-get update
apt-get install default-jre
apt-get install default-jdk

## Git

apt-get install git
git clone https://github.com/enginer/smev.proxy.git

## Gradle

add-apt-repository ppa:cwchien/gradle
apt-get update
apt-cache search gradle
apt-get install gradle-2.3

## Сборка проекта

gradle build
./run

## Открыть порты

sudo ufw enable
sudo ufw allow 22/tcp
sudo ufw allow 8080/tcp


## Запуск как сервис

Симлинк
./service -> /etc/init.d/smev

service smev start

## Ключи
6 ключей
```
header.key
masks.key
masks2.key
name.key
primary.key
primary2.key
```
положить в /home/smev/RaUser.000 в соответствии с настройками:
crypto.user=RaUser
org.apache.ws.security.crypto.merlin.keystore.file=/home/smev

## Настройки

по умолчанию из исходников, можно перезаписать в файле /home/smev/application.yml в соответствии с параметром запуска -Dspring.config.location=/home/smev/

## Особенности

Если при попытке произвести запрос возникает ошибка java.lang.ClassNotFoundException: org.apache.xml.security.c14n.InvalidCanonicalizerException
то согласно рекомендации http://www.cryptopro.ru/forum2/default.aspx?g=posts&m=22756#post22756, удалить /usr/lib/jvm/java-7-openjdk-amd64/jre/lib/ext/JCPxml.jar
И скопировать в /usr/lib/jvm/java-7-openjdk-amd64/jre/lib/ext commons-logging-1.1.1.jar и xmlsec-1.5.2.jar
