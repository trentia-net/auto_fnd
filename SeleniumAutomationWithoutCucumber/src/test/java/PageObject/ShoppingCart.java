package PageObject;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.util.List;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class ShoppingCart {


    private SelenideElement table;
    private List<SelenideElement> products;

    public ShoppingCart(){
        this.table = $(By.id("tbodyid"));
        this.products = $$(By.cssSelector("div.table-responsive tr.success"));
    }

    public List<SelenideElement> getProducts() {
        return products;
    }

    public SelenideElement getTable() {
        return table;
    }
}
