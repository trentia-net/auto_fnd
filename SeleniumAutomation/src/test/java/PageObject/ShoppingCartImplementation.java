package PageObject;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.util.List;

public class ShoppingCartImplementation {

    private ShoppingCart shoppingCart;
    public ShoppingCartImplementation(){
        this.shoppingCart = new ShoppingCart();
    }

    public void validateProductsAddedOnTheShoppingCart(List<String> productNames){
        for (int index = 0; index < productNames.size() ; index++) {
            SelenideElement product = this.shoppingCart.getProducts().get(index);
            //EL nombre del producto esta en el segundo td del tr
            product.$(By.cssSelector("td:nth-child(2)")).shouldHave(Condition.exactText(productNames.get(index)));
        }

    }

}
