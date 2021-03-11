package steps;


import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import hooks.BaseClass;

import pages.LoginPage_C;

public class Login extends BaseClass {

	LoginPage_C lp;

	@Given("Enter the username as (.*)")
	public void enterTheUsernameAsDemosalesmanager(String username) {
		lp = new LoginPage_C(driver);
		lp.enterTheUsernameAsDemosalesmanager(username);
	}

	@Given("Enter the password as (.*)")
	public void enterThePasswordAsCrmsfa(String password) {
		lp.enterThePasswordAsCrmsfa(password);
		// driver.findElementById("password").sendKeys(password);
	}

	@When("Click on the login button")
	public void clickOnTheLoginButton() {
		lp.clickOnTheLoginButton();
	}

	@Then("Homepage should be displayed")
	public void homepageShouldBeDisplayed() {
		lp.homepageShouldBeDisplayed();
	}

	@But("Error Message should be displayed")
	public void ErrorMessageShouldBeDisplayed() {
		lp.ErrorMessageShouldBeDisplayed();
	}

}
