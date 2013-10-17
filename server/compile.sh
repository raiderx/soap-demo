#!/bin/sh

JAVA_HOME=/local/opt/jdk1.6.0
OUTPUT=./target/classes

rm -frv $OUTPUT
mkdir -pv $OUTPUT
find ./src -name *.java > ./target/files
$JAVA_HOME/bin/javac -d $OUTPUT -encoding UTF-8 -g:none @./target/files

rm -fv ./target/server.jar
$JAVA_HOME/bin/jar cvf ./target/server.jar -C $OUTPUT .
