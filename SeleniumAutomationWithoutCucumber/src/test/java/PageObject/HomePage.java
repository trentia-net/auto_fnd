package PageObject;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.util.List;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class HomePage {


    private SelenideElement cartLink;
    private final List<SelenideElement> cards;

    public HomePage(){
        cards = $$(By.cssSelector(".card"));
        cartLink = $(By.id("cartur"));
    }

    public List<SelenideElement> getCards() {
        return cards;
    }

    public SelenideElement getCartLink() {
        return cartLink;
    }
}
