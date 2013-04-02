
call mvn clean
echo Exit Code = %ERRORLEVEL%
if not "%ERRORLEVEL%" == "0" exit /b


call mvn install 
echo Exit Code = %ERRORLEVEL%
if not "%ERRORLEVEL%" == "0" exit /b

  
call mvn -P cargo.run -Drepo.path=D:/Workspace/hipporepo