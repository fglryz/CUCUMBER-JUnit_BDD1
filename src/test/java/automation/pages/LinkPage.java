package automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LinkPage extends BasePage{
     @FindBy(xpath = "//span[@title=\'Link\']")
    public WebElement linkButton;
    @FindBy(id = "linkidPostFormLHE_blogPostForm-text")
    public WebElement textRibbon;
    @FindBy(id = "linkidPostFormLHE_blogPostForm-href")
    public WebElement linkRibbon;
    @FindBy(id = "undefined")
    public WebElement saveButton;
    @FindBy(xpath = "//span[@title=\'Link\']")
    public WebElement linkVerification;

//a[contains(text(),'how to use jira')]



}
