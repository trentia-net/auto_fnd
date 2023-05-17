package pageobject.confirmregistration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


public class ConfirmRegistrationPageImplementation {

    private final WebDriver driver;

    private ConfirmRegistrationPage confirmRegistrationPage;

    public ConfirmRegistrationPageImplementation(WebDriver driver){
        this.driver = driver;
        confirmRegistrationPage = PageFactory.initElements(driver, ConfirmRegistrationPage.class);
    }

    public boolean titleIsDisplayed(){
        return this.confirmRegistrationPage.getTitle().isDisplayed();
    }

}
