#!/bin/sh

rm -frv src/org/soapdemo/client/generated
JAVA_HOME=/local/opt/jdk1.6.0
$JAVA_HOME/bin/wsimport -p org.soapdemo.client.generated -s src -Xnocompile http://localhost:8080/soap-demo?wsdl
