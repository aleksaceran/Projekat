package tests;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTests {
    public WebDriver driver;
    
    //String validUsername = "standard_user";
    //String validPassword = "secret_sauce";



    @Before
    public void setUp(){

        driver = new FirefoxDriver();
        driver.manage().window().maximize();                //   STAVKA 1 PT. 1
    }

    @After
    public void tearDown(){
        driver.quit();
    }
}
