package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import hooks.BaseClass;


public class HomePage_C extends hooks.BaseClass{

	public HomePage_C(RemoteWebDriver driver){
		BaseClass.driver = driver;		
		PageFactory.initElements(driver, this);
	}		

	@FindBy(how=How.XPATH,using="//h2[text()[contains(.,'Demo')]]")
	public WebElement eleLoggedName;

	public HomePage_C verifyLoggedName(String data) {
		
		return this;
	}

	@FindBy(how=How.LINK_TEXT,using="CRM/SFA")
	public WebElement eleCRMSFALink;

	public MyHomePage_C clickCRMSFA(){
		eleCRMSFALink.click();
		return new MyHomePage_C(driver);
	}

	@FindBy(how=How.CLASS_NAME,using="decorativeSubmit")
	private WebElement eleLogOut;
	
	public LoginPage_C clickLogout() {
		
		return new LoginPage_C(driver);

	}
	
	

}










