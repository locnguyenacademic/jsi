#!/bin/sh

echo "You should set environmental variable JDK_HOME or JAVA_HOME"

ANT_HOME=./tools/ant

if [ "$JSI_OLD_PATH" == "" ]
then
	JSI_OLD_PATH=$PATH
fi

PATH=.:$JDK_HOME/bin:$JAVA_HOME/bin:$ANT_HOME/bin:$PATH:$JSI_OLD_PATH

echo PATH=$PATH

CLASSPATH=./jsi.jar:./bin:./lib/*:./working/lib/*

echo CLASSPATH=$CLASSPATH

JAVA_CMD="java -cp '$CLASSPATH'"

JAVAW_CMD="java -cp '$CLASSPATH'"
