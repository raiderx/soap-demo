#!/bin/sh

JRE_HOME=/local/opt/jdk1.6.0/jre
$JRE_HOME/bin/java -cp ./target/server.jar:./lib/connector-api-1.5.jar:./lib/jaybird-2.2.3.jar org.soapdemo.server.Server -l localhost -p 8080 -url jdbc:firebirdsql:localhost/3050:/local/work/soap/db/INFO.fdb?encoding=WIN1251 -user sysdba -pass masterkey
