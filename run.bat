java -jar autobuildinstall.jar %1 %2 
SET fileDownload=%2%
if "%fileDownload%"=="" SET fileDownload="%cd%"
7z x %fileDownload%/AdventNetMDM_WPack.zip -o%fileDownload%
cd %fileDownload%/ManageEngine/DesktopCentral_Server/bin/scripts
CALL uninstall.bat
CALL runOnce.bat
CALL DCService.bat -t
