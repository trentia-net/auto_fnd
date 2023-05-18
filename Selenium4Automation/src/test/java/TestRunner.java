import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:features/",
        glue = {"steps","hooks"},
        plugin = {"pretty","json:build/reports/test-results.json","html:build/reports/test-results.html","io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"},
        tags = "not @ignore"
)
public class TestRunner {

}