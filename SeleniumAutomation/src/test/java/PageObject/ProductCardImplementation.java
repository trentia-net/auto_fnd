package PageObject;

import com.codeborne.selenide.SelenideElement;

public class ProductCardImplementation {

    private ProductCard productCard;
    public ProductCardImplementation(SelenideElement element){
        this.productCard = new ProductCard(element);
    }

    public void clickOnLinkName(){
        this.productCard.getLinkName().click();
    }

    public String getLinkNameText(){
        return this.productCard.getLinkName().getText();
    }

}
