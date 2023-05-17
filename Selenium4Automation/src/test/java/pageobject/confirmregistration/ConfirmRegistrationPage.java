package pageobject.confirmregistration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ConfirmRegistrationPage {

    @FindBy(css = "h2[data-qa='account-created']")
    private WebElement title;

    @FindBy(css = "a[data-qa='continue-button']")
    private WebElement continueButton;

    public WebElement getTitle() {
        return title;
    }
    public WebElement getContinueButton() {
        return continueButton;
    }
}
