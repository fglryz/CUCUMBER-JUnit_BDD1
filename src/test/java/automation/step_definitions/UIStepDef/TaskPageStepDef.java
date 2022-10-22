package automation.step_definitions.UIStepDef;

import automation.pages.TaskPage;
import automation.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

public class TaskPageStepDef {
    TaskPage taskPage = new TaskPage();

    @When("User clicks Task tab")
    public void userClicksTaskTab() {
        taskPage.TaskTab.click();
    }

    @When("User writes the task name on message box")
    public void userWritesTheTaskNameOnMessageBox() {
        taskPage.messageBox.sendKeys("CDP program");
    }

    @And("User clicks responsible person tab")
    public void userClicksResponsiblePersonTab() {
        BrowserUtils.sleep(10);
        taskPage.ResPersonBox.click();

    }

    @When("User adds Responsible Person")
    public void userAddsResponsiblePerson(String ResponsiblePerson) {


            try {
                for (WebElement each : taskPage.resPerson) {

                    if (each.getText().equalsIgnoreCase(ResponsiblePerson))
                        each.click();

                }
            } catch (StaleElementReferenceException e) {

            }


        }


    @When("User sets the deadline of task")
    public void userSetsTheDeadlineOfTask() {

    }
}