package com.practiceautomation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Loginpage 
{
	
	WebDriver driver;
	
	
	@FindBy(xpath="//input[@id='email']")
	WebElement 	EmailId;
	
	@FindBy(xpath="//input[@id='passwd']")
	WebElement Password;
	
	@FindBy(xpath="//button[@id='SubmitLogin']//span")
	WebElement LogingBtn;
	
	@FindBy(xpath="//input[@id='email_create']")
	WebElement CreateAccountEmail;
	
	@FindBy(xpath="//button[@id='SubmitCreate']//span")
	WebElement CreateAccountBtn;
	
	
	public Loginpage(WebDriver driver)
	 {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	 }
	
	public void login(String UserId, String Passwrd) {
		if (EmailId.isDisplayed()) {

			if (EmailId.isEnabled()) {

				EmailId.clear();
				EmailId.sendKeys(UserId);

			}

			else {
				System.out.println("Email Field is not Disabled");
			}

		} else {
			System.out.println("Email Field is not displayed");
		}
		
		
		if(Password.isDisplayed())
		{
			if(Password.isEnabled())
			{
				Password.clear();
				Password.sendKeys(Passwrd);
			}	else {
				System.out.println("Password Field is not Disabled");
			}
			
		}else {
			System.out.println("Password Field is not displayed");
		}
		
		if(LogingBtn.isDisplayed())
		{
			if(LogingBtn.isEnabled())
			{
				LogingBtn.click();
			}else {
				System.out.println("Login button is not Disabled");
			}
		}else {
			System.out.println("Login button  is not displayed");
		}

	}
	

	
}
