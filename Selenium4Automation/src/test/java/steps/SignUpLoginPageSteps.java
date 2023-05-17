package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pageobject.registerpage.RegisterPageImplementation;
import pageobject.signuplogin.SignUpLoginPageImplementation;
import utils.WrapWebDriver;

public class SignUpLoginPageSteps {

    private WebDriver driver;
    private SignUpLoginPageImplementation sigUpLoginPageImplementation;
    private RegisterPageImplementation registerPageImplementation;

    public SignUpLoginPageSteps(){
        this.driver = WrapWebDriver.getInstance("chrome",false);
        this.sigUpLoginPageImplementation = new SignUpLoginPageImplementation(driver);
        this.registerPageImplementation = new RegisterPageImplementation(driver);
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

    //Arguments without Regex expressions
    @When("the user completes the name {string} and email {string} on the sign up section")
    public void theUserCompletesTheNameAndEmailOnTheSignUpSection(String name, String email) {
        this.sigUpLoginPageImplementation.fillSignUpFields(name, email);
    }

    @And("^the user goes to the sign up page$")
    public void theUserGoesToTheSignUpPage() {
        this.sigUpLoginPageImplementation.clickOnSignUpButton();
        Assert.assertTrue(this.registerPageImplementation.titleAccountInformationIsDisplayed());
    }
}
