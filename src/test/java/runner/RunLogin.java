package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(features="src/test/java/features/F01_Login.feature",
				 glue= {"steps","hooks"},  //Include the package name of the step definitions class
				 monochrome=true,//To remove the unwanted characters in the console
				tags = {"@Test"} ,
				// tags= {"@smoke,@functional"},
				 plugin= {"pretty","html:reports"})
				 //snippets=SnippetType.CAMELCASE)//To get the step defintion in lower camel case

public class RunLogin extends AbstractTestNGCucumberTests {

	/*
	 * @DataProvider(parallel=true) public Object[][] scenarios(){ return
	 * super.scenarios();
	 * 
	 * }
	 */
	
	
}
