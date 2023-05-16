package pageobject.homepage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

    @FindBy(css = "a[href='/login']")
    private WebElement SignUpLoginLink;

    public WebElement getSignUpLoginLink() {
        return SignUpLoginLink;
    }
}
