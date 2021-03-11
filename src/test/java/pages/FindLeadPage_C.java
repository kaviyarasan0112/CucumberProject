package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class FindLeadPage_C extends hooks.BaseClass {

	public FindLeadPage_C(RemoteWebDriver driver) {
		hooks.BaseClass.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using = "(//input[@name='firstName'])[3]")
	private WebElement elefindFirstName;

	public FindLeadPage_C enterFirstName(String findfistname) {

		return this;

	}

	@FindBy(how = How.NAME, using = "id")
	private WebElement eleLeadId;

	public FindLeadPage_C enterLeadId(String findfistname) {

		return this;

	}

	@FindBy(how = How.XPATH, using = "//button[text()='Find Leads']")
	private WebElement eleFindleadsButton;

	public FindLeadPage_C clickFindleadsButton() {
		eleFindleadsButton.click();
		return this;
	}

	@FindBy(how = How.XPATH, using = "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")
	public WebElement eleResultingLeads;

	public ViewLeadPage_C clickFirstResultingLead() {
		eleResultingLeads.click();
		return new ViewLeadPage_C(driver);
	}

	@FindBy(how = How.XPATH, using = "//span[text()='Phone']")
	public WebElement elePhoneTab;

	public FindLeadPage_C clickPhoneTab() {
		elePhoneTab.click();
		return this;
	}

	@FindBy(how = How.XPATH, using = "//span[text()='Email']")
	public WebElement eleEmailTab;

	public FindLeadPage_C clickEmailTab() {
		eleEmailTab.click();
		return this;
	}

	@FindBy(how = How.NAME, using = "phoneNumber")
	public WebElement elePhoneNumberField;

	public FindLeadPage_C enterPhoneNumberField(String PhoneNumber) {
		elePhoneNumberField.sendKeys(PhoneNumber);
		return this;
	}

	@FindBy(how = How.NAME, using = "emailAddress")
	public WebElement eleEmailAddress;

	public FindLeadPage_C enterEmailAddress(String emailAddress) {
		eleEmailAddress.sendKeys(emailAddress);
		return this;
	}

	@FindBy(how = How.CLASS_NAME, using = "x-paging-info")
	public WebElement eleErrorMsg;

	public FindLeadPage_C verifyErrorMsg(String eleErrorMsgValue) {

		return this;
	}

}