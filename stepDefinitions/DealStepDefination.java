package stepDefinitions;
/*
import java.util.List;
//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.DataTable;
//import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//import io.github.bonigarcia.wdm.WebDriverManager;


public class DealStepDefination {
	
    WebDriver driver;

  @Given("^user is already on Login Page$")
	public void user_already_on_login_page(){
	WebDriverManager.firefoxdriver().setup();
	driver=new FirefoxDriver();
	
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	
	driver.get("https://classic.crmpro.com");
	 }
	 
	 @When("^title of login page is Free CRM$")
	 public void title_of_login_page_is_free_CRM(){
	 String title = driver.getTitle();
	 System.out.println(title);
	// Assert.assertEquals("#1 Free CRM for Any Business: Online Customer Relationship Software", title);
	 }
	 
	 @Then("^user enters username and password$")
	 public void user_enters_username_and_password(DataTable credentials)
	 {
	 List<List<String>> data = credentials.raw();
	 driver.findElement(By.name("username")).sendKeys(data.get(0).get(0));
	 driver.findElement(By.name("password")).sendKeys(data.get(0).get(1));
	 }
	
	
	 @Then("^user clicks on login button$")
	 public void user_clicks_on_login_button() {
	 WebElement loginBtn =
	 driver.findElement(By.xpath("//input[@type='submit']"));
	 JavascriptExecutor js = (JavascriptExecutor)driver;
	 js.executeScript("arguments[0].click();", loginBtn);
	 }
	 
	 @Then("^user is on home page$")
	 public void user_is_on_hopme_page(){
	 String title = driver.getTitle();
	 System.out.println("Home Page title ::"+ title);
	// Assert.assertEquals("CRMPRO", title);
	 }
	 
	 
	 @Then("^user moves to new deal page$")
	 public void user_moves_to_new_contact_page() throws InterruptedException 
	 {
	   // driver.switchTo().defaultContent();
	
    	//driver.switchTo().frame(0);
	   	Thread.sleep(10000);
	   	
		driver.switchTo().frame(driver.findElement(By.name("mainpanel")));
		Actions action = new Actions(driver);
		
		Thread.sleep(10000);
		
		action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Deals')]"))).build().perform();
		Thread.sleep(10000);
		
		//driver.findElement(By.xpath("//a[contains(.,'New Deal')]")).click();
		
		WebElement newDeal = driver.findElement(By.xpath("//a[contains(.,'New Deal')]"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(("arguments[0].click()"), newDeal);
		
		}
	 
	 @Then("^user enters deal details$")
	 public void user_enters_contacts_details(DataTable dealData) throws InterruptedException{
		 List<List<String>> dealValues =  dealData.raw();
		 driver.findElement(By.id("title")).sendKeys(dealValues.get(0).get(0));
		 driver.findElement(By.id("amount")).sendKeys(dealValues.get(0).get(1));
		 driver.findElement(By.id("probability")).sendKeys(dealValues.get(0).get(2));
		 driver.findElement(By.id("commission")).sendKeys(dealValues.get(0).get(3));
		 Thread.sleep(10000);
	 }
@Then("^Close the browser$")
public void close_the_browser()
{
		 driver.quit();
	 }
}

*/