package com.biznisla.pages;

import com.biznisla.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    public BasePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
}
