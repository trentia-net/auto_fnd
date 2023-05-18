package PageObject;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

public class ProductCard {

    private SelenideElement linkName;

    ProductCard(SelenideElement element){
        this.linkName = element.$(By.cssSelector("h4.card-title > a"));
    }

    public SelenideElement getLinkName() {
        return linkName;
    }
}
