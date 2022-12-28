package com.automation.step_definitions;

import com.automation.pages.BasePage;
import com.automation.pages.PoolPage;
import com.automation.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class PoolPageStep extends BrowserUtils {


    @When("User clicks Pool Tab")
    public void userClicksPoolTab() {
        poolPage.poolTab.click();
    }

    @When("User writes first Question")
    public void userWritesFirstQuestion() {
     poolPage.QuestionBox.sendKeys("What is the Java?");
    }

    @And("User writes the first answer")
    public void userWritesTheFirstAnswer() {
        poolPage.answer1.sendKeys("Java is a programming language");
    }

    @When("User writes the second answer")
    public void userWritesTheSecondAnswer() {
        poolPage.answer2.sendKeys("Jave is a management tool ");
    }
    @When("User writes the third answer")
    public void userWritesTheThirdAnswer() {
        poolPage.answer3.sendKeys("Jave is a built automation tool ");
    }


    @When("User writes the fourth answer")
    public void userWritesTheFourthAnswer() {
        poolPage.answer4.sendKeys("Jave is a automation tool ");
    }

    @When("User writes the {string} on poolBox")
    public void userWritesTheOnPoolBox(String text) {
        driver.switchTo().frame(poolPage.messagesIframe);
        poolPage.messagesInput.sendKeys(text);
        driver.switchTo().defaultContent();
    }

    @When("User clicks Send button at under add questions")
    public void userClicksSendButtonAtUnderAddQuestions() {
        sleep(5);
        poolPage.sendButton.click();
    }


    @Then("User sees the Automation Tester Interview Questions on the home page")
    public void userSeesTheAutomationTesterInterviewQuestionsOnTheHomePage() {
        Assert.assertTrue(poolPage.poolVerification.isDisplayed());
    }
}
