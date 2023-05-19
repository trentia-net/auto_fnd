import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:features/",
        plugin = {"pretty","json:build/reports/test-results.json","html:build/reports/test-results.html","io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"},
        glue = {"Steps","Hooks"}
)
public class RunCucumberTest {

}
