package com.crm.pages;

import com.crm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class addLinkPage {

    public addLinkPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//span[@id='feed-add-post-form-tab-message']")
    WebElement messageTab;

    @FindBy(xpath = "//span[@class='bxhtmled-top-bar-btn bxhtmled-button-link']/i[1]")

    WebElement linkTabOption;

@FindBy(xpath = "//input[@id='linkidPostFormLHE_blogPostForm-text']")

    WebElement linkTextInput;

@FindBy(xpath = "//input[@id='linkidPostFormLHE_blogPostForm-href']")

    WebElement linkUrlInput;

@FindBy(xpath = "//input[@id='undefined']")

    WebElement saveButton;



}
