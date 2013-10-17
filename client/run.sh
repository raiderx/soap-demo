#!/bin/sh

JRE_HOME=/local/opt/jdk1.6.0/jre
$JRE_HOME/bin/java -cp ./target/client.jar org.soapdemo.client.Client \
	-h localhost -p 8080
