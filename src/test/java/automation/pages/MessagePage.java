package automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class MessagePage extends BasePage{
    @FindBy(xpath = "//span[.='Message']/span")
    public WebElement messageTab;
    @FindBy(id = "bx-b-mention-blogPostForm")
    public WebElement addMentionButton;
    @FindBy(xpath = "//a[contains(text(),'Employees and departments')]")
    public WebElement employeeDepartmentButton;
    @FindBy(xpath = "//div[@class='bx-finder-company-department-employee-name']")
    public List<WebElement> employeeUsernames;

    @FindBy(xpath = "//button[@id='blog-submit-button-save']")
    public WebElement sendButton;

    @FindBy(xpath = "//div[@class='feed-post-text-block-inner-inner']/a[contains(text(),\"cybertekschool\")]")
    public WebElement actualLinkVerification;
    @FindBy(xpath = "//span[@title='Link']")
    public WebElement linkButton;
    @FindBy(xpath = "//input[@id='linkidPostFormLHE_blogPostForm-text']")
    public WebElement inputText;
    @FindBy(xpath = "//input[@id='linkidPostFormLHE_blogPostForm-href']")
    public WebElement inputUrl;
    @FindBy(xpath = "//input[@value='Save']")
    public WebElement saveButton;
    @FindBy(xpath = "//div[@class='feed-post-text-block-inner-inner']/a")
    public WebElement actualLinkText;



}
