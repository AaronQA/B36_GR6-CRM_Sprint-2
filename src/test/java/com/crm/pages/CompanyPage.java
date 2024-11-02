package com.crm.pages;

import com.crm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CompanyPage extends BasePage {

    public CompanyPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[@class='main-buttons-item-text']")
    public List<WebElement> modules;

    @FindBy(xpath = "//a[@class='main-buttons-item-link']//span[@class='main-buttons-item-text-title'][normalize-space()='Official Information']")
    public WebElement officialInformation;

    @FindBy(xpath = "//a[@class='main-buttons-item-link']//span[@class='main-buttons-item-text-title'][normalize-space()='Our Life']")
    public WebElement ourLife;

    @FindBy(xpath = "//a[@class='main-buttons-item-link']//span[@class='main-buttons-item-text-title'][normalize-space()='About Company']")
    public WebElement aboutCompany;

    @FindBy(xpath = "//a[@class='main-buttons-item-link']//span[@class='main-buttons-item-text-title'][normalize-space()='Photo Gallery']")
    public WebElement photoGallery;

    @FindBy(xpath = "//a[@class='main-buttons-item-link']//span[@class='main-buttons-item-text-title'][normalize-space()='Video']")
    public WebElement video;

    @FindBy(xpath = "//a[@class='main-buttons-item-link']//span[@class='main-buttons-item-text-title'][normalize-space()='Career']")
    public WebElement career;

    @FindBy(xpath = "//a[@class='main-buttons-item-link']//span[@class='main-buttons-item-text-title'][normalize-space()='Business News (RSS)']")
    public WebElement businessNewsRSS;

    @FindBy(xpath = "//a[@class='main-buttons-item-link']//span[@class='main-buttons-item-text'][normalize-space()='More']")
    public WebElement more;

}
