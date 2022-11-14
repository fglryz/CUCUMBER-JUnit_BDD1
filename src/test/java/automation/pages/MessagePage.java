package automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class MessagePage extends BasePage{

    @FindBy(xpath = "//span[.='Message']/span")
    public WebElement messagesTab;

    @FindBy(xpath = "//span[@id='bx-b-mention-blogPostForm']")
    public WebElement mentionButton;

    @FindBy(xpath = "//a[contains(@id,\"destDepartmentTab\")]")
    public WebElement employeesAndDepartmentsButton;

    @FindBy(xpath = "//div[@class='bx-finder-company-department-employee-name']")
    public List<WebElement> employeeUsernames;

    @FindBy(xpath = "//div[@class='feed-post-text-block-inner-inner']/a[contains(text(),\"cybertekschool\")]")
    public WebElement verifyMention;

    @FindBy(xpath = "(//iframe[@class='bx-editor-iframe'])[1]")
    public WebElement messagesIframe;

    @FindBy(xpath = "//body")
    public WebElement messagesInput;

    @FindBy(id = "blog-submit-button-save")
    public WebElement sendButton;






    @FindBy(xpath = "//span[@title='Insert video']")
    public WebElement insertVideoButton;

    @FindBy(xpath = "//input[@class='bxhtmled-90-input']")
    public WebElement videoInputBox;

    @FindBy(xpath = "//input[@class='adm-btn-save']")
    public WebElement videoSaveButton;

    @FindBy(xpath = "//body[text()]")
    public WebElement actualInputInMessagesBox;

    @FindBy(xpath = "//span[@title='Quote text']")
    public WebElement quoteTextButton;

    @FindBy(xpath = "//blockquote[@class='bxhtmled-quote']")
    public WebElement getQuoteTextRibbon;

    @FindBy(xpath = "//div[@class='blog-post-quote']//td")
    public WebElement actualQuote;

    @FindBy(xpath = "//span[@title='Add tag']")
    public WebElement addTagButton;

    @FindBy(xpath = "//input[@name='TAGS_blogPostForm']")
    public WebElement tagTextInput;

    @FindBy(xpath = "//span[@class='popup-window-button']")
    public WebElement tagAddButton;

    @FindBy(xpath = "//a[@class='feed-com-tag']")
    public WebElement actualTag;

    @FindBy(xpath = "(//span[@class='feed-add-post-del-but'])[2]")
    public WebElement tagDeleteButton;

    @FindBy(xpath = "//div[@class='feed-post-text-block']")
    public WebElement tagLocator;
}


