package com.biznisla.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignupPage {
    @FindBy(xpath = "//a[@href='/login']")
    public WebElement signupPage;


}
