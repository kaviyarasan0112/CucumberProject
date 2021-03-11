package pages;


import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

import hooks.BaseClass;



public class LoginPage_C extends BaseClass{
	
	public LoginPage_C(RemoteWebDriver driver) {
		BaseClass.driver=driver;
	}
	
	public LoginPage_C enterTheUsernameAsDemosalesmanager(String username) {
		driver.findElementById("username").sendKeys(username);
	    return this;
	}

	public LoginPage_C enterThePasswordAsCrmsfa(String password) {
		driver.findElementById("password").sendKeys(password);
		return this;
	}
	
	public HomePage_C clickOnTheLoginButton() {
		driver.findElementByClassName("decorativeSubmit").click();
		System.out.println(driver.getSessionId());
		return new HomePage_C(driver);
	}
	
	public LoginPage_C homepageShouldBeDisplayed() {
		 String ActualTitle = driver.getTitle();
		 String ExpectedTitle="Leaftaps - TestLeaf Automation Platform";
		 Assert.assertEquals(ActualTitle, ExpectedTitle);
		 return this;
	}
	
	public LoginPage_C ErrorMessageShouldBeDisplayed() {
		String ActualTitle = driver.getTitle();
		String ExpectedTitle="Leaftaps - TestLeaf Automation Platform";
		Assert.assertEquals(ActualTitle, ExpectedTitle);
		return this;
	}
	
	
	
	
}
