#!/bin/bash
#coding=utf8

CLASSPATH=bin
for file in lib/*.jar; do CLASSPATH=$file:$CLASSPATH; done

echo Runing storage server...
java -cp $CLASSPATH -Xmx1g -Xms1g -Dfile.encoding=utf8 \
ui.Main -storage
echo Storage server exit.

