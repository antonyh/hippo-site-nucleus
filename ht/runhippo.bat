
call mvn clean
echo Exit Code = %ERRORLEVEL%
if not "%ERRORLEVEL%" == "0" exit /b


call mvn install -Djrebel
echo Exit Code = %ERRORLEVEL%
if not "%ERRORLEVEL%" == "0" exit /b

  
call mvn -P cargo.run -Drepo.path=o:/myhipporepo -Djrebel