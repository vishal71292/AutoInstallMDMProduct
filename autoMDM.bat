@echo off
set downloadurl=%1
set downloadpath=%2build.zip
set directory=%2
echo %downloadpath%
echo %directory%
%WINDIR%\System32\WindowsPowerShell\v1.0\powershell.exe -Command "& {Import-Module BitsTransfer;Start-BitsTransfer '%downloadurl%' '%downloadpath%';$shell = new-object -com shell.application;$zip = $shell.NameSpace('%downloadpath%');foreach($item in $zip.items()){$shell.Namespace('%directory%').copyhere($item);};remove-item '%downloadpath%';}"
echo download complete and extracted to the directory.
cd %directory%/ManageEngine/DesktopCentral_Server/bin/scripts
CALL uninstall.bat
CALL runOnce.bat
CALL DCService.bat -t
pause
