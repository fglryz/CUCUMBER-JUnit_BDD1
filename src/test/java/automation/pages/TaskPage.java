package automation.pages;

import org.apache.poi.ss.usermodel.DataFormat;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.List;

public class TaskPage extends BasePage{
    @FindBy(xpath = "//div[@class='bx-finder-box-item-t7-name']")
    public List<WebElement> resPerson;

    @FindBy(xpath = "//span[@class='bx-finder-groupbox-name']")
    public List<WebElement> createdByNames;

    @FindBy(xpath = "//div[@class='bx-finder-box-item-t7-name']")
    public List<WebElement> ParticipantsName;

    @FindBy(xpath = "//span[@class='bx-finder-groupbox-name']")
    public List<WebElement> ObserversName;

    @FindBy(xpath = "//span[@id='feed-add-post-form-tab-tasks']/span")
    public WebElement TaskTab;
    @FindBy(xpath = "(//span[@title='Cancel selection'])[1]")
    public WebElement CancelSelectionSign;

    @FindBy(xpath = "//input[@data-bx-id='task-edit-title']")
    public WebElement messageBox;

    @FindBy(xpath = "//span[@id='feed-add-post-form-tab-tasks']/span")
    public  WebElement responsiblePerson;
    @FindBy(xpath = "//div[@id='bx-component-scope-lifefeed_task_form-responsible']/span/span/span")
    public  WebElement deleteSignButton;

    @FindBy(xpath = "//span[@class='popup-window-close-icon']")
    public  WebElement dltButton;

    @FindBy(xpath = "//input[@class='task-options-inp']")
    public  WebElement deadlineBox;
    @FindBy(xpath = "//a[.='31']")
    public WebElement day;
    @FindBy(xpath = "//span[.='Select']")
    public  WebElement selectButton;
    @FindBy(xpath = "//span[.='Time planning']")
    public  WebElement timePlaningButton;
    @FindBy(xpath = "//span[.='Options']")
    public  WebElement optionButton;
    @FindBy(xpath = "(//input[@type='checkbox'])[15]")
    public  WebElement firstCheckBox;
    @FindBy(xpath = "(//input[@type='checkbox'])[17]")
    public  WebElement thirdCheckBox;

    @FindBy(xpath = "(//input[@class='task-options-inp'])[2]")
    public  WebElement startTaskButton;
    @FindBy(xpath = "(//input[@class='task-options-inp'])[4]")
    public  WebElement finishTaskButton;
    @FindBy(xpath = "//div[@class='bx-calendar-range']/a[2]")
    public  WebElement startDay;
    @FindBy(xpath = "//div[@class='bx-calendar-range']/a[3]")
    public  WebElement finishDay;
    @FindBy(xpath = "//*[@id=\"bx-component-scope-lifefeed_task_form-accomplice\"]/span[2]/a[2]")
    public  WebElement addButton;
    @FindBy(xpath = "//span[@class='popup-window-close-icon']")
    public  WebElement popupWindowClose;
    @FindBy(xpath = "//*[@id=\"bx-component-scope-lifefeed_task_form-accomplice\"]/span[2]/a[1]")
    public  WebElement addMoreButton;
    @FindBy(xpath = "//div[@class='task-message-label error']")
    public  WebElement errorMessage;
    @FindBy(css = "[class='bx-calendar-cell']")

    public List<WebElement> calendarWeekDays;

    public WebElement addTaskDayCalendar(){
        Calendar calendar=Calendar.getInstance();
        DateFormat dateFormat=new SimpleDateFormat("dd");
        String today=dateFormat.format(calendar.getTime());//today
        calendar.add(Calendar.DATE,1);//one day later
        String tomorrow=dateFormat.format(calendar.getTime());
        WebElement expectedDay=null;

        for (WebElement day:calendarWeekDays){
            if(day.getText().equalsIgnoreCase(tomorrow))
                expectedDay=day;

            }
        return expectedDay;


    }

    @FindBy(xpath = " (//input[@class='bx-calendar-form-input'])[1]")
    public WebElement timeHours;

    public int addTaskHours(){
        int hour= LocalTime.now().getHour();
        hour=(hour>=12)? hour -=12 : hour;
        return  hour;

    }
    @FindBy(xpath = " (//input[@class='bx-calendar-form-input'])[2]")
    public WebElement minuteHours;

    public int addTaskMinute(){
        int minutes= LocalTime.now().getHour();
        minutes=(minutes>=59)? minutes -=59 : minutes;
        return  minutes;

    }



    @FindBy(xpath = "//div[.='Task has been created']")
    public  WebElement verificationText;

    @FindBy(xpath = "(//span[contains(text(),'Created by')])[1]")
    public WebElement createdByButton;
    @FindBy(xpath = "(//span[contains(text(),'Participants')])[1]")
    public WebElement participantsButton;
    @FindBy(xpath = "(//span[contains(text(),'Observers')])[1]")
    public WebElement observersButton;
}
