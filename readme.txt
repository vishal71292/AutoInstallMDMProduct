1. This product is used to download a MDMP AdventNetwpack.zip , extract it , uninstall the old one if present, install the new downloaded one and start it.
2. USAGE 1:
		1. copy the autoMDM.bat,autoMDM.jar files to seperate folder.
		2. Set the absolute path of "autoMDM.jar" in your bat file(The first line of bat files contains java -jar autoMDM.jar %1 %2. change the text autoMDM.jar to the absolute path of jar file)
		3. call the autoMDM.bat <file url to download> <filepath to download to>
		note: first argument is mandatory. second is optional
		note: If the second command line argument is empty, then the zip will be downloaded to current directory, extracted and installed.
		
	example: autoMDM.bat http://http://me-build1/products/desktopcentral/milestones/MDM_PRODUCT_MASTER_BRANCH/DESKTOPCENTRAL_MDMP_92000/AdventNetMDM_WPack.zip ./Test
	example: autoMDM.bat http://http://me-build1/products/desktopcentral/milestones/MDM_PRODUCT_MASTER_BRANCH/DESKTOPCENTRAL_MDMP_92000/AdventNetMDM_WPack.zip
3. USAGE 2:
		1. copy the autoMDM.bat,autobuildinstall.jar files to seperate folder.
		2. Set the absolute path of "autoMDM.jar" in your bat file(The first line of bat files contains java -jar autoMDM.jar %1 %2. change the text autoMDM.jar to the absolute path of jar file)
		3. Set the autoMDM.bat in your system path.(environmental variable)
		4. call the autoMDM.bat <file url to download> <filepath to download to> 
		       The above command can be called from anywhere in the system.
		note: first argument is mandatory. second is optional
		note: If the second command line argument is empty, then the zip will be downloaded to current directory, extracted and installed.
		
	example: autoMDM.bat http://http://me-build1/products/desktopcentral/milestones/MDM_PRODUCT_MASTER_BRANCH/DESKTOPCENTRAL_MDMP_92000/AdventNetMDM_WPack.zip ./Test
	example: autoMDM.bat http://http://me-build1/products/desktopcentral/milestones/MDM_PRODUCT_MASTER_BRANCH/DESKTOPCENTRAL_MDMP_92000/AdventNetMDM_WPack.zip