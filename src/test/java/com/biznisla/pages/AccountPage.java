package com.biznisla.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountPage extends BasePage{
    @FindBy(id = "id_gender2")
    public WebElement title;
    @FindBy(id="password")
    public WebElement password;
    @FindBy(id="days")
    public WebElement day;
    @FindBy(id="months")
    public WebElement months;
    @FindBy(id="years")
    public WebElement years;
    @FindBy(id="newsletter")
    public WebElement newsletter;
    @FindBy(xpath = "//label[contains(text(),'Receive special offers from our partners!')]")
    public WebElement specialOffer;
    @FindBy(id = "first_name")
    public WebElement firstName;
    @FindBy(id = "last_name")
    public WebElement lastName;
    @FindBy(id  ="company")
    public WebElement company;
    @FindBy(id  ="address1")
    public WebElement address1;
    @FindBy(id  ="address2")
    public WebElement address2;
    @FindBy(id  ="country")
    public WebElement country;
    @FindBy(id  ="state")
    public WebElement state;
    @FindBy(id  ="city")
    public WebElement city;
    @FindBy(id  ="zipcode")
    public WebElement zipcode;
    @FindBy(id  ="mobile_number")
    public WebElement mobileNumber;
    @FindBy(xpath = "//button[contains(text(),'Create Account')]")
    public WebElement createAccountButton;










}
