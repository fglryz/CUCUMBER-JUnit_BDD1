package automation.step_definitions.UIStepDef;

import com.automation.pages.AccountPage;
import com.automation.pages.SignupPage;
import com.github.javafaker.Faker;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.Select;

public class AccountInfStepDef {
    AccountPage accountPage=new AccountPage();
    Faker faker=new Faker();
    SignupPage signupPage=new SignupPage();
    @When("User click on Mrs checkbox")
    public void user_click_on_mrs_checkbox() {
        accountPage.title.click();

    }
    @When("User writes password on password box")
    public void user_writes_password_on_password_box() {
        accountPage.password.sendKeys(faker.internet().password());
    }
    @When("User selects day")
    public void user_selects_day() {
        Select day=new Select(accountPage.day);
        day.selectByValue("24");
    }
    @When("User selects month")
    public void user_selects_month() {
        Select day=new Select(accountPage.months);
        day.selectByValue("4");
    }
    @When("User selects year")
    public void user_selects_year() {
        Select day=new Select(accountPage.years);
        day.selectByValue("2005");
    }
    @When("User ticks the newsletters")
    public void user_ticks_the_newsletters() {
        accountPage.newsletter.click();
    }
    @When("User ticks the special offers button")
    public void user_ticks_the_special_offers_button() {
        accountPage.specialOffer.click();
    }
    @When("User fills the first name box")
    public void user_fills_the_first_name_box() {
        accountPage.firstName.sendKeys(faker.name().firstName());
    }
    @When("User fills the last name box")
    public void user_fills_the_last_name_box() {
        accountPage.firstName.sendKeys(faker.name().lastName());
    }
    @When("User fills the company box")
    public void user_fills_the_company_box() {
        accountPage.company.sendKeys(faker.chuckNorris().fact());
    }
    @When("User fills address1 box")
    public void user_fills_address1_box() {
        accountPage.address1.sendKeys(faker.address().streetAddress());
    }
    @When("User fills address2 box")
    public void user_fills_address2_box() {
        accountPage.address2.sendKeys(faker.address().buildingNumber());
    }
    @When("User selects the country from country select")
    public void user_selects_the_country_from_country_select() {
        Select country=new Select(accountPage.country);
        country.selectByVisibleText("United States");
    }
    @When("User fills the state box")
    public void user_fills_the_state_box() {
        accountPage.state.sendKeys(faker.address().state());
    }
    @When("User fills the city box")
    public void user_fills_the_city_box() {
        accountPage.city.sendKeys(faker.address().city());
    }
    @When("User  fills the zipcode box")
    public void user_fills_the_zipcode_box() {
        accountPage.zipcode.sendKeys(faker.address().zipCode());
    }
    @When("User fiils mobile number")
    public void user_fiils_mobile_number() {
        accountPage.mobileNumber.sendKeys(faker.phoneNumber().cellPhone());
    }
    @When("User clicks create account box")
    public void User_clicks_create_account_box(){
        accountPage.createAccountButton.click();
    }

    @When("User clicks the signup buttons")
    public void userClicksTheSignupButtons() {
        signupPage.signUp.click();
    }
}
