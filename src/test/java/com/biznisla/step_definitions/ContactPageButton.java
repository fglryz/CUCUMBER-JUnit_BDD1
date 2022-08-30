package com.biznisla.step_definitions;

import com.biznisla.pages.ContactUsPAge;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ContactPageButton {
    ContactUsPAge contactUsPAge=new ContactUsPAge();
    Faker faker=new Faker();
    @When("User clicks on {string} button")
    public void user_clicks_on_button(String string) {
       contactUsPAge.contactUsButton.click();
    }
    @Then("User sees the  {string} is visible")
    public void user_sees_the_is_visible(String string) {
        Assert.assertTrue(contactUsPAge.contactPageButton.isDisplayed());
    }
    @When("User enters name, email, subject and message")
    public void user_enters_name_email_subject_and_message() {
        contactUsPAge.Name.sendKeys(faker.name().firstName());
        contactUsPAge.Email.sendKeys(faker.internet().emailAddress());
        contactUsPAge.subject.sendKeys(faker.chuckNorris().fact());

    }
    @When("User Uploads file")
    public void user_uploads_file() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("User clicks {string} button")
    public void user_clicks_button(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("User clicks OK button")
    public void user_clicks_ok_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("User sees success message {string} is visible")
    public void user_sees_success_message_is_visible(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("User clicks the signup button")
    public void userClicksTheSignupButton() {
    }
}
