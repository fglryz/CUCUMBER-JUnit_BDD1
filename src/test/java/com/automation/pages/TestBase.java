package com.automation.pages;

import org.junit.jupiter.api.BeforeAll;

import static io.restassured.RestAssured.*;
import static org.hamcrest.MatcherAssert.assertThat;

public abstract class TestBase {
    @BeforeAll
    public static void init() {
   baseURI="https:http://54.91.11.180:8000";
    }


}