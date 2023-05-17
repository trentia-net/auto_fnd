package pageobject.homepage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import utils.RemoveAdvertisement;
import utils.WaitUtils;

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

    public void clickOnLogoutLink() {
        homePage.getLogoutLink().click();
    }

    public void clickOnDeleteAccountLink(){
        homePage.getDeleteAccountLink().click();
    }

    public void waitForLogoutLink(){
        WaitUtils wait = new WaitUtils(this.driver);
        wait.waitUntilVisible(10,this.homePage.getLogoutLink());
    }
}
