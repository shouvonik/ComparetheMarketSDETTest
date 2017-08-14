package energy.comparethemarket.com.ctmsdet.bdd;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(format={"pretty", "html:target/site/cucumber-pretty", "json:target/cucumber.json"}, 
        glue = {"energy.comparethemarket.com.ctmsdet.bdd.energycompare"}, 
		features = "classpath:features",
		tags = {"@RunMe"})

public class RunSDETBDD extends AbstractTestNGCucumberTests{

}
