package com.automation.step_definitions;


import com.automation.pages.LoginPage;
import com.automation.pages.MessagePage;
import com.automation.utilities.BrowserUtils;
import com.automation.utilities.ConfigurationReader;
import com.automation.utilities.Driver;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

public class messageStepDef  {
Faker faker=new Faker();
LoginPage loginPage=new LoginPage();
MessagePage messagePage=new MessagePage();
    @Given("User is on homepage")
    public void user_is_on_homepage() {

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        loginPage.inputUserName.sendKeys(ConfigurationReader.getProperty("username"));
        loginPage.inputPassword.sendKeys(ConfigurationReader.getProperty("password"));
        loginPage.logInButton.click();

    }

    @Given("User navigates to messages tab")
    public void userNavigatesToMessagesTab() {

        messagePage.messagesTab.click();
    }


    /**
     * Acceptance Criteria 1
     */
    @When("User clicks Add Mention button")
    public void userClicksAddMentionButton() {

        messagePage.mentionButton.click();

    }

    @And("User clicks Employee and departments tab")
    public void userClicksEmployeeAndDepartmentsTab() {

        messagePage.employeesAndDepartmentsButton.click();

    }

    @When("User clicks on Department Employee username")
    public void userClicksOnDepartmentEmployeeUsername(String employeeUsername) {

        try{
            for (WebElement each : messagePage.employeeUsernames) {

                if(each.getText().equalsIgnoreCase(employeeUsername))
                    each.click();

            }
        }
        catch (StaleElementReferenceException e){

        }

    }

    @Then("User sees mentioned Employee username on Activity Stream")
    public void userSeesMentionedEmployeeUsernameOnActivityStream(String employeeUsername) {

        BrowserUtils.sleep(2);
        String expectedResult = employeeUsername;
        String actualResult = messagePage.verifyMention.getText();
        Assert.assertEquals(expectedResult, actualResult);

    }


    /**
     * Acceptance Criteria 2
     */
    @When("User clicks Link button")
    public void userClicksLinkButton() {

        // basePage..click();
    }

    @When("User fills out the text box with {string} and link ribbon with {string}")
    public void userFillsOutTheTextBoxWithAndLinkRibbonWith(String text, String link) {

        messagePage.videoInputBox.sendKeys(text);
        messagePage.insertVideoButton.sendKeys(link);

    }

    @And("User clicks Save button")
    public void userClicksSaveButton() {
        messagePage.videoSaveButton.click();
    }

    @And("User clicks Send button at Messages Tab")
    public void userClicksSendButtonAtMessagesTab() {
        messagePage.sendButton.click();
    }

    @Then("User sees the {string} attached to a specific {string}")
    public void userSeesTheAttachedToASpecific(String link, String text) {

        BrowserUtils.sleep(5);
        Assert.assertEquals(text, messagePage.actualInputInMessagesBox.getText());
    }

    /**
     * Acceptance Criteria 3
     */
    @When("User clicks Insert Video button")
    public void userClicksInsertVideoButton() {

        messagePage.insertVideoButton.click();

    }

    @When("User enters {string} of the Video from {string}")
    public void userEntersOfTheVideoFrom(String url) {

        messagePage.videoInputBox.sendKeys(url);

    }

    @And("User clicks Save button at Video popup")
    public void userClicksSaveButtonAtVideoPopup() {

        messagePage.videoSaveButton.click();

    }

    @Then("User sees the video URL at Activity Stream")
    public void userSeesTheVideoURLAtActivityStream() {

        Driver.getDriver().switchTo().frame(messagePage.messagesIframe);
        Assert.assertTrue(messagePage.actualInputInMessagesBox.isDisplayed());

    }

    /**
     * Acceptance Criteria 4
     */
    @When("User clicks Quote Text button")
    public void userClicksQuoteTextButton() {

       messagePage.quoteTextButton.click();

    }

    @When("User enters a {string} in yellow quote ribbon")
    public void userEntersAInYellowQuoteRibbon(String quote) {

      Driver.getDriver().switchTo().frame(messagePage.messagesIframe);
     messagePage.getQuoteTextRibbon.sendKeys(quote);
       Driver.getDriver().switchTo().defaultContent();

    }

    @Then("User sees the {string} in Activity Stream")
    public void userSeesTheInActivityStream(String quote) {

        BrowserUtils.sleep(2);
        Assert.assertEquals(quote, messagePage.actualQuote.getText());

    }

    /**
     * Acceptance Criteria 5
     */
    @When("User clicks add tag button")
    public void userClicksAddTagButton() {

       messagePage.addTagButton.click();

    }

    @When("User enter a message input in message box")
    public void userEnterAMessageInputInMessageBox() {

      Driver.getDriver().switchTo().frame(messagePage.messagesIframe);
        messagePage.messagesInput.sendKeys(faker.chuckNorris().fact());
   Driver.getDriver().switchTo().defaultContent();


    }

    @When("User enters {string} in input box")
    public void userEntersInInputBox(String tag) {

       messagePage.tagTextInput.sendKeys(tag);

    }

    @And("User clicks add button")
    public void userClicksAddButton() {

       messagePage.tagAddButton.click();

    }

    @Then("User sees {string} in Activity Stream")
    public void userSeesInActivityStream(String tag) {

        BrowserUtils.sleep(2);
        Assert.assertEquals(tag,messagePage.actualTag.getText());

    }

    /**
     * Acceptance Criteria 6
     */
    @When("User clicks delete sign next to the tag")
    public void userClicksDeleteSignNextToTheTag() {

      messagePage.tagDeleteButton.click();

    }

    @Then("User removes the {string}")
    public void userRemovesThe(String tag) {

        BrowserUtils.sleep(2);
        Assert.assertFalse(messagePage.tagLocator.getText().contains(tag));

    }
}
