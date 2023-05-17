package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pageobject.homepage.HomePageImplementation;
import pageobject.signuplogin.SignUpLoginPageImplementation;
import utils.WrapWebDriver;

public class HomePageSteps {

    private WebDriver driver;
    private HomePageImplementation homePageImplementation;
    private SignUpLoginPageImplementation sigUpLoginPageImplementation;

    public HomePageSteps(){
        this.driver = WrapWebDriver.getInstance("chrome",false);
        this.homePageImplementation = new HomePageImplementation(driver);
    }

    @Given("^the user is on the home page$")
    public void theUserIsOnTheHomePage(){
        this.homePageImplementation.loadHomePage();
    }

    @Given("^the user goes to the login page$")
    public void theUserGoesToTheLoginPage(){
        this.homePageImplementation.goToSignUpLoginPage();
    }

    @Then("^the ecommerce should show the logout link on the top bar$")
    public void theECommerceShouldShowTheLogoutLinkOnTheTopBar() {
        Assert.assertTrue(this.homePageImplementation.logoutLinkIsDisplayed());
    }

}
