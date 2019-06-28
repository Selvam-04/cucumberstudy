package Search;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Cucumber.TestMeDemo.Utilityclass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class addItem 
{
	WebDriver driver;
	@Given("user is in homepage {string} and {string}")
	public void user_is_in_homepage_and(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
		driver=Utilityclass.getDriver("Chrome");
		   driver.get(" http://10.232.237.143:443/TestMeApp/login.htm");
			 driver.findElement(By.name("userName")).sendKeys(string);
			 driver.findElement(By.xpath("//input[@name='password']")).sendKeys(string2);
			 driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]")).click();
  
	}
@When("user enters {string} in searchbox")
	public void user_enters_in_searchbox(String string) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//*[@id='myInput']")).sendKeys(string);
		//WebDriverWait wait=new WebDriverWait(driver,5);
	//wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='myInputautocomplete-list']/div/input")));
		//Actions act= new Actions(driver);
		//WebElement text=driver.findElement(By.xpath("//*[@id=\'myInputautocomplete-list\']/div"));
		//act.moveToElement(text).click().build().perform();
		  //driver.findElement( By.xpath( "//*[@id=\'myInputautocomplete-list\']/div")).click();
		  }

	@Then("user must be in addtocart page")
	public void user_must_be_in_addtocart_page() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

}
