package testrunners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



@CucumberOptions(
        features = "src\\main\\resources\\features",
        glue = {"stepdefinitions"},
        tags = "@Testing"

)

public class runner extends AbstractTestNGCucumberTests {
}
