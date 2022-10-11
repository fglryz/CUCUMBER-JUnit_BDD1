package automation.pages;

import automation.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    public BasePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

   //@FindBy(xpath = "//a[@href='/api_list']")
   // public WebElement APITestingButton;
    //@FindBy(xpath = "//*[@id=\"form\"]/div/div[2]/div/div[1]/h4/a/u")
   //public WebElement API1Button;
   // @FindBy(xpath = "//*[@id=\"collapse1\"]/ul/li[1]/a")
    //public WebElement APIUrl;
}
