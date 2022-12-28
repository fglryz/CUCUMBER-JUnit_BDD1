package com.automation.step_definitions;


import com.automation.pages.TaskPage;
import com.automation.utilities.BrowserUtils;
import com.automation.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class TaskPageStepDef {
    TaskPage taskPage = new TaskPage();
    Actions actions=new Actions(Driver.getDriver());

    @When("User clicks Task tab")
    public void userClicksTaskTab() {
        taskPage.TaskTab.click();
    }
    @When("User cleans responsible person box")
    public void userCleansResponsiblePersonBox() {
        taskPage.deleteSignButton.click();

    }
    @When("User chooses on Responsible Person")
    public void userChoosesOnResponsiblePerson(String ResponsiblePeople) {
        try {
            for (WebElement each :taskPage.resPerson) {

                if (each.getText().equalsIgnoreCase(ResponsiblePeople))
                    each.click();

            }
        } catch (StaleElementReferenceException e) {

        }
        taskPage.dltButton.click();
    }
    @When("User clicks the deadline box")
    public void userClicksTheDeadlineBox() {
        taskPage.deadlineBox.click();
    }
    @When("User select day and click")
    public void userSelectDayAndClick() {
        taskPage.day.click();
    }
    @When("User click the select button")
    public void userClickTheSelectButton() {
        taskPage.selectButton.click();
    }
    @When("User writes the {string} on message box")
    public void userWritesTheOnMessageBox(String name) {

        taskPage.messageBox.sendKeys("CPD");


    }
    @Then("User sees the {string} window")
    public void userSeesTheWindow(String title) {

       // String expectedResult="Task has been created";
       // Assert.assertEquals(expectedResult,title);
        Assert.assertTrue(taskPage.verificationText.isDisplayed());
    }
    @When("Users clicks time planning text")
    public void usersClicksTimePlanningText() {
        taskPage.timePlaningButton.click();
    }



    @When("User clicks  start task on tag")
    public void userClicksStartTaskOnTag() {
    taskPage.startTaskButton.click();
    }


    @When("User select {string} and click")
    public void userSelectAndClick(String day) {
        taskPage.startDay.click();
    }

    @When("User clicks  finish task on tag")
    public void userClicksFinishTaskOnTag() {
    taskPage.finishTaskButton.click();


    }

    @When("User select finish day and click")
    public void userSelectFinishDayAndClick() {
        taskPage.finishDay.click();
    }

    @When("Users clicks Options text")
    public void usersClicksOptionsText() {
        taskPage.optionButton.click();
    }

    @When("User choses first radio button and click")
    public void userChosesFirstRadioButtonAndClick() {
        taskPage.firstCheckBox.click();
    }

    @When("User chooses third radio button and click")
    public void userChoosesThirdRadioButtonAndClick() {
        taskPage.thirdCheckBox.click();
    }




    @When("User clicks Participant buttons")
    public void userClicksParticipantButtons() {
        taskPage.participantsButton.click();
    }
    @When("User clicks  add button on Participant text")
    public void userClicksAddButtonOnParticipantText() {
        taskPage.addButton.click();
    }

    @When("User chooses on Participants")
    public void userChoosesOnParticipants(String participants) {
        try {
            for (WebElement each : taskPage.ParticipantsName) {

                if (each.getText().equalsIgnoreCase(participants))
                    each.click();

            }
        } catch (StaleElementReferenceException e) {

        }

    }


    @When("User chooses on {string}")
    public void userChoosesOn(String participants) {
        try {
            for (WebElement each : taskPage.ParticipantsName) {

                if (each.getText().equalsIgnoreCase(participants))
                    each.click();

            }
        } catch (StaleElementReferenceException e) {

        }

    }



    @When("Users closes Pop Up Window")
    public void usersClosesPopUpWindow() {
        taskPage.popupWindowClose.click();
    }
    @When("User adds more button")
    public void userAddsMoreButton() {
        taskPage.addMoreButton.click();
    }

    @When("User clicks observer tab")
    public void userClicksObserverTab() {
        taskPage.observersButton.click();
    }
    @When("User chooses on Observers")
    public void userChoosesOnObservers(String observers) {
        try {
            for (WebElement each : taskPage.ObserversName) {

                if (each.getText().equalsIgnoreCase(observers))
                    each.click();

            }
        } catch (StaleElementReferenceException e) {

        }


    }

    @When("User  blanks  message box")
    public void userBlanksMessageBox() {
        taskPage.messageBox.sendKeys(" ");
    }

    @Then("User sees the  warning text {string}")
    public void userSeesTheWarningText(String warningMessage) {
        Assert.assertTrue(taskPage.errorMessage.isDisplayed());
    }


}