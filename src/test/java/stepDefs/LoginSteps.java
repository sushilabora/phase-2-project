package stepDefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import stepDefs.BaseClass;



public class LoginSteps {
WebDriver driver=BaseClass.driver;
	  @Given("^: User has launched the swag labs application$")
	    public void _user_has_launched_the_swag_labs_application() throws Throwable {

			System.setProperty("webdriver.chrome.driver", "chromedriver");
			
			driver = new ChromeDriver();
			
			driver.get("https://www.saucedemo.com/");
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
			  
	    }

	    @When("^User enters username\"([^\"]*)\"$")
	    public void user_enters_usernamesomething(String username) throws Throwable {
	    	WebElement UserName =driver.findElement(By.xpath("//input[@id='user-name']"));
	    	UserName.sendKeys(username);
	    }
	    
     	@And("^User enters password\"([^\"]*)\"$")
	     public void user_enters_passwordsomething(String password) throws Throwable {
		    	
		    	
	    	WebElement Password=driver.findElement(By.xpath("//input[@id='password\']"));
	    	Password.sendKeys(password);
	    	
	      }

	    @Then("^User should be landed on the Products page$")
	    public void user_should_be_landed_on_the_products_page() throws Throwable {
	    	WebElement ProductPageTitle=driver.findElement(By.xpath("//input[@id='login-button\']");)
   			String ActText=ProductPageTitle.getText();
	    	String ExpText="PRODUCTS";
	    }

	    @Then("^User should get error \"([^\"]*)\"$")
	    public void user_should_get_error_something(String error, String strArg1) throws Throwable {
	        
	    }

	    @And("^User enters  password\"([^\"]*)\"$")
	    public void user_enters_passwordsomething(String password, String strArg1) throws Throwable {
	        
	    }

	    @And("^User clicks on Login button$")
	    public void user_clicks_on_login_button() throws Throwable {
	    	WebElement LoginButton=driver.findElement(By.xpath("//input[@id='login-button\']");)
	    	LoginButton.click();
	    }
	
}
