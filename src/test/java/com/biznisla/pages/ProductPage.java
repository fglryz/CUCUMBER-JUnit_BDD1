package com.biznisla.pages;

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




}
