package com.todoapp.pages;

import static org.testng.AssertJUnit.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TaskPage extends BasePage{
	
	By newTaskLocator = By.id("new_task");
	By addTaskButtonLocator = By.xpath("//span[@class='input-group-addon glyphicon glyphicon-plus']");
	By manageSubTaskLocator = By.xpath("//button[contains(text(),'Manage Subtasks')]");
	By myTasksLocator = By.linkText("My Tasks");
	By taskListTableLocator = By.xpath("//table[1]//tr");
	By editingTaskLocator = By.xpath("//h3[contains(text(),'Editing Task')]");
	By newSubTaskLocator = By.id("new_sub_task");
	By dueDateLocator = By.id("dueDate");
	By addSubTaskButtonLocator = By.id("add-subtask");
	By closeButtonLocator = By.xpath("//button[contains(text(),'Close')]");

	public TaskPage(WebDriver driver) {
		super(driver);
	}
	public void addNewTask(){		
		driver.findElement(newTaskLocator).sendKeys("Task1");
		buttonClick(addTaskButtonLocator);
	}
	public void myTaskPage(){
		assertTrue("MyTask page is not loaded",isElementPresent(newTaskLocator));
	}
	public void addSubTask(){
		String date = "06/30/2016";
		driver.findElement(newSubTaskLocator).sendKeys("NewSubTask1");
		driver.findElement(dueDateLocator).sendKeys(date);
		buttonClick(addSubTaskButtonLocator);
	}
	public void closeSubTaskPopup() throws Exception{
		Thread.sleep(8000);
		buttonClick(closeButtonLocator);
	}
	public void manageSubTaskbuttonPresent(){
		assertTrue("Manage SubTask button is not present",isElementPresent(manageSubTaskLocator));
	}
	public void clickSubTaskbutton(){
		buttonClick(manageSubTaskLocator);
	}
	public void subTaskEdit(){
		assertTrue("Sub Task editing box did not popup",isElementPresent(editingTaskLocator));
	}



}
