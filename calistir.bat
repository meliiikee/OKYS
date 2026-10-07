@echo off
cd /d "%~dp0"
set JDK=C:\Users\Melike\AppData\Local\Programs\Eclipse Adoptium\jdk-25.0.4.101-hotspot\bin
"%JDK%\javac.exe" -encoding UTF-8 -d out src\*.java
if errorlevel 1 goto son
"%JDK%\java.exe" -cp out Main
:son
pause
