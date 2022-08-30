package com.biznisla.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.security.cert.X509Certificate;

public class ContactUsPAge extends BasePage {

    @FindBy(xpath = "//div/ul/li[9]/a")
    public WebElement contactUsButton;

    @FindBy(xpath = "//*[@id=\"contact-page\"]/div[2]/div[1]/div/h2")
    public WebElement contactPageButton;

    @FindBy(xpath = "//input[@name='name']")
    public WebElement Name;
    @FindBy(xpath = "//input[@name='email']")
    public WebElement Email;
    @FindBy(xpath = "//input[@name='subject']")
    public WebElement subject;
    @FindBy(xpath = "//input[@name='upload_file']")
    public WebElement uploadFile;









}
