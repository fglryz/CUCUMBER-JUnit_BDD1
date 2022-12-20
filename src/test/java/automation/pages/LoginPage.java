package automation.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoginPage extends BasePage {

    @FindBy(css = ".errortext")
    public WebElement errorMessage;

    @FindBy(css = "a[title~='Stream'] .menu-item-link-text")
    public WebElement VerificationActiveStream;

    @FindBy(xpath = "//input[@type='text']")
    public WebElement inputUserName;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement inputPassword;

    @FindBy(css = ".login-btn")
    public WebElement logInButton;

    @FindBy(id = "USER_REMEMBER")
    public WebElement RememberLink;

    @FindBy(css = ".login-link-forgot-pass")
    public WebElement ForgotPassword;


}
