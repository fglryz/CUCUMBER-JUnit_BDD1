package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends BasePage {

    @FindBy(xpath = "//a[@href='/products']")
    public WebElement productButton;

    @FindBy(id = "search_product")
    public WebElement  searchProduct;

    @FindBy(xpath = "//h2[@class='title text-center']\n")
    public WebElement  allProduct;

    @FindBy(id = "search_product")
    public WebElement searchProductBox;
    @FindBy(xpath = "//i[@class='fa fa-search']")
    public WebElement  clickSearchButton;

    @FindBy(xpath = "(//p[contains(text(),'Blue Top')])[1]")
    public WebElement displaySearch;
    @FindBy(xpath = "(//a[@class='btn btn-default add-to-cart'])[1]")
    public WebElement addToChart1;
    @FindBy(xpath = "(//a[@class='btn btn-default add-to-cart'])[2]")
    public WebElement addToChart2;
    @FindBy(xpath = "//button[contains(text(),'Continue Shopping')]")
    public WebElement shopContinueBtton;
    @FindBy(xpath =  "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[3]/a")
    public WebElement charButton;














}
