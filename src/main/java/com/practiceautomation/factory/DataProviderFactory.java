package com.practiceautomation.factory;

import com.practiceautomation.dataprovider.ConfigDataProvider;

public class DataProviderFactory
{
	public  static ConfigDataProvider getConfig()
	{
		ConfigDataProvider config=new ConfigDataProvider();
		return config;
	}
	
	
}
