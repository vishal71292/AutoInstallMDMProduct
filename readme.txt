1. This product is used to download a MDMP AdventNetwpack.zip , extract it , uninstall the old one if present, install the new downloaded one and start it.
2. USAGE 1:
		1. copy the autoMDM.bat,autobuildinstall.jar files to seperate folder.
		2. call the autoMDM.bat <file url to download> <filepath to download to>
		note: first argument is mandatory. second is optional
		note: If the second command line argument is empty, then the zip will be downloaded to current directory, extracted and installed.
		
	example: autoMDM.bat http://http://me-build1/products/desktopcentral/milestones/MDM_PRODUCT_MASTER_BRANCH/DESKTOPCENTRAL_MDMP_92000/AdventNetMDM_WPack.zip ./Test
	example: autoMDM.bat http://http://me-build1/products/desktopcentral/milestones/MDM_PRODUCT_MASTER_BRANCH/DESKTOPCENTRAL_MDMP_92000/AdventNetMDM_WPack.zip
3. USAGE 2:
		1. copy the autoMDM.bat,autobuildinstall.jar files to seperate folder.
		2. Set the autoMDM.bat in your system path.(environmental variable)
		3. call the autoMDM.bat <file url to download> <filepath to download to> 
		       The above command can be called from anywhere in the system.
		note: first argument is mandatory. second is optional
		note: If the second command line argument is empty, then the zip will be downloaded to current directory, extracted and installed.
		
	example: autoMDM.bat http://http://me-build1/products/desktopcentral/milestones/MDM_PRODUCT_MASTER_BRANCH/DESKTOPCENTRAL_MDMP_92000/AdventNetMDM_WPack.zip ./Test
	example: autoMDM.bat http://http://me-build1/products/desktopcentral/milestones/MDM_PRODUCT_MASTER_BRANCH/DESKTOPCENTRAL_MDMP_92000/AdventNetMDM_WPack.zip