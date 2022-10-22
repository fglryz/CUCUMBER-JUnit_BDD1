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
    @FindBy(xpath = "//a[contains(text(),'helpdesk22@cybertekschool.com')]")
    public WebElement mentionVerification;



}
