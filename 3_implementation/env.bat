@echo off

echo "You should set environmental variable JDK_HOME or JAVA_HOME"

set ANT_HOME=.\tools\ant
echo ANT_HOME = %ANT_HOME%

if "%JSI_OLD_PATH%" == "" set JSI_OLD_PATH=%PATH%

set PATH=.;%JDK_HOME%\bin;%JAVA_HOME%\bin;%ANT_HOME%\bin;%JSI_OLD_PATH%

echo PATH=%PATH%

set CLASSPATH=./jsi.jar;./bin;./lib/*;./working/lib/*

echo CLASSPATH=%CLASSPATH%

set JAVA_CMD=java -cp %CLASSPATH%

set JAVAW_CMD=javaw -cp %CLASSPATH%

@echo on
