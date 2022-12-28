package com.automation.step_definitions;



import com.automation.pages.LoginPage;
import com.automation.utilities.BrowserUtils;
import com.automation.utilities.ConfigurationReader;
import com.automation.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class loginPageStepDef {
    LoginPage  loginPage=new LoginPage();

    @Given("User navigate  the url")
    public void user_navigate_the_url() {
       Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }
    @When("User enters {string}")
    public void user_enters(String userName) {
        loginPage.inputUserName.sendKeys(userName);
    }
    @When("User fills {string}")
    public void user_fills(String password) {
        loginPage.inputPassword.sendKeys(password);
   
    }
    @When("User clicks Log In button")
    public void user_clicks_log_in_button() {
        loginPage.logInButton.click();
    }
    @Then("User sees Activity Stream on home page")
    public void user_sees_activity_stream_on_home_page() {
        loginPage.VerificationActiveStream.isDisplayed();
    }
    @Then("User sees {string}")
    public void userSees(String WarningMessage) {
     loginPage.errorMessage.isDisplayed();

    }



}
