package automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogoutPage  extends BasePage{
    @FindBy(xpath ="//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a" )
    public WebElement logoutButton;

    @FindBy(xpath ="//h2[contains(text(),'Login to your account')]" )
    public WebElement loginToAccount;



}
