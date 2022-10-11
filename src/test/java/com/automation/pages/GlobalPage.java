package com.automation.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import java.util.List;

public class GlobalPage {



   // @FindBy(xpath ="//h1[contains(text(),'Live Playlists')]")
    //public List<WebElement>songList;

    @FindBy(xpath ="//span[contains(text (),'Live Playlists')][1]")
    public WebElement playList;

    @FindBy(xpath ="//button[contains(text(),'ACCEPT')]")
    public WebElement accept;

    @FindBy(xpath = "//*[@id=\"__next\"]/div[2]/div/div[2]/div/div[1]/span")
    public WebElement closePopUp;
    @FindBy(xpath = "//*[@id=\"__next\"]/div[2]/div/div[2]/div/div[1]/span")
    public WebElement playListButton;

    @FindBy(xpath = "//div[@class='content-item__text']")
    public List<WebElement>LivesongList;


}
