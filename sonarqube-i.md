SonarQube Installation

## Prerequisites

SonarQube server will require 3GB+ RAM to work effeciently

### Install Database

I

shell

rpm -1vh http://repo.mysql.com/mysql57-community-release-el7.rpm 
rpm --import https://repo.mysql.com/RPM-GPG-KEY-mysql-2022

systemctl start mysqld

yum install mysql-server -y grep temporary password' /var/log/mysqld.log mysql_secure_installation

systemctl enable mysqld

### Install Java

shell

yum install wget epel-release -y

yum install java -y

wget https://download.bell-sw.com/java/11.0.4/bellsoft-jdk11.0.4-linux-amd64.rpm rpm ivh bellsoft-jdk11.8.4-linux-amd64.rpm

#alternatives.config java

### Configure Linux System for Sonarqube

shell

echo 'vm.max_map_count=262144 >/etc/sysctl.conf sysctl -p

echo - nofile 88088 >>/etc/security/limits.conf

systemctl restart mysqld

sed -1 -e '/query_cache_size/ d'-e's a query_cache_size = 15M /etc/my.cnf

echo - nofile 80000 >>/etc/security/limits.conf

sed -i -e '/query_cache_size/ d -e '$ a query_cache_size = 15M /etc/my.cnf

systemctl restart mysqld

### Configure Database for Sonarqube

shell

mysql -p-u root

mysql>

create database sonarqube;

create user sonarqube'@'localhost' identified by 'Redhat@123'; grant all privileges on sonarqube. to 'sonarqube'@'localhost';

flush privileges;

### Install Sonarqube

shell

yum install unzip -y

wget https://binaries.sonarsource.com/Distribution/sonarqube/sonarqube-7.9.1.zip

cd /opt

unzip -/sonarqube-7.9.1.zip

my sonarqube-7.9.1 sonar

### Configure Sonarqube

shell

sed -i -e '/^sonar.jdbc.username/ d' e '/sonar.jdbc.password/ d' -e /sonar.jdbc.url/ d'

sed -i-e /#sonar.jdbc.username/ a sonar.jdbc.username=sonarqube -e /#sonar.jdbc.password/

-e/sonar.web.host/de/sonar.web.port/ d' /opt/sonar/conf/sonar.properties useConfigs=maxPerformance -e '/#sonar.web.host/ a sonar.web.host=0.0.0.0' /opt/sonar/conf/

a sonar.jdbc.password=Cloudblitz@123 -e /InnoDB/ a sonar.jdbc.url=jdbc.mysql://

localhost:3306/sonarqube?useUnicode=true&characterEncoding=utf&rewriteBatchedStatements=true&

sonar.properties
useradd sonar
chown sonar: sonar /opt/sonar/ -R
