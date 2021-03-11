package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class MyHomePage_C extends hooks.BaseClass {

	public MyHomePage_C(RemoteWebDriver driver){
		hooks.BaseClass.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how=How.LINK_TEXT,using="Leads")
	public WebElement eleLeadLink;
	
	public MyLeadsPage_C clickLeadLink(){
		eleLeadLink.click();
		return new MyLeadsPage_C(driver);
	}


}
