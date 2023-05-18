package hooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Scenario;
import org.junit.AfterClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import utils.WrapWebDriver;

public class Hooks {

    @After
    public void takeScreenshotOnFailure(Scenario scenario){
        if (scenario.isFailed()) {
            WebDriver driver = WrapWebDriver.getInstance();
            TakesScreenshot ts = (TakesScreenshot) driver;
            byte[] src = ts.getScreenshotAs(OutputType.BYTES);
            scenario.attach(src, "image/png", "screenshot");
        }
    }

    @AfterAll
    public static void afterAll(){
        System.out.println("This will run after all");
        WrapWebDriver.getInstance().quit();
    }

}
