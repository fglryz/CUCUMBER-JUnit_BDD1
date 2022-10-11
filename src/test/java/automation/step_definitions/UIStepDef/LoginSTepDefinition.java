package automation.step_definitions.UIStepDef;

import com.automation.pages.SignupPage;
import com.automation.utilities.ConfigurationReader;
import com.automation.utilities.Driver;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginSTepDefinition {
    SignupPage signupPage = new SignupPage();
    Faker faker = new Faker();

    @Given("User navigates to url")

    public void user_navigates_to_url() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

    }


    @Given("User Clicks on {string} button")
    public void user_clicks_on_button(String string) {
        signupPage.signupButton.click();

    }

    @When("User fills the Name box")
    public void user_fills_the_name_box() {
        signupPage.Name.sendKeys(faker.name().fullName());
    }
    @Then("User sees \"Signup\\/Login' button successfully")
    public void userSeesSignupLoginButtonSuccessfully() throws Throwable {
        Assert.assertTrue(signupPage.signupButton.isDisplayed());
    }

    @When("User fills the Email Address")
    public void user_fills_the_email_address() {
        signupPage.EmailAddress.sendKeys(faker.internet().emailAddress());
    }



    @Then("User sees the ENTER ACCOUNT INFORMATION text")
    public void user_sees_the_enter_account_information_text() {
        Assert.assertTrue(signupPage.accountInformation.isDisplayed());
    }


    @When("User fills email box")
    public void userFillsEmailBox() {
        signupPage.LoginEmailAddress.sendKeys("fglryz.111@gmail.com");
    }

    @When("User fills the password")
    public void userFillsThePassword() {
        signupPage.password.sendKeys("fg123456");
    }

    @When("User clicks tke login button")
    public void userClicksTkeLoginButton() {
        signupPage.login.click();

    }

    @When("User enters name and already registered email address")
    public void userEntersNameAndAlreadyRegisteredEmailAddress() {
        signupPage.Name.sendKeys("Fatma");
        signupPage.EmailAddress.sendKeys("fglryz.111@gmail.com");
    }

    @Then("User sees Email Address already exist! error message")
    public void userSeesEmailAddressAlreadyExistErrorMessage() {
        Assert.assertTrue(signupPage.errorMessage.isDisplayed());
    }

    @When("User clicks the signup")
    public void userClicksTheSignup() {
        signupPage.signUp.click();
    }
}