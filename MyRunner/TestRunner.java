package MyRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(
		features = "E:/seleniumBDDFrameWork/com.Selenium.BDDFrame/src/main/java/Features/taggedhooks.feature", //the path of the feature files
		glue={"stepDefinitions"}, //the path of the step definition files
		format= {"pretty","html:test-outout", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"}, //to generate different types of reporting
		monochrome = true, //display the console output in a proper readable format
		strict = true, //it will check if any step is not defined in step definition file
		dryRun = false, //to check the mapping is proper between feature file and step def file
		tags= {"@SmokeTest"}
		
		//tags = {"~@SmokeTest" , "~@RegressionTest", "~@End2End"}			
		)
public class TestRunner 
{

}


//OR===>tags={"@SmokeTest , @RegressionTest"}
//AND===>tags={"@SmokeTest" , "@ResgressionTest"}
//ignore==>tags={"~@SmokeTest","@RegressionTest"}
// HERE @SmokeTest WILL BE IGNORED AND @RegressionTest will be executed
//REGULAR EXPRESSION==> Represents a pattern describing a certain amount
//                       of Text.