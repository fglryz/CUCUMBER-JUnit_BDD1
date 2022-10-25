package automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PoolPage extends BasePage{


    @FindBy(xpath = "//span[.='Poll']/span")
    public WebElement poolTab;
    @FindBy(xpath = " //input[@id='question_0']")
    public WebElement QuestionBox;
    @FindBy(xpath = " //input[@id='answer_0__0_']")
    public WebElement answer1;
    @FindBy(xpath = " //input[@id='answer_0__1_']")
    public WebElement answer2;
    @FindBy(xpath = " //input[@id='answer_0__2_']")
    public WebElement answer3;
    @FindBy(xpath = " //input[@id='answer_0__3_']")
    public WebElement answer4;

    @FindBy(xpath = "(//iframe[@class='bx-editor-iframe'])[1]")
    public WebElement messagesIframe;

    @FindBy(xpath = "//body")
    public WebElement messagesInput;
    @FindBy(xpath = " //button[@id='blog-submit-button-save']")
    public WebElement sendButton;

    @FindBy(xpath = "//div[.='Automation Tester Interview Questions']")
    public WebElement poolVerification;



}



