package pageobject.homepage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class HomePageImplementation {

    private WebDriver driver;
    private HomePage homePage;

    public HomePageImplementation(WebDriver driver){
        this.driver = driver;
        homePage = PageFactory.initElements(driver, HomePage.class);
    }

    public void goToSignUpLoginPage(){
        homePage.getSignUpLoginLink().click();
    }

    public void loadHomePage(){
        this.driver.get("https://automationexercise.com/");
    }

    public boolean logoutLinkIsDisplayed(){
        return homePage.getLogoutLink().isDisplayed();
    }

}
