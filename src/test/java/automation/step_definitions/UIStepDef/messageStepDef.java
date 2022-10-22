package automation.step_definitions.UIStepDef;

import automation.pages.LinkPage;
import automation.pages.LoginPage;
import automation.pages.MessagePage;
import automation.utilities.BrowserUtils;
import automation.utilities.ConfigurationReader;
import automation.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

public class messageStepDef {
    MessagePage messagePage = new MessagePage();
    LoginPage loginPage = new LoginPage();
    LinkPage linkPage=new LinkPage();

    @Given("User is on homepage")
    public void user_is_on_homepage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("Url"));
        loginPage.UserName.sendKeys(ConfigurationReader.getProperty("username"));
        loginPage.Password.sendKeys(ConfigurationReader.getProperty("password"));
        loginPage.LoginInButton.click();

    }
    @Given("User navigates to messages tab")
    public void user_navigates_to_messages_tab() {
        messagePage.messageTab.click();
    }
    @When("User clicks Add Mention button")
    public void userClicksAddMentionButton() {
        messagePage.addMentionButton.click();

    }
    @And("User clicks Employee and departments tab")
    public void userClicksEmployeeAndDepartmentsTab() {

        messagePage.employeeDepartmentButton.click();
    }
    @When("User clicks on Department Employee username")
    public void userClicksOnDepartmentEmployeeUsername(String employeeUserName) {

        try {
            for (WebElement each : messagePage.employeeUsernames) {

                if (each.getText().equalsIgnoreCase(employeeUserName))
                    each.click();

            }
        } catch (StaleElementReferenceException e) {

        }
    }
    @When("User clicks Send button at Messages Tab")
    public void userClicksSendButtonAtMessagesTab() {
        messagePage.sendButton.click();

    }
    @Then("User sees mentioned Employee username on Activity Stream")
    public void userSeesMentionedEmployeeUsernameOnActivityStream(String employeeUserName) {
        BrowserUtils.sleep(5);
        String actualResult=messagePage.mentionVerification.getText();;
        String expectedResult=employeeUserName;
        Assert.assertEquals(actualResult,expectedResult);

    }



    @When("User clicks Link button")
    public void userClicksLinkButton() {
linkPage.linkButton.click();
    }
    @When("User fills out the text box with {string} and link ribbon with {string}")
    public void userFillsOutTheTextBoxWithAndLinkRibbonWith(String text, String link) {
        linkPage.linkRibbon.sendKeys("text");
        linkPage.textRibbon.sendKeys("link");
    }
    @And("User clicks Save button")
    public void userClicksSaveButton() {

        linkPage.saveButton.click();
    }
    @Then("User sees the {string} attached to a specific {string}")
    public void userSeesTheAttachedToASpecific(String text, String link) {
        String actualResult=linkPage.linkVerification.getText();
        String expectedResult="text";
        Assert.assertEquals(expectedResult,actualResult);
    }



}