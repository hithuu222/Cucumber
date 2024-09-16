package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage {
	
	WebDriver driver;
	
public loginpage(WebDriver driver){
	this.driver=driver;
	PageFactory.initElements(driver,this);
}

@FindBy(xpath="//input[@id='userEmail']")
WebElement email;
@FindBy(xpath="//input[@id='userPassword']")
WebElement password;
@FindBy(xpath="//input[@id='login']")
WebElement login;


public void enteremailId(String e) {
	email.sendKeys(e);
}
public void enterpassid(String pass) {
	password.sendKeys(pass);
}
public void clickLogin() {
	login.click();
}

}
