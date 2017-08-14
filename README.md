# ComparetheMarketSDETTest

Make sure you have the following software on your Windows machine :
1. JDK 1.8 (Append System Variable Path with, %JAVA_HOME%\bin;%M2_HOME%\bin) 
Check : Run 'java -version' -> This should give

java version "1.8.0_131"
Java(TM) SE Runtime Environment (build 1.8.0_131-b11)
Java HotSpot(TM) 64-Bit Server VM (build 25.131-b11, mixed mode)

2. Maven 3.5 (Create System Variables JAVA_HOME=C:\Program Files\Java\jdk1.8.0_131, M2_HOME=C:\Program Files\Apache\apache-maven-3.5.0)
Check : Run 'mvn -version' -> This should give 

Apache Maven 3.5.0 (ff8f5e7444045639af65f6095c62210b5713f426; 2017-04-03T20:39:06+01:00)
Maven home: C:\Program Files\Apache\apache-maven-3.5.0
Java version: 1.8.0_131, vendor: Oracle Corporation
Java home: C:\Program Files\Java\jdk1.8.0_131\jre
Default locale: en_GB, platform encoding: Cp1252
OS name: "windows 10", version: "10.0", arch: "amd64", family: "windows"

3. Firefox 55
4. Git 2.14
Check Run 'Git --version' --> This should give

git version 2.14.1.windows.1

To Run
1. Launch Git Bash
1. Clone the Git reposiory using your git credentials (git clone https://github.com/shouvonik/ComparetheMarketSDETTest)
2. Go to Project Directory  (cd ComparetheMarketSDETTest/ctmsdet)
3. Run 'mvn clean install'
4. Run 'mvn verify -P runCTMSDET,masterthought-report'

One User Journey to compare Electricity supplier's tariff is automated using Selenium-Java, TestNG & Cucumber
