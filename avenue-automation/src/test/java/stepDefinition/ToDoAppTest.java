package stepDefinition;

import static org.testng.AssertJUnit.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.todoapp.pages.HomePage;
import com.todoapp.pages.LoginPage;
import com.todoapp.pages.TaskPage;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ToDoAppTest{
	  WebDriver driver;
	  HomePage homePage;
	  LoginPage loginPage;
	  TaskPage taskPage;
		
	  By signedinMessageLocator = By.xpath("//div[contains(text(),'Signed in')]");
	  		
	  @Given("^I am logged into ToDo Application$")
		public void I_am_logged_into_ToDo_Application() {
   		   homePage = new HomePage(driver);
		   loginPage = homePage.navigateLoginPage();
		   loginPage.loginToDoApp();
		}

		@Then("^I see loging in sucessfull$")
		public void I_see_loging_in_sucessfull(){
			assertTrue("Login is not successfull",loginPage.isElementPresent(signedinMessageLocator));
		}
		
		@Then("^I see My Tasks link on Navigation Bar$")
		public void I_see_My_Tasks_link_on_Navigation_Bar() {
			homePage.myTaskLinkPresent();
		}	
		
		@When("^I see My Tasks link on NavBar$")
		public void I_see_My_Tasks_link_on_NavBar() {
			homePage.myTaskLinkPresent();
		}	
		@Then("^I click on My Tasks link on NavBar$")
		public void I_click_on_My_Tasks_link_on_NavBar() throws InterruptedException{
			homePage = new HomePage(driver);
			taskPage = homePage.navigateTaskPage();
			homePage.clickMyTaskLink();
			taskPage.myTaskPage();
		}
		@When("^I am on ToDo MyTask Page$")
		public void I_am_on_ToDo_MyTask_Page(){
			taskPage.myTaskPage();
		}
		@Then("^enter new task$")
		public void enter_new_task(){
			taskPage.addNewTask();
		}
		@Then("^I see Manage SubTask button$")
		public void I_see_Manage_SubTask_button(){
			taskPage.manageSubTaskbuttonPresent();
		}
		@Then("^I click on Manage SubTask button$")
		public void I_click_on_Manage_SubTask_button(){
			taskPage.clickSubTaskbutton();
		}
		@When("^I see subTask pop page$")
		public void I_see_subTask_pop_page(){
			taskPage.subTaskEdit();
		}
		@Then("^add new sub task$")
		public void add_new_sub_task(){
			taskPage.addSubTask();
		}
		@Then("^I close sub task popup$")
		public void I_close_sub_task_popup() throws Exception{
			taskPage.closeSubTaskPopup();
		}
		@Before
		public void startUp() {
		    driver = new FirefoxDriver();
		}
		@After
		public void tearDown() {
		    driver.quit();
		}
}
