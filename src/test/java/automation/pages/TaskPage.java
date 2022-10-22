package automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class TaskPage extends BasePage{
    @FindBy(xpath = "//span[@class='bx-finder-groupbox-name']")
    public List<WebElement> resPerson;

    @FindBy(xpath = "//span[@class='bx-finder-groupbox-name']")
    public List<WebElement> createdByNames;

    @FindBy(xpath = "//span[@class='bx-finder-groupbox-name']")
    public List<WebElement> ParticipantsName;

    @FindBy(xpath = "//span[@class='bx-finder-groupbox-name']")
    public List<WebElement> ObserversName;

    @FindBy(xpath = "//span[.='Task']/span")
    public WebElement TaskTab;
    @FindBy(xpath = "//input[@type='text']")
    public WebElement messageBox;

    @FindBy(xpath = "(//span[@class='task-form-field-controls'])[1]")
    public WebElement ResPersonBox;



    @FindBy(id = "name-selector-140089192")
    public  WebElement responsiblePerson;
    @FindBy(xpath = "(//span[contains(text(),'Created by')])[1]")
    public WebElement createdByButton;
    @FindBy(xpath = "(//span[contains(text(),'Participants')])[1]")
    public WebElement participantsButton;
    @FindBy(xpath = "(//span[contains(text(),'Observers')])[1]")
    public WebElement observersButton;
}
