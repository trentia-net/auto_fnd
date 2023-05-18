package PageObject;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selenide.switchTo;

public class ProductDetailPageImplementation {

    private ProductDetailPage productDetailPage;

    public ProductDetailPageImplementation() {
        this.productDetailPage = new ProductDetailPage();
    }

    public void validateTitle(String text){
        this.productDetailPage.getTitle().shouldHave(Condition.exactText(text));
    }

    public void clickOnAddToCartButton(){
        this.productDetailPage.getAddToCartButton().click();
    }

    public void AcceptAlert(){
        switchTo().alert().accept();
    }
}
