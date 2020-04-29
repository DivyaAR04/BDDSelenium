package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;


public class LoginStepDefinition 
{

	WebDriver driver;
	
	@Given("^user is already on Login Page$")
	public void user_is_already_on_Login_Page() throws Throwable 
	{
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		driver.get("https://classic.crmpro.com");
	   
	}

	@When("^title of login page is Free CRM$")
	public void title_of_login_page_is_Free_CRM() throws Throwable 
	{
		String title=driver.getTitle();
		System.out.println("The title is: "+title);	
	//    assertEquals("#1 Free CRM Any Business: Only Customer Relationship Software", title);
	}

	@Then("^user enters \"(.*)\" and \"(.*)\"$")
	public void user_enters_and(String username, String password) throws Throwable 
	{
	   driver.findElement(By.name("username")).sendKeys(username);
	   driver.findElement(By.name("password")).sendKeys(password);

	}

	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() throws Throwable 
	{
		WebElement loginBtn=driver.findElement(By.xpath("//div[@class='input-group-btn']"));
		loginBtn.submit();
		
	}

	@Then("^user is on home page$")
	public void user_is_on_home_page() throws Throwable 
	{
		String title=driver.getTitle();
		System.out.println(title);
	}
	

	@Then("^user moves to new contact page$")
	public void user_moves_to_new_contact_page() throws Throwable 
	{		
		
		 driver.switchTo().defaultContent();
			
	    	//driver.switchTo().frame(0);
		   	Thread.sleep(6000);
		   	
			driver.switchTo().frame(driver.findElement(By.name("mainpanel")));
			Actions action = new Actions(driver);
			
			System.out.println(driver.getTitle());
			
			Thread.sleep(10000);
			
		action.moveToElement(driver.findElement(By.xpath("//a[contains(.,'Contacts')]"))).build().perform();
		Thread.sleep(10000);
		//driver.findElement(By.xpath("//a[contains(text(),'New Contact')]")).click();
	
		WebElement newContact = driver.findElement(By.xpath("//a[contains(text(),'New Contact')]"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", newContact);
	
	}

	@Then("^user enters contact details \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_contact_details_and_and(String firstname1, String lastname1, String position) throws Throwable 
	{
    		driver.findElement(By.id("first_name")).sendKeys(firstname1);
		 driver.findElement(By.id("surname")).sendKeys(lastname1);
		 driver.findElement(By.id("company_position")).sendKeys(position);
		 driver.findElement(By.xpath("//input[@type='submit' and @value='Save']")).click();
		 Thread.sleep(2000);
	
	}


	@Then("^Close the browser$")
	public void close_the_browser() throws Throwable 
	{
		driver.quit();
		// Runtime.getRuntime().exec("taskkill /F /IM geckodriver.exe");
	}

}
