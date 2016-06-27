package com.todoapp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasePage {
	
	public static WebDriver driver;
	By logoutLocator = By.linkText("Sign out");

	public BasePage(WebDriver driver) {
		this.driver = driver;
}

	public boolean isElementPresent(By locator) {
		boolean isPresent = driver.findElements(locator).size() > 0;
		return isPresent;
	}

    public void  loginCredentials(By Locator, String text)
    {
     driver.findElement(Locator).sendKeys(text);
    }
    
    public void buttonClick(By Locator)
    {
     driver.findElement(Locator).click();
    }
    
    public void maximizeWindow()
    {
    	driver.manage().window().maximize();
    }

    public void logout()
    {
    	buttonClick(logoutLocator);
    }
    
	public static void waitForElement(By locator) throws InterruptedException {
		for (int i = 0; i < 600; i++) {
			if (driver.findElements(locator).size() > 0)
				break;
			Thread.sleep(100);

		}
	}


}

