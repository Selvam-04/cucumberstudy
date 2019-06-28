package payment;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Cucumber.TestMeDemo.Utilityclass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class pay 
{
	WebDriver driver;
	@Given("lalitha will  Login into TestMeApp")
	public void lalitha_will_Login_into_TestMeApp() {
	    // Write code here that turns the phrase above into concrete actions
		driver=Utilityclass.getDriver("Chrome");
		   driver.get(" http://10.232.237.143:443/TestMeApp/login.htm");
			 driver.findElement(By.name("userName")).sendKeys("lalitha");
			 driver.findElement(By.xpath("//input[@name='password']")).sendKeys("password123");
			 driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]")).click();

	}

	@When("lalitha searches product {string}")
	public void lalitha_searches_product(String string) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("myInput")).sendKeys("HeadPhone");
		 
		driver.findElement(By.xpath("//input[@type='submit']")).click();
     	
	}

	@When("lalitha try to go to payment without adding any item in cart")
	public void lalitha_try_to_go_to_payment_without_adding_any_item_in_cart() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Try to click payments");
	}

	@Then("TestMEapp Doesn't display Cart Icon")
	public void testmeapp_Doesn_t_display_Cart_Icon() {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertNull(driver.findElement(By.xpath("//*[@id='header']/div[1]/div/div/div[2]/div/a[2]")));
		 
		driver.close();

	}


	 }
