package automation.step_definitions.UIStepDef;

import com.automation.pages.ContactUsPAge;
import com.automation.utilities.Driver;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;

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
        contactUsPAge.message.sendKeys(faker.chuckNorris().fact());

    }
    @When("User uploads files")
    public void userUploadsFiles() {
       String filepath="/Users/atlantic/Desktop/experience_sharing_agile_testing.pptx";
        contactUsPAge.uploadFile.sendKeys(filepath);
    }

    @When("User clicks {string} button")
    public void user_clicks_button(String string) {
        contactUsPAge.submit.click();
    }
    @When("User clicks OK button")
    public void user_clicks_ok_button() {
      Alert alert= Driver.getDriver().switchTo().alert();
      alert.accept();

    }
    @Then("User sees success message {string} is visible")
    public void user_sees_success_message_is_visible(String string) {
       Assert.assertTrue(contactUsPAge.success.isDisplayed());
    }

    @When("User clicks the signup button")
    public void userClicksTheSignupButton() {
    }


}
