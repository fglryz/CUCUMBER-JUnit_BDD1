package com.biznisla.step_definitions;

import com.biznisla.pages.ProductPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ProductStepDefinition {
    ProductPage productPage=new ProductPage();
    @When("User clicks on Products button")
    public void userClicksOnProductsButton() {
        productPage.productButton.click();
    }
    @Then("Users sees ALL PRODUCTS page successfully")
    public void users_sees_all_products_page_successfully() {
        Assert.assertTrue(productPage.allProduct.isDisplayed());
    }
    @When("User enters product name in search input and click search button")
    public void user_enters_product_name_in_search_input_and_click_search_button() {
        productPage.searchProductBox.sendKeys("Blue Top");
        productPage.clickSearchButton.click();

    }
    @When("Verify {string} is visible")
    public void verify_is_visible(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


}
