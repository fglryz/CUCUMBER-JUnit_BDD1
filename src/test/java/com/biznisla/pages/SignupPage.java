package com.biznisla.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignupPage extends BasePage {
    @FindBy(xpath = "//a[@href='/login']")
    public WebElement signupButton;
    @FindBy(xpath = "//input[@name='name']")
    public WebElement Name;
    @FindBy(xpath = "(//input[@name='email'])[2]")
    public WebElement EmailAddress;
    @FindBy(xpath = "//button[contains(text(),'Signup')]")
    public WebElement signUp;
    @FindBy(xpath = "//*[@id=\"form\"]/div/div/div/div/h2/b")
    public WebElement accountInformation;





}
