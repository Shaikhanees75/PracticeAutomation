package com.practiceautomation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class HomePage 
{

	WebDriver driver;
	
	@FindBy(xpath = ".//a[contains(.,'Sign in')]")
	WebElement SignInbtn;
	
	
	
	public void Homepage(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void ClickonSignIn()
	{
		if(SignInbtn.isDisplayed())
		{
			if(SignInbtn.isEnabled())
			{
				SignInbtn.click();
			}
			else
			{
				System.out.println("SignIn button is disabled");
			}
		}
		else
		{
			System.out.println("SignIn button is notdisplayed");
		}

	}
	public String  Pagetitle()
	{
		String Title=driver.getTitle();
		return Title;
	}
	
	
}
