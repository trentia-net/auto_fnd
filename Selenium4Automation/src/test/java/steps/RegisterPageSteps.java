package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pageobject.confirmregistration.ConfirmRegistrationPage;
import pageobject.confirmregistration.ConfirmRegistrationPageImplementation;
import pageobject.registerpage.RegisterPageImplementation;
import utils.WrapWebDriver;

public class RegisterPageSteps {

    private RegisterPageImplementation registerPageImplementation;
    private ConfirmRegistrationPageImplementation confirmRegistrationPageImplementation;

    public RegisterPageSteps(){
        WebDriver driver = WrapWebDriver.getInstance("firefox", false);
        this.registerPageImplementation = new RegisterPageImplementation(driver);
        this.confirmRegistrationPageImplementation = new ConfirmRegistrationPageImplementation(driver);
    }

    @And("^the user fills the profile form$")
    public void theUserFillsTheProfileForm() {
        this.registerPageImplementation.fillsRegisterForm();
    }

    @And("^the user clicks on the create account button$")
    public void theUserClicksOnTheCreateAccountButton() {
        this.registerPageImplementation.clickOnCreateAccountButton();
    }

    @Then("^the ecommerce should be show the register confirmation page$")
    public void theEcommerceShouldBeShowTheRegisterConfirmationPage() {
        Assert.assertTrue(this.confirmRegistrationPageImplementation.titleIsDisplayed());
    }
}
