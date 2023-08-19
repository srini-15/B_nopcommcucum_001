package testRunnerfiles;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="D:\\srini\\projects\\B_nopCommcucum_001\\src\\test\\resources\\featuresSet\\firstFeatureSmoke.feature",
glue= {"appHooks","StepDefinitionfiles"},
dryRun=false,
monochrome=true,
plugin= {"pretty","html:target/myreports/report.html","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})

public class firstTest {

}
