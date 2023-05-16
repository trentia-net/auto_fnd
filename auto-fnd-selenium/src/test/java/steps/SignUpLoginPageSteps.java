package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pageobject.signuplogin.SignUpLoginPageImplementation;
import utils.WrapWebDriver;

public class SignUpLoginPageSteps {

    private WebDriver driver;
    private SignUpLoginPageImplementation sigUpLoginPageImplementation;

    public SignUpLoginPageSteps(){
        this.driver = WrapWebDriver.getInstance("chrome",false);
        this.sigUpLoginPageImplementation = new SignUpLoginPageImplementation(driver);
    }

    @When("^the user logs in with email \"(.*)\" and password \"(.*)\"$")
    public void theUserLogInWithCredentials(String email, String password) {
        this.sigUpLoginPageImplementation.fillLoginFields(email,password);
        this.sigUpLoginPageImplementation.clickOnLoginButton();
    }

    @Then("^the ecommerce should be show an error message: \"(.*)\"$")
    public void theECommerceShouldShowAnErrorMessage(String message){
        Assert.assertTrue(this.sigUpLoginPageImplementation.getTextMessage().equals(message));
    }

}
