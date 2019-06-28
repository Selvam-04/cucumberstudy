package TestMeDemo2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Cucumber.TestMeDemo.Utilityclass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class signin 
{
	WebDriver driver;
	 	@Given("User enters SignIn")
	     	public void user_enters_SignIn() {
	     	    // Write code here that turns the phrase above into concrete actions
		driver=Utilityclass.getDriver("Chrome");
		   driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
		   
		//driver.findElement( By.linkText("SignIn")).click();
	     	}

	     	@Given("Users enters {string}")
	     	public void users_enters(String st) {
	     	    // Write code here that turns the phrase above into concrete actions
	     		driver.findElement( By.name("userName")).sendKeys(st);
	     	}

	     	@When("User enters password {string}")
	     	public void user_enters_password(String string) {
	     	    // Write code here that turns the phrase above into concrete actions
	     		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(string); 	     
	     	}

	     	@When("Click on login")
	     	public void click_on_login() {
	     	    // Write code here that turns the phrase above into concrete actions
	     		driver.findElement(By.xpath( "/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]")).click();	     
	     	}

            @Then("Homepage is displayed")
           public void homepage_is_displayed(io.cucumber.datatable.DataTable dataTable) {
           System.out.println("login page is displayed");    
           }




}
