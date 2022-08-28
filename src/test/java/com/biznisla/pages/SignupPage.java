package com.biznisla.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignupPage extends BasePage {
    @FindBy(xpath = "//a[@href='/login']")
    public WebElement signupPage;
    @FindBy(xpath = "//a[@href='/login']")
    public WebElement Name;
    @FindBy(xpath = "//a[@href='/login']")
    public WebElement EmailAddress;




}
