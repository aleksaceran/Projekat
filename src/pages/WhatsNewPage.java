package pages;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WhatsNewPage extends BasePage{
    
    public WhatsNewPage(WebDriver driver){
        super(driver);
    }
    By productsFromWhatsNewPage = By.xpath("//a[@class='product-item-link']");
    By addToCartFromWhatsNew = By.xpath("//button[@class='action tocart primary']");              
    By addToCartFromDetailsPage = By.xpath("//button[@id='product-addtocart-button']");


    public void clickOnRandomElementFromList(By productsFromWhatsNewPage){
            waitElementsToBeVisible(productsFromWhatsNewPage);
            List <WebElement> list =  driver.findElements(productsFromWhatsNewPage);
            int randomIndex = new Random().nextInt(list.size());
            list.get(randomIndex).click();
}
    


}
