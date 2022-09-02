package com.biznisla.step_definitions;

import com.biznisla.pages.BasePage;
import com.biznisla.pages.TestBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.apache.poi.ss.formula.functions.T;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import java.util.Optional;
import static io.restassured.RestAssured.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GetRequest  {
    Response response;
    String baseurl="http://54.91.11.180:8000";

    @When("User get the  spartans from api")
    public void userGetTheSpartansFromApi() {
        Response response  = given().accept(ContentType.JSON)
                .when()
                .get(baseurl + "/api/spartans");
    }



        @Then("status code should be {int}")
        public void status_code_should_be(Integer statusCode) {
            assertEquals(response.statusCode(),200);
        }



}
