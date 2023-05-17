package pageobject.registerpage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage {

    //cssSelector > means the next element is a direct child
    @FindBy(css = "div.login-form > h2")
    private WebElement titleAccountInformation;

    public WebElement getTitleAccountInformation() {
        return titleAccountInformation;
    }
}
