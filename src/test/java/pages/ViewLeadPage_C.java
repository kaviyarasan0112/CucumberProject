package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ViewLeadPage_C extends hooks.BaseClass {

	public ViewLeadPage_C(RemoteWebDriver driver) {
		hooks.BaseClass.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/*
	 * @FindBy(how=How.ID,using="viewLead_firstName_sp") public WebElement
	 * eleLeadLink; public ViewLeadPage_C verifyFirstName(String fname) { String
	 * expectedTitle=fname;
	 * 
	 * String actualTitle=driver. return this;
	 * 
	 * }
	 */
	@FindBy(how = How.LINK_TEXT, using = "Find Leads")
	public WebElement elefindLead;

	public FindLeadPage_C clickFindLead() {
		elefindLead.click();
		return new FindLeadPage_C(driver);
	}

	@FindBy(how = How.ID, using = "viewLead_companyName_sp")
	public WebElement eleCompanyName;

	public ViewLeadPage_C verifyCompanyName(String CompanyName) {

		return this;
	}

	@FindBy(how = How.LINK_TEXT, using = "Edit")
	public WebElement eleEditLeadLink;

	public EditLeadPage_C clickEditLeadLink() {

		return new EditLeadPage_C(driver);
	}

	@FindBy(how = How.LINK_TEXT, using = "Duplicate Lead")
	public WebElement eleDuplicateLeadLink;

	public DuplicateLeadPage clickDuplicateLeadLink() {
		eleDuplicateLeadLink.click();
		return new DuplicateLeadPage(driver);
	}

	@FindBy(how = How.LINK_TEXT, using = "Delete")
	public WebElement eleDeleteLeadLink;

	public MyLeadsPage_C clickDeleteLeadLink() {
		eleDeleteLeadLink.click();
		;
		return new MyLeadsPage_C(driver);
	}

}
