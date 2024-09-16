package pages;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import io.cucumber.java.en.Given;

public class base {
	
	WebDriver driver;
	
	public void setup() {
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://rahulshettyacademy.com/client");
	driver.manage().window().maximize();
	Assert.assertEquals(driver.getTitle(),"Let's Shop");
	}


}
