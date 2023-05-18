package PageObject;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class ProductDetailPage {

    private SelenideElement title;

    private SelenideElement AddToCartButton;

    public ProductDetailPage(){
        this.title = $(By.cssSelector("h2.name"));
        this.AddToCartButton = $(By.cssSelector("a.btn"));
    }

    public SelenideElement getTitle() {
        return title;
    }

    public SelenideElement getAddToCartButton() {
        return AddToCartButton;
    }
}
