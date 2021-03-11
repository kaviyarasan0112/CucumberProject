package steps;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import hooks.BaseClass;
import pages.CreateLeadPage_C;
import pages.HomePage_C;
import pages.MyHomePage_C;
import pages.MyLeadsPage_C;
import pages.ViewLeadPage_C;

public class TCCreateLead extends BaseClass{
	HomePage_C hp;
	MyHomePage_C myHomePage;
	MyLeadsPage_C myLeadPage;
	CreateLeadPage_C createLeadPage;
	ViewLeadPage_C viewLeadPage;
	
	@When("click on crmsfa link")
	public void clickCrmsfaLink() {
		 hp=new HomePage_C(driver);
		 hp.eleCRMSFALink.click();
	}
	
	@Then("MyHome page should be displayed")
	public void verifyMyHomePage() {
		
	}
	@When("click on the leads link")
	public void clickOnTheLeadsLink() {
		myHomePage=new MyHomePage_C(driver);
		myHomePage.clickLeadLink();
	}

	@Then("My Leads should be displayed")
	public void myLeadsShouldBeDisplayed() {
		
	}

	@When("click on the create lead link")
	public void clickOnTheCreateLeadLink() {
		 myLeadPage=new MyLeadsPage_C(driver);
		 myLeadPage.clickCreateLead();
	}

	@Then("CreateLead Page should be displayed")
	public void createleadPageShouldBeDisplayed() {
		
	   
	}
	
	@Given("Enter the companyname as (.*)")
	public void enterTheCompanyName(String companyName) {
		 createLeadPage=new CreateLeadPage_C(driver);
		 createLeadPage.enterCompanyName(companyName);
	}
	
	@And("Enter the firstname as (.*)")
	public void enterTheFirstname(String firstName) {
		createLeadPage.enterFirstName(firstName);
	}
	
	@And("Enter the lastname as (.*)")
	public void enterTheLastname(String lastName) {
		createLeadPage.enterLastName(lastName);
	}
	
	@When("Click on the link Create Lead")
	public void clickOnTheCreateLead() {
		createLeadPage.clickCreateLeadSubmit();
	}
	@Then("View Lead Page should be displayed")
	public void viewLeadPageDisplayed() {
		//viewLeadPage=new ViewLeadPage_C(driver);
		
	}	
}
