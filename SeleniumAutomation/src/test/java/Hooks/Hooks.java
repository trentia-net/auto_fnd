package Hooks;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.codeborne.selenide.WebDriverRunner;

public class Hooks {

    @After
    public void takeScreenshotOnFailure(Scenario scenario){

        if (scenario.isFailed()){
            TakesScreenshot ts = (TakesScreenshot) WebDriverRunner.getWebDriver();
            byte[] src = ts.getScreenshotAs(OutputType.BYTES);
            scenario.attach(src, "image/png", "screenshot");
        }

    }

}
