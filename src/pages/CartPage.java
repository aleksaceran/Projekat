package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends BasePage{
    
    public CartPage(WebDriver driver){
        super(driver);
    }
        By goAndEditCartPage = By.xpath("//a[@class='action viewcart']");
        By navToCartPage = By.xpath("//a[@class='action showcart']");
        
        By whatsNewElements = By.xpath("//a[@class='product-item-link']");                      
        By randomSizeOfItem = By.xpath("//div[@class='swatch-option text']");                   // MORAM SKLONITI ODAVDE LOKATORE AL ZASTO NE RADI ONDA ???
        By randomColorItem = By.xpath("//div[@aria-describedby='option-label-color-93']");
        By quantityOfItems = By.xpath("//input[@type='number']");


        public By getWhatsNewElements() {
            return whatsNewElements;
        }


        public void setWhatsNewElements(By whatsNewElements) {
            this.whatsNewElements = whatsNewElements;
        }


        public By getRandomSizeOfItem() {
            return randomSizeOfItem;
        }


        public void setRandomSizeOfItem(By randomSizeOfItem) {
            this.randomSizeOfItem = randomSizeOfItem;
        }


        public By getRandomColorItem() {
            return randomColorItem;
        }


        public void setRandomColorItem(By randomColorItem) {
            this.randomColorItem = randomColorItem;
        }


        public By getQuantityOfItems() {
            return quantityOfItems;
        }


        public void setQuantityOfItems(By quantityOfItems) {
            this.quantityOfItems = quantityOfItems;
        }


        public By getGoAndEditCartPage() {
            return goAndEditCartPage;
        }


        public void setGoAndEditCartPage(By goAndEditCartPage) {
            this.goAndEditCartPage = goAndEditCartPage;
        }


        public CartPage verifyNavCartPage(){
            clickElement(navToCartPage);
            clickElement(goAndEditCartPage);
            return this;

        }

        


            //a[@class='action viewcart']






}
