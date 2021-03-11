package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;



public class EditLeadPage_C extends hooks.BaseClass {


	public EditLeadPage_C(RemoteWebDriver driver){
		hooks.BaseClass.driver = driver;			
		PageFactory.initElements(driver, this);			
	}

	@FindBy(how=How.ID,using="updateLeadForm_companyName")
	private WebElement eleupdateCompanyName;
	public EditLeadPage_C updateCompanyName(String updcomnyName){
		
		return this;

	}
	
	@FindBy(how=How.CLASS_NAME,using="smallSubmit")
	private WebElement eleUpdateSubmit;
	public ViewLeadPage_C clickUpdateSubmit(){
		eleUpdateSubmit.click();
		return new ViewLeadPage_C(driver);
	}

}

