package payment;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Cucumber.TestMeDemo.Utilityclass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class checkout
{
	WebDriver driver;
	@Given("lalitha has Login into the TestMeApp")
	public void lalitha_has_Login_into_the_TestMeApp() {
	    // Write code here that turns the phrase above into concrete actions
		driver=Utilityclass.getDriver("Chrome");
		   driver.get(" http://10.232.237.143:443/TestMeApp/login.htm");
			 driver.findElement(By.name("userName")).sendKeys("lalitha");
			 driver.findElement(By.xpath("//input[@name='password']")).sendKeys("password123");
			 driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]")).click();
  
	}

	@Given("lalitha types {string} in search box")
	public void lalitha_types_in_search_box(String string) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("myInput")).sendKeys("HeadPhone");
	}

	@When("lalitha Clicks Find Details Button")
	public void lalitha_Clicks_Find_Details_Button() {
	    // Write code here that turns the phrase above into concrete actions

driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

	@When("Add the Product to cart")
	public void add_the_Product_to_cart() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//html/body/section/div/div/div[2]/div/div/div/div[2]/center/a")).click();  
	}

	@Then("Click the Cart Icon")
	public void click_the_Cart_Icon() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//*[@id='header']/div[1]/div/div/div[2]/div/a[2]")).click();
	}

	@Then("Quantity is given and click Checkout")
	public void quantity_is_given_and_click_Checkout() {
	    // Write code here that turns the phrase above into concrete actions
		 
		driver.findElement(By.xpath("//*[@id='cart']/tfoot/tr[2]/td[5]/a")).click();
	}

	@Then("The User Redirected to Payments Page and Proceed to pay")
	public void the_User_Redirected_to_Payments_Page_and_Proceed_to_pay() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("/html/body/b/div/div/div[1]/div/div[2]/div[3]/div/form[2]/input")).click();
	}

	@When("The payment page is opened")
	public void the_payment_page_is_opened() {
	    // Write code here that turns the phrase above into concrete actions
		WebDriverWait wait = new WebDriverWait(driver, 10);
		 
		wait.until(ExpectedConditions.presenceOfElementLocated(By.tagName("h3")));
		 
		driver.findElement(By.xpath("//*[@id='swit']/div[1]/div/label")).click();
		 
		driver.findElement(By.id("btn")).click();
		 
		Assert.assertEquals(driver.getTitle(), "Payment Gateway");
		 
		driver.findElement(By.name("username")).sendKeys("123456");
		 
		driver.findElement(By.name("password")).sendKeys("Pass@456");
		 
		driver.findElement(By.xpath("//*[@id='horizontalTab']/div[2]/div/div/div/div/form/div/div[3]/input")).click();
		 
		WebDriverWait waitt = new WebDriverWait(driver, 10);
		 
		waitt.until(ExpectedConditions.presenceOfElementLocated(By.tagName("h4")));
		 
		driver.findElement(By.name("transpwd")).sendKeys("Trans@456");
		 
		driver.findElement(By.xpath("//*[@id='horizontalTab']/div[2]/div/div/div/div/form/div/div[2]/input")).click();
}

	@Then("Order details is displayed")
	public void order_details_is_displayed() 
	{
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertEquals(driver.getTitle(), "Order Details"); 
	}



}
