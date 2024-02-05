package propertiesfiletest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class Propertiesfilereadandwrite {

	public static void main(String[] args) throws IOException {
		File file=new File("configuaration.properties");
		if(!file.exists());
		   file.createNewFile();
		   System.out.println(file.exists());
		  // file.delete();
		  // System.out.println(file.exists());
		
		Properties prop=   new Properties();
		prop.setProperty("url", "https://adactinhotelapp.com/");
		prop.setProperty("username", "reyaz009");
		prop.setProperty("password", "reyaz123");
		prop.setProperty("xpath", "//div[@id='username']");
	
		//for write the values in properties file
		
		//FileOutputStream fos=new FileOutputStream(file);
		//prop.store(fos, "new properties file created");
		
        //for read the value from properties file only keys
		
		//FileInputStream fis=new FileInputStream(file);
		//prop.load(fis);
		//Set<String> keys=	prop.stringPropertyNames();
	//	System.out.print(keys);
		
		//for read all values from properties  file
		System.out.println(prop);
		
		//for getting value by using
		System.out.println(prop.getProperty("password"));
	    System.out.println(prop.getProperty("username"));
	   System.out.println(prop.getProperty("xpath"));
	}


	}


	


