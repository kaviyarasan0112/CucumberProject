package hooks;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks extends BaseClass {


	@Before
	public void precondition(Scenario sc) throws InterruptedException, IOException{
		
		FileInputStream fis=new FileInputStream(".\\configs\\configuration.properties");
		Properties prop=new Properties();
		prop.load(fis);
		
		driver = startApp(prop.getProperty("Browser"), prop.getProperty("URL"));

		/*
		 * WebDriverManager.chromedriver().setup(); driver = new ChromeDriver();
		 * driver.manage().window().maximize(); FileInputStream fis=new
		 * FileInputStream(".\\configs\\configuration.properties"); Properties prop=new
		 * Properties(); prop.load(fis);
		 * 
		 * driver.get(prop.getProperty("URL")); //String extentRepPath =
		 * prop.getProperty("ExtentReportPath");
		 * //driver.get("http://leaftaps.com/opentaps/control/main");
		 * driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 * System.out.println(sc.getName());
		 */

	}

	@After
	public void postcondition(Scenario sc){
		System.out.println(sc.getStatus()); 
		driver.close();

	}

}
