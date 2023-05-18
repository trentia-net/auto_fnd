package com.trentia.autofnd.selenide;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:features/",
        glue = "com.trentia.autofnd.selenide.Steps"
)
public class RunCucumberTest {

}
