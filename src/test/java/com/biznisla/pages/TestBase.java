package com.biznisla.pages;

import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static io.restassured.RestAssured.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public abstract class TestBase {
    @BeforeAll
    public static void init() {
   baseURI="https:http://54.91.11.180:8000";
    }


}