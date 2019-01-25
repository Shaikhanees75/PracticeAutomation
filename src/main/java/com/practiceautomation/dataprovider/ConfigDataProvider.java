package com.practiceautomation.dataprovider;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigDataProvider 
{
	Properties pro;

	public ConfigDataProvider() 
	{
		File src = new File("./Configuration/config.properties");

		try {
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		} catch (Exception e) {
			System.out.println("Exception is: " + e.getMessage());

		}

	}
	
	public String getApplicationUrl()
	{
		String url1=pro.getProperty("URL");
		return url1;
		
	}
	
	
	
}
