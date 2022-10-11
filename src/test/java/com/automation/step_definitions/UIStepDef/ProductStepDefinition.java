package com.automation.step_definitions.UIStepDef;

import com.automation.pages.ProductPage;
import io.cucumber.java.en.And;
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
      Assert.assertTrue(productPage.searchProduct.isDisplayed());
    }


    @When("User hovers over first product and click Add to cart")
    public void userHoversOverFirstProductAndClickAddToCart() {

        productPage.addToChart1.click();
    }

    @And("User clicks Continue Shopping button")
    public void userClicksContinueShoppingButton() {
        productPage.shopContinueBtton.click();
    }


    @When("User hovers over second product and click Add to cart")
    public void userHoversOverSecondProductAndClickAddToCart() {
        productPage.addToChart2.click();
    }

    @And("User  clicks {string} button")
    public void userClicksViewCartButton() {
        productPage.charButton.click();
    }



}
