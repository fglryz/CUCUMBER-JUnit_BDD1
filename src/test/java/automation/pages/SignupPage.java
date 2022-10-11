package automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignupPage extends BasePage {
    @FindBy(xpath = "//a[@href='/login']")
    public WebElement signupButton;
    @FindBy(xpath = "//input[@name='name']")
    public WebElement Name;
    @FindBy(xpath = "(//input[@name='email'])[2]")
    public WebElement EmailAddress;
    @FindBy(xpath = "//button[contains(text(),'Signup')]")
    public WebElement signUp;
    @FindBy(xpath = "//*[@id=\"form\"]/div/div/div/div/h2/b")
    public WebElement accountInformation;
    @FindBy(xpath = "((//input[@name='email'])[1])")
    public WebElement LoginEmailAddress;
    @FindBy(xpath = "//input[@name='password']")
    public WebElement password;
    @FindBy(xpath = "//button[contains(text(),'Login')]")
    public WebElement login;
    @FindBy(xpath = "//p[contains(text(),'Email Address already exist!')]")
    public WebElement errorMessage;











}
