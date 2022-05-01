package runner;

import io.cucumber.testng.CucumberOptions;
import steps.BaseClass;



@CucumberOptions(features = "src/test/java/features",
                 glue= {"steps"},
                 monochrome=true,
                 publish = true,
                 tags ="@Leads" //to execute only Leads testcases
                // tags = "@smoke or @regression" //all testcases contains @smoke or @regression will be executed
               //  tags = "@functional and @regression" // all the testcases contains both @functional and @regression
               //  tags = "not @smoke" //all testcases except @smoke will be executed
                 )
public class CucumberRunner extends BaseClass{
	
}


