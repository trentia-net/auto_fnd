package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pageobject.confirmregistration.ConfirmRegistrationPage;
import pageobject.confirmregistration.ConfirmRegistrationPageImplementation;
import pageobject.homepage.HomePageImplementation;
import pageobject.registerpage.RegisterPageImplementation;
import utils.RemoveAdvertisement;
import utils.WaitUtils;
import utils.WrapWebDriver;

public class RegisterPageSteps {


    private WebDriver driver;
    private RegisterPageImplementation registerPageImplementation;
    private ConfirmRegistrationPageImplementation confirmRegistrationPageImplementation;
    private HomePageImplementation homePageImplementation;

    public RegisterPageSteps(){
        this.driver = WrapWebDriver.getInstance();
        this.registerPageImplementation = new RegisterPageImplementation(driver);
        this.confirmRegistrationPageImplementation = new ConfirmRegistrationPageImplementation(driver);
        this.homePageImplementation = new HomePageImplementation(driver);
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
    public void theEcommerceShouldBeShowTheRegisterConfirmationPage() throws InterruptedException {
        Assert.assertTrue(this.confirmRegistrationPageImplementation.titleIsDisplayed());
        this.confirmRegistrationPageImplementation.clickOnContinueButton();
        RemoveAdvertisement.closeDialogAdvertisement(this.driver);
        this.homePageImplementation.waitForLogoutLink();
        Assert.assertTrue(this.homePageImplementation.logoutLinkIsDisplayed());
        this.homePageImplementation.clickOnDeleteAccountLink();
    }
}
