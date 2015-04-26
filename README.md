Установка на linux

apt-get update
apt-get install default-jre
apt-get install default-jdk

apt-get install git
git clone https://github.com/enginer/smev.proxy.git

add-apt-repository ppa:cwchien/gradle
apt-get update
apt-cache search gradle
apt-get install gradle-2.3

gradle build
./run

Открыть порты
sudo ufw enable
sudo ufw allow 22/tcp
sudo ufw allow 8080/tcp

Линк




Если при попытке произвести запрос возникает ошибка java.lang.ClassNotFoundException: org.apache.xml.security.c14n.InvalidCanonicalizerException
То согласно рекомендации http://www.cryptopro.ru/forum2/default.aspx?g=posts&m=22756#post22756, удалить /usr/lib/jvm/java-7-openjdk-amd64/jre/lib/ext/JCPxml.jar
И скопировать в /usr/lib/jvm/java-7-openjdk-amd64/jre/lib/ext commons-logging-1.1.1.jar и xmlsec-1.5.2.jar
