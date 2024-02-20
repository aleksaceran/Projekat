package pages;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductDetailsPage extends BasePage{
    public ProductDetailsPage(WebDriver driver){
        super(driver);
    }


        By addToCartFromDetailsPage = By.xpath("//button[@id='product-addtocart-button']");
        By whatsNewElements = By.xpath("//a[@class='product-item-link']");

        By randomSizeOfItem = By.xpath("//div[@class='swatch-option text']");
        By randomColorItem = By.xpath("//div[@aria-describedby='option-label-color-93']");
        By quantityOfItems = By.xpath("//input[@id='qty']");


    public ProductDetailsPage addToCartFromDetailPageFunction(){
        clickElement(addToCartFromDetailsPage);
        return this;
    }
    public void clickOnRandomSizeOnProductDetailsPage(By randomSizeOfItem){
            waitElementsToBeVisible(randomSizeOfItem);
            List <WebElement> list =  driver.findElements(randomSizeOfItem);
            int randomIndex = new Random().nextInt(list.size());    
            list.get(randomIndex).click();
}
    public void clickOnRandomColorOnProductDetailsPage(By randomColorItem){
        waitElementsToBeVisible(randomColorItem);
        List <WebElement> list =  driver.findElements(randomColorItem);
        int randomIndex = new Random().nextInt(list.size());
        list.get(randomIndex).click();
}
    public void enterQuantityOnDetailsPage(){
        enterText(quantityOfItems, "3");
    }
    public void addingAnItemToCart(){
        clickElement(addToCartFromDetailsPage);


    }

}