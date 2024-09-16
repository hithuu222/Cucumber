package StepsDefination;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

/*public class Googlesteps {
	WebDriver driver;

	@Given("browser is open")
	public void browser_is_open() {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("Inside step-browser is opened");
	   
	   driver=new ChromeDriver();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	   
	}

	@And("user is on google search page")
	public void user_is_on_google_search_page() {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("Inside step- user is on search page"); 
	   driver.get("https://www.google.co.in/");
	   
	    
	}

	@When("user enter text in searchbox")
	public void user_enter_automation_testing() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println(" Inside step-enters automation testing");
	    
	    driver.findElement(By.id("input")).sendKeys("Automation testing");
	}

	@And("clicks on enter")
	public void clicks_on_search_button() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Inside step-click on enter");
	    driver.findElement(By.id("input")).sendKeys(Keys.ENTER);
	}

	@Then("user is navigated to search page")
	public void user_is_navigated_to_search_page() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println(" Inside step-navigate to search page");
	    driver.getPageSource().contains("Automation testing");
	    driver.quit();
	}
	
	

}*/
