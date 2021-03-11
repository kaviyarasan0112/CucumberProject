package pages;


import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;

public class DuplicateLeadPage extends hooks.BaseClass {


	public DuplicateLeadPage(RemoteWebDriver driver){
		hooks.BaseClass.driver = driver;
		PageFactory.initElements(driver, this);		
	}


	/*
	 * @FindBy(how=How.CLASS_NAME,using="smallSubmit") private WebElement
	 * eleCreateLeadDublicate; public ViewLeadPage_C clickCreateLeadDublicate(){
	 * eleCreateLeadDublicate.click(); return new ViewLeadPage_C(driver); }
	 */
}
