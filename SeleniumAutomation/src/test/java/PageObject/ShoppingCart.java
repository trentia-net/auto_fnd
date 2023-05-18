package PageObject;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.util.List;

import static com.codeborne.selenide.Selenide.$$;

public class ShoppingCart {

    private List<SelenideElement> products;

    public ShoppingCart(){
        this.products = $$(By.cssSelector("div.table-responsive tr.success"));
    }

    public List<SelenideElement> getProducts() {
        return products;
    }
}
