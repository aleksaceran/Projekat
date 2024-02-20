package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage extends BasePage{
    
    public CheckoutPage(WebDriver driver){
        super(driver);
    }
        By navToCheckoutPageFromHomePage = By.xpath("//button[@id='top-cart-btn-checkout']");
        By goAndEditCartPage = By.xpath("//a[@class='action viewcart']");
        By navToCartPage = By.xpath("//a[@class='action showcart']");
        By numberOfItemsToBeVisible = By.xpath("//span[@class='counter qty']");
        
        By shippingAddressPageTitle = By.xpath("//*[@data-bind=\"i18n: 'Shipping Address'\"]");
        String expectedCheckoutPageTitle = "Shipping Address";

        By companyNameInput = By.xpath("//input[@name='company']");
        By streetAdressInput = By.xpath("//input[@name='street[0]']");
        By cityNameInput = By.xpath("//input[@name='city']");
        By zipcodeInput = By.xpath("//input[@name='postcode']");
        By phoneNumberInput = By.xpath("//input[@name='telephone']");

        By stateProvince = By.xpath("//select[@id='HY2FC2F']");
        By country = By.xpath("//select[@name='country_id']");

        By nextButton = By.xpath("//button[@class='button action continue primary']");
        By placeOrderButton = By.xpath("//button[@class='action primary checkout']");

        By cartSubtotal = By.xpath("//span[@data-th='Cart Subtotal']");
        By shippingFlatRateFixed = By.xpath("//span[@data-th='Shipping']");
        By orderTotal = By.xpath("//td[@data-th='Order Total']");

        By addNewAddressButton = By.xpath("//button[@class='action action-show-popup']");

        By saveAddress = By.xpath("//input[@id='shipping-save-in-address-book']");
        By shipHereButton = By.xpath("//button[@class='action primary action-save-address']");
        

    public CheckoutPage verifyCheckoutPage(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }   
        clickElement(numberOfItemsToBeVisible);
        
        waitElementToBeVisible(navToCheckoutPageFromHomePage);
        clickElement(navToCheckoutPageFromHomePage);

        
        return this;
    }

    public CheckoutPage verifyNavCheckoutPage(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }   
        String actualPageTitle = readText(shippingAddressPageTitle);
        verifyTextIsTheSame(expectedCheckoutPageTitle, actualPageTitle);


        return this;
    }    
    public CheckoutPage informationInput(String companyName, String streetAdress, String cityName, String zipcodeNumber, String phoneNumber){

        enterText(companyNameInput, companyName);
        enterText(streetAdressInput, streetAdress);
        enterText(cityNameInput, cityName);
        enterText(zipcodeInput, zipcodeNumber);
        enterText(phoneNumberInput, phoneNumber);

        return this;
    }
    

    public CheckoutPage popUpCountrySortValueDropdown(String sortValue){
        selectOptionByValue(country, sortValue);
        return this;
    }

    public CheckoutPage sortValueState(String sortValue){
        selectOptionByValue(stateProvince, sortValue);
        return this;
    }
    public CheckoutPage sortValueCountry(String sortValue){
        selectOptionByValue(country, sortValue);
        return this;
    }

    
    public CheckoutPage finishPurchase(){
        clickElement(placeOrderButton);


        return this;
    }    

    public CheckoutPage verifyPriceAndTax(){
            String priceText = readText(cartSubtotal).substring(1);
            double actualPrice = convertTextToNumber(priceText);
            String taxText = readText(shippingFlatRateFixed).substring(1);
            double actualTax = convertTextToNumber(taxText);
            String totalText = readText(orderTotal).substring(1);
            double totalCheckoutPrice = convertTextToNumber(totalText);
    
            verifyPrice(actualPrice + actualTax, totalCheckoutPrice);
            return this;
    }

    public CheckoutPage navToReviewAndPayments(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }  
        clickElement(nextButton);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }  

        return this;
    }
    public CheckoutPage addNewAddress(){
        clickElement(addNewAddressButton);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }  
        return this;
    }
        public CheckoutPage dontSaveAddress(){
            waitElementToBeVisible(saveAddress);
            clickElement(saveAddress);
            return this;
        }


}
