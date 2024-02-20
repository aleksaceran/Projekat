package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage{
    
    public HomePage(WebDriver driver){
        super(driver);
    }


    //   //a[@class='product-item-link']  WHATS NEW ITEMS LOCATOR 1/4


    By createAnAccountButton = By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[3]/a");                       //                      ?????
    By signInButton = By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[2]/a");                                //                      ?????
    By expectedPageTitleBy = By.cssSelector("ul.header:nth-child(2) > li:nth-child(1) > span:nth-child(1)");         // KORISTICEMO ZA VERIFIKACIJU LOGOVANJA
    By whatsNewNav = By.xpath("//*[@id='ui-id-3']");
    
    By welcomeMessageDropdownMenu = By.xpath("(//button[@class='action switch'])[1]");
    By signOutButton  = By.xpath("(//li[@data-label='or'])[1]");

    String expectedPageTitle = "Welcome, Aleksa Ceran!";
    String baseUrl = "https://magento.softwaretestingboard.com";                        //  STAVKA 1 PT. 2


    By hotSellersItemCount = By.xpath("//a[@class='product-item-link']");
    int excpectedHotSellerItems = 6;
    public HomePage goToHomePage(){
        driver.get(baseUrl);
        return this;
    }
    public HomePage navToCreateAccountPage(){
        clickElement(createAnAccountButton);
        return this;
    }
    public HomePage navToSignIn(){
        clickElement(signInButton);
        return this;
    }

    public HomePage verifySuccessfulLogin(){
        String actualPageTitle = readText(expectedPageTitleBy);
        verifyTextIsTheSame(expectedPageTitle, actualPageTitle);
        return this;
    }
    public HomePage navToWhatsNewPage(){
        clickElement(whatsNewNav);


        return this;
    }
    public HomePage logout(){
        clickElement(welcomeMessageDropdownMenu);
        waitElementToBeVisible(signOutButton);
        clickElement(signOutButton);

        return this;
    }

    public HomePage countProducts(){
        java.util.List<WebElement> productList = driver.findElements(hotSellersItemCount);
        int actualProductCount = productList.size();
        verifyNumberOfElements(excpectedHotSellerItems, actualProductCount);
        return this;

}
    
}
