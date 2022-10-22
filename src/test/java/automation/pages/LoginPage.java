package automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    @FindBy(xpath = "//input[@name='USER_LOGIN']")
    public WebElement UserName;

    @FindBy(xpath = "//input[@name='USER_PASSWORD']")
    public WebElement Password;

    @FindBy(xpath = "//input[@class='login-btn']")
    public WebElement LoginInButton;
    @FindBy(id = "pagetitle")
    public WebElement PageTitle;
    @FindBy(xpath = "//div[@class='errortext']")
    public WebElement warningPage;





}
