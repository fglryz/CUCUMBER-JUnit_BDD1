package com.biznisla.step_definitions;

import com.biznisla.pages.BasePage;
import com.biznisla.pages.LogoutPage;
import com.biznisla.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class LogoutStepDefinition extends BasePage {
   LogoutPage logoutPage=new LogoutPage();
    @When("User clicks the logout button")
    public void user_clicks_the_logout_button() {
     logoutPage.logoutButton.click();

    }
    @Then("User sees the login page")
    public void user_sees_the_login_page() {
       Assert.assertTrue( logoutPage.loginToAccount.isDisplayed());
    }


}
