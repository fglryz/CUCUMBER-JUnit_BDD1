package com.biznisla.step_definitions;

import com.biznisla.pages.SignupPage;
import com.biznisla.utilities.ConfigurationReader;
import com.biznisla.utilities.Driver;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginSTepDefinition {
    SignupPage signupPage = new SignupPage();
Faker faker=new Faker();

    @Given("User navigates to url")

    public void user_navigates_to_url() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

    }

    @Then("User sees \"Signup\\/Login' button successfully")
    public void userSeesSignupLoginButtonSuccessfully() {
        Assert.assertTrue(signupPage.signupPage.isDisplayed());
    }
    @Given("User Clicks on {string} button")
    public void user_clicks_on_button(String string) {
signupPage.Name.sendKeys(faker.name().fullName());

    }

    @When("User fills the Name box")
    public void user_fills_the_name_box() {

    }

    @When("User fills the Email Address")
    public void user_fills_the_email_address() {
        signupPage.EmailAddress.sendKeys(faker.internet().emailAddress());
    }

    @When("User clics the signup button")
    public void user_clics_the_signup_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("User sees the ENTER ACCOUNT INFORMATION text")
    public void user_sees_the_enter_account_information_text() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}