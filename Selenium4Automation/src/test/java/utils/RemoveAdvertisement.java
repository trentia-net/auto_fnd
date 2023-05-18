package utils;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

public class RemoveAdvertisement {

    public static void closeBottomAdvertisement(WebDriver driver) throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("div.grippy-host")).click();
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.TAB).perform();
//        actions.clickAndHold(driver.findElement(By.tagName("svg")));
    }

    public static void closeDialogAdvertisement(WebDriver driver) throws InterruptedException {
        Thread.sleep(1000);
        WebElement frame1 = driver.findElement(By.id("aswift_1"));
        driver.switchTo().frame(frame1);
        WebElement frame2 = driver.findElement(By.id("ad_iframe"));
        driver.switchTo().frame(frame2);
        ((JavascriptExecutor)driver).executeScript("document.getElementById('dismiss-button').click()");
        driver.switchTo().defaultContent();
    }


}
