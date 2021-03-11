package steps;

import java.util.List;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import hooks.BaseClass;
import io.cucumber.datatable.DataTable;

public class LoginUsingDataTable extends BaseClass {
	
	@Given("Enter the credentials to login to the application")
	public void enter_the_credentials_to_login_to_the_application(DataTable userCredentials) {
		List<String> data = userCredentials.asList();
		driver.findElementById("username").sendKeys(data.get(0));
		driver.findElementById("password").sendKeys(data.get(1));
		
	}
	
	@When("click on the login button")
	public void click_on_the_login_button() {
		driver.findElementByClassName("decorativeSubmit").click();
	}
	
}

