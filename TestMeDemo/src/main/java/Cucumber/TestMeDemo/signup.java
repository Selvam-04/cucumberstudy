package Cucumber.TestMeDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class signup

{
	WebDriver driver;
	@Given("user enters into TestMeApp")
	public void user_enters_into_TestMeApp() {
	    // Write code here that turns the phrase above into concrete actions
		
		driver=Utilityclass.getDriver("Chrome");
		   driver.get("http://10.232.237.143:443/TestMeApp/");
		   driver.findElement(By.linkText("SignUp")).click(); 
	}

	
		
   
	@Given("User enters username as {string}")
	public void user_enters_username_as(String string)
	{
		driver.findElement(By.id("userName")).sendKeys(" Mukesha M");
		System.out.println(string);  
	}

	@Given("User enter firstname as {string}")
	public void user_enter_firstname_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
		 driver.findElement(By.name("firstName")).sendKeys("Mukesha");
		System.out.println(string);   
	}

	@Given("User enters lastname as {string}")
	public void user_enters_lastname_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("lastName")).sendKeys("M");
		System.out.println(string);
	}

	@Given("User gives password as {string}")
	public void user_gives_password_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("password")).sendKeys("Mukesha21@");
		System.out.println(string);
	}

	@Given("User gives confirm password as {string}")
	public void user_gives_confirm_password_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("pass_confirmation")).sendKeys("Mukesha21@");
		System.out.println(string);
	}

	@Then("User selects gender as {string}")
	public void user_selects_gender_as(String s) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//*[@id='gender']")).click();
		System.out.println(s);
	}

	@Then("User gives email as {string}")
	public void user_gives_email_as(String r) {
	    // Write code here that turns the phrase above into concrete actions
		 driver.findElement(By.id("emailAddress")).sendKeys("selva210797@gmail.com");
	         
		System.out.println(r);
	}

	@Then("User gives mobileno as {string}")
	public void user_gives_mobileno_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("mobileNumber")).sendKeys("6383620183");
		System.out.println(string);
	}

	@Then("User gives dob as {string}")
	public void user_gives_dob_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.name("dob")).sendKeys("21/07/1997");
        

		System.out.println(string);
	}

	@Then("User gives address as {string}")
	public void user_gives_address_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("address")).sendKeys("coimbatore");
       
		System.out.println(string);
	}

	@Then("User clicks security question as {string}")
	public void user_clicks_security_question_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
		 Select question = new Select(driver.findElement(By.id("securityQuestion")));
	       	System.out.println(string);
	}

	@Then("User gives answer as {string}")
	public void user_gives_answer_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("answer")).sendKeys("Gandhipuram");
	               
	
		System.out.println(string);
	}

	@When("User clicks register button {string}")
	public void user_clicks_register_button(String string) {
	    // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.name("Submit")).click();

		System.out.println(string);
	}

	
}
