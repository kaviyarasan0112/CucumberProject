package hooks;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import design.BrowserCucumber;
import design.ElementCucumber;
import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseClass implements BrowserCucumber,ElementCucumber {
	
	public static RemoteWebDriver driver;

	@Override
	public void click(WebElement ele) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void append(WebElement ele, String data) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void clear(WebElement ele) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void clearAndType(WebElement ele, String data) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getElementText(WebElement ele) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getBackgroundColor(WebElement ele) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getTypedText(WebElement ele) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void selectDropDownUsingText(WebElement ele, String value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void selectDropDownUsingIndex(WebElement ele, int index) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void selectDropDownUsingValue(WebElement ele, String value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean verifyExactText(WebElement ele, String expectedText) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean verifyPartialText(WebElement ele, String expectedText) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean verifyExactAttribute(WebElement ele, String attribute, String value) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void verifyPartialAttribute(WebElement ele, String attribute, String value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean verifyDisplayed(WebElement ele) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean verifyDisappeared(WebElement ele) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean verifyEnabled(WebElement ele) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void verifySelected(WebElement ele) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public RemoteWebDriver startApp(String url) {
		return startApp("chrome", url);
	}

	@Override
	public RemoteWebDriver startApp(String browser, String url) {
		try {
			if(browser.equalsIgnoreCase("chrome")) {
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
			} else if(browser.equalsIgnoreCase("firefox")) {
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
			} else if(browser.equalsIgnoreCase("ie")) {
				WebDriverManager.iedriver().setup();
				driver = new InternetExplorerDriver();
			}
			driver.navigate().to(url);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		} catch (Exception e) {
			throw new RuntimeException();
		} 
		return driver;

	}

	@Override
	public WebElement locateElement(String locatorType, String value) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public WebElement locateElement(String value) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<WebElement> locateElements(String type, String value) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void switchToAlert() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void acceptAlert() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dismissAlert() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getAlertText() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void typeAlert(String data) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void switchToWindow(int index) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void switchToWindow(String title) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void switchToFrame(int index) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void switchToFrame(WebElement ele) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void switchToFrame(String idOrName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void defaultContent() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean verifyUrl(String url) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean verifyTitle(String title) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void quit() {
		// TODO Auto-generated method stub
		
	}

}
