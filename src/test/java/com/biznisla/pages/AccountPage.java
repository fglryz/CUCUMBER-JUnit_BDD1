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
    @FindBy(id="year")
    public WebElement years;
    @FindBy(id="newsletter")
    public WebElement newsletter;
    @FindBy(xpath = "//label[contains(text(),'Receive special offers from our partners!')]")
    public WebElement specialOffer;
    @FindBy(id = "first_name")
    public WebElement firstName;
    @FindBy(id = "last_name")
    public WebElement lastName;
    @FindBy(id = ="company")
    public WebElement company;





}
