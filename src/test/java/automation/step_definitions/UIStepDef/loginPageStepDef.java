package automation.step_definitions.UIStepDef;

import automation.pages.LoginPage;
import automation.pages.MessagePage;
import automation.utilities.BrowserUtils;
import automation.utilities.ConfigurationReader;
import automation.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class loginPageStepDef {
     LoginPage loginPage=new LoginPage();
     MessagePage messagePage=new MessagePage();

    @Given("User navigate  the url")
    public void user_navigate_the_url() {
        Driver.getDriver().get(ConfigurationReader.getProperty("Url"));
    }
    @When("User enters {string}")
    public void user_enters(String userName) {

        loginPage.UserName.sendKeys(userName);
    }
    @When("User fills {string}")
    public void user_fills(String password) {
        loginPage.Password.sendKeys(password);
    }
    @When("User clicks Log In button")
    public void user_clicks_log_in_button() {
        loginPage.LoginInButton.click();
    }
    @Then("User sees Activity Stream on home page")
    public void user_sees_activity_stream_on_home_page() {
        loginPage.activeStream.isDisplayed();
    }
    @Then("User sees {string}")
    public void userSees(String WarningMessage) {
     loginPage.warningPage.isDisplayed();

    }



}
