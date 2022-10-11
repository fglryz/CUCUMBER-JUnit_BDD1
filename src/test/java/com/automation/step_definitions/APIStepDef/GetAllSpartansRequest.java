package com.automation.step_definitions.APIStepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GetAllSpartansRequest {

    Response response;
    JsonPath jsonPath=response.jsonPath();
    String baseurl="http://54.91.11.180:8000";

    @When("API get request is made to endpoint {string}")
    public void apiGetRequestIsMadeToEndpoint(String endpoint) {
        response=given().accept(ContentType.JSON).when()
                .get(endpoint);
    }

    @Then("verify status code is {int}")
    public void verify_status_code_is(Integer statusCode) {
        assertEquals(statusCode,response.getStatusCode());

    }

    @And("Verify response content type is {string}")
    public void verifyResponseContentTypeIs(String contentType) {
        assertTrue(response.getContentType().contains(contentType));
    }

    @When("print out the response  body to the console")
    public void printOutTheResponseBodyToTheConsole() {
        response.prettyPrint();
    }
    @When("Print out the user's id")
    public void print_out_the_user_s_id() {
   int id=response.path("[1].id");
        System.out.println("id = " + id);

    }
    @When("Print out the user's name")
    public void print_out_the_user_s_name() {
        String name=response.path("[1].name");
        System.out.println("name = " + name);


    }
    @When("Print out the user's gender")
    public void print_out_the_user_s_gender() {
        String gender=response.path("[1].gender");
        System.out.println("gender = " + gender);

    }

    @And("Print out the user's phone")
    public void printOutTheUserSPhone() {
        String phone=response.path("[1].phone");
        System.out.println("phone = " + phone);

    }
}
