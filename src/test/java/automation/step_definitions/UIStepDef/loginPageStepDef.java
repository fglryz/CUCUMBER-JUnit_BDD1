package automation.step_definitions.UIStepDef;



import automation.utilities.BrowserUtils;
import automation.utilities.ConfigurationReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class loginPageStepDef extends BrowserUtils {

    @Given("User navigate  the url")
    public void user_navigate_the_url() {
       driver.get(ConfigurationReader.getProperty("url"));
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
