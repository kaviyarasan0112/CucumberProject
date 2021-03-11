package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;



public class MyLeadsPage_C extends hooks.BaseClass {

	public MyLeadsPage_C(RemoteWebDriver driver){
		hooks.BaseClass.driver = driver;
		PageFactory.initElements(driver, this);		
	}
	
	@FindBy(how=How.LINK_TEXT,using="Create Lead")
	private WebElement elecreateLead;
	 
	public CreateLeadPage_C clickCreateLead(){
		elecreateLead.click();
		return new CreateLeadPage_C(driver);
	}

	@FindBy(how=How.LINK_TEXT,using="Find Leads")
	public WebElement elefindLead;
	
	public FindLeadPage_C clickFindLead(){
		elefindLead.click();
		return new FindLeadPage_C(driver);
	}
	
	@FindBy(how=How.LINK_TEXT,using="Merge Leads")
	public WebElement elemergeLead;
	
	/*
	 * public MergeLeadPage clickMergeLead(){ elemergeLead.click(); return new
	 * MergeLeadPage(driver); }
	 */
	
	

}
