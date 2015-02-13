package de.tu_bs.cs.isf.mbse.Ernaehrungsplan.generator;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.commons.net.ftp.FTPClient;

public class FTPUpload {
	
	public static void upload(String user, File filesToUpload[])
	{
		FTPClient client = new FTPClient();
		FileInputStream fis = null;
		
		try {
			client.connect("florianfranke.net");
		    client.login("uni", "renn/yij<rogh&ay=que");
		    
		    // Store file to server
		    for (File f : filesToUpload)
		    {
		    	if (f.exists())
		    	{
		    		fis = new FileInputStream(f.getAbsoluteFile());
		    		client.storeFile(f.getName(), fis);
		    	} 
		    }
		    client.logout();
		} catch (IOException e) {
		    e.printStackTrace();
		} finally {
		    try {
		        if (fis != null) {
		            fis.close();
		        }
		        client.disconnect();
		    } catch (IOException e) {
		        e.printStackTrace();
		    }
		}
	}
}
