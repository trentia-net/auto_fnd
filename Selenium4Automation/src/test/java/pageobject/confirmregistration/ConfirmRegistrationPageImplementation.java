package pageobject.confirmregistration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


public class ConfirmRegistrationPageImplementation {

    private ConfirmRegistrationPage confirmRegistrationPage;

    public ConfirmRegistrationPageImplementation(WebDriver driver){
        confirmRegistrationPage = PageFactory.initElements(driver, ConfirmRegistrationPage.class);
    }

    public boolean titleIsDisplayed(){
        return this.confirmRegistrationPage.getTitle().isDisplayed();
    }

    public void clickOnContinueButton(){
        this.confirmRegistrationPage.getContinueButton().click();
    }

}
