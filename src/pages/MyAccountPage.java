package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyAccountPage extends BasePage{
    
    public MyAccountPage(WebDriver driver){
        super(driver);
    }

    By whatsNewButton = By.xpath("//a[@id='ui-id-3']");

    public MyAccountPage navToHomePageFromMyAccountPage(){
        clickElement(whatsNewButton);
        return this;

        }
    


}
