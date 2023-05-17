package pageobject.confirmregistration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ConfirmRegistrationPage {

    @FindBy(css = "h2[data-qa='account-created']")
    private WebElement title;

    public WebElement getTitle() {
        return title;
    }
}
