package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import hooks.BaseClass;


public class CreateLeadPage_C extends BaseClass {

	public CreateLeadPage_C(RemoteWebDriver driver) {
		BaseClass.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.ID, using = "createLeadForm_companyName")
	private WebElement companyName;

	public CreateLeadPage_C enterCompanyName(String companyName) {
		driver.findElementById("createLeadForm_companyName").sendKeys(companyName);
		return this;
	}

	@FindBy(how = How.ID, using = "createLeadForm_firstName")
	private WebElement eleFirstName;

	public CreateLeadPage_C enterFirstName(String firstName) {
		driver.findElementById("createLeadForm_firstName").sendKeys(firstName);
		return this;
	}

	@FindBy(how = How.ID, using = "createLeadForm_lastName")
	private WebElement eleLastName;

	public CreateLeadPage_C enterLastName(String lastName) {
		driver.findElementById("createLeadForm_lastName").sendKeys(lastName);
		return this;
	}

	@FindBy(how = How.CLASS_NAME, using = "smallSubmit")
	private WebElement eleCreateLeadSubmit;

	public ViewLeadPage_C clickCreateLeadSubmit() {
		eleCreateLeadSubmit.click();
		return new ViewLeadPage_C(driver);
	}

	@FindBy(how = How.ID, using = "createLeadForm_primaryEmail")
	private WebElement eleEmail;

	public CreateLeadPage_C enterEmail(String eMail) {

		return this;
	}
}
