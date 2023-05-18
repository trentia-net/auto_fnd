import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

import utils.WrapWebDriver;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:features/",
        glue = "steps",
        tags = "not @ignore"
)
public class TestRunner {

    @AfterClass
    public static void afterAll(){
        System.out.println("This will run after all");
        WrapWebDriver.getInstance().quit();
    }
}