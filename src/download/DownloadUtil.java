package download;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.io.File;

public class DownloadUtil {

  public static void main(String[] args) throws IOException {
		 
		 String urlLink = args[0].trim();
		 String filePath = ".";
		 if(args.length==2){
		   filePath = args[1].trim();
		 }
		 boolean createFolderToWriteResponse = new File(filePath).mkdirs();
		 String fileName = filePath + "/AdventNetMDM_WPack.zip"; //The file that will be saved on your computer
		 
		 //http://me-build1/products/desktopcentral/milestones/MDM_PRODUCT_MASTER_BRANCH/DESKTOPCENTRAL_MDMP_92000/AdventNetMDM_WPack.zip
		 URL link = new URL(urlLink); //The file that you want to download
		
     //Code to download
		 InputStream in = new BufferedInputStream(link.openStream());
		 ByteArrayOutputStream out = new ByteArrayOutputStream();
		 byte[] buf = new byte[1024];
		 int n = 0;
		 while (-1!=(n=in.read(buf)))
		 {
		    out.write(buf, 0, n);
		 }
		 out.close();
		 in.close();
		 byte[] response = out.toByteArray();
 
		 FileOutputStream fos = new FileOutputStream(fileName);
		 fos.write(response);
		 fos.close();
		
		//End download code
		 
		 System.out.println("Finished");

	}

}