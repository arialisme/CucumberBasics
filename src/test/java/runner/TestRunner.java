package runner;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/java/features"}, plugin={"json:target/cucumber.json" , "html:target/site/cucumber-pretty.html" } ,glue = "Steps")
public class TestRunner extends AbstractTestNGCucumberTests {
}
