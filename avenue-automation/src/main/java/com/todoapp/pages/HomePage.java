package com.todoapp.pages;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

	By signinLinkLocator = By.xpath("//a[contains(text(),'Sign In')]");
	By myTasksLocator = By.linkText("My Tasks");
	
	public HomePage(WebDriver driver) {
		super(driver);
	    driver.navigate().to("http://qa-test.avenuecode.com/");
	    maximizeWindow();
	    driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	    assertEquals("ToDo Rails and Angular", driver.getTitle());
	      }
	public LoginPage navigateLoginPage() {

		driver.findElement(signinLinkLocator).click();
		return new LoginPage(driver);
	}
	public TaskPage navigateTaskPage() {

		driver.findElement(myTasksLocator).click();
		return new TaskPage(driver);
	}
	public void myTaskLinkPresent(){
		assertTrue("My Tasks link is not present",isElementPresent(myTasksLocator));
	}
	public void clickMyTaskLink() throws InterruptedException{
		buttonClick(myTasksLocator);
	}
}
