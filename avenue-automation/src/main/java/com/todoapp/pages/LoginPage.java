package com.todoapp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{
	
	By signinLinkLocator = By.xpath("//a[contains(text(),'Sign In')]");
	By usernameLocator = By.id("user_email");
	By passwordLocator = By.id("user_password");
	By signinButtonLocator = By.xpath("//input[@value='Sign in']");
	By signedinMessageLocator = By.xpath("//div[contains(text(),'Signed in')]");
		
	public LoginPage(WebDriver driver) {
		super(driver);
}
	public LoginPage loginToDoApp(){
		String Username = "venkamma.b@gmail.com";
		String Password = "venkammacode";
		buttonClick(signinLinkLocator);
		loginCredentials(usernameLocator,Username);
		loginCredentials(passwordLocator,Password);
		buttonClick(signinButtonLocator);
		return new LoginPage(driver);
	}	
}
