package StepsDefination;

import java.time.Duration;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.base;
import pages.loginpage;



public class Loginsteps extends base {
	WebDriver driver;
	loginpage lp=new loginpage(driver);
	
@Given("user is on login page")
	public void user_is_on_login_page() {
		base b=new base();
		b.setup();
		
	}

@When("^user enters (.*) and (.*)$")
	public void user_enters_email_and_password(String mail, String pass) throws InterruptedException {  
		System.out.println("user enter email and password");
		Thread.sleep(2000);
		lp.enteremailId(mail);
	    lp.enterpassid(pass);
	}

	@And("clicks on login button")
	public void clicks_on_login_button() throws InterruptedException {
		Thread.sleep(2000);
	   System.out.println("clicks on login button");
	   lp.clickLogin();
	}

	@Then("user is navigated to home page")
	public void user_is_navigated_to_home_page() throws InterruptedException {
		Thread.sleep(2000);
	    System.out.println("user enters home page");
	}
}
