package pageobject.homepage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

    @FindBy(css = "a[href='/login']")
    private WebElement signUpLoginLink;

    @FindBy(css = "a[href='/logout']")
    private WebElement logoutLink;

    @FindBy(css = "a[href='/delete_account']")
    private WebElement deleteAccountLink;

    public WebElement getSignUpLoginLink() {
        return signUpLoginLink;
    }

    public WebElement getLogoutLink() {
        return logoutLink;
    }

    public WebElement getDeleteAccountLink() {
        return deleteAccountLink;
    }
}
