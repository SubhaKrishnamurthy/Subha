package StepDefinition;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
public class Test1_StepDefinition {

	@Given("^User logged into application$")
	public void UserLoggedIntoApplication() throws Throwable{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\skrish96\\Workspace_WebexTech\\webextech\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com/");
		
	}
	
	@When("^User enters username and password$")
	public void User_enters_username_and_password() throws Throwable{
		
	}
	
	@Then("^login is successful$")
	public void login_is_successful() throws Throwable{
		
	}
	
	@Given("^User is on login page$")
	public void user_is_on_login_page() throws Throwable {
		System.out.println("Hi");
	}
}
