# java-packages
This Repository helps to understand the use of packages in Java, and how to use cmd line tools to create your working jar  file having a package based class Tree

## Understand the commands we need to run
* To get the .class files at a particular location use -
```
javac <Filename> -d <dir path to get the classfile>
```
* To run the .class files, go to the ./classes folder and run -
```
java testers.Tester
```
* To add things to the classpath use -
```
javac -cp "./src; <some jar file location>" -d <classfile dir> <Filename>
```
* To make a jar file use -
```
jar cvfm <Jar file name> <Manifest location> -C <./classes location for all class files> <location for all files to be copied to Jar file>
```
* To run the Jar -
```
java -jar <Jar file location>
```
