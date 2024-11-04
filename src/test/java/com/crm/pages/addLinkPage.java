package com.crm.pages;

import com.crm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class addLinkPage {

    public addLinkPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//span[@id='feed-add-post-form-tab-message']")
    public WebElement messageTab;

    @FindBy(xpath = "//span[@class='bxhtmled-top-bar-btn bxhtmled-button-link']/i[1]")
    public WebElement linkTabOption;


@FindBy(xpath = "//input[@id='linkidPostFormLHE_blogPostForm-href']")
public WebElement linkUrlInput;



@FindBy(xpath ="//input[@id='undefined']")
public WebElement saveButton;


@FindBy(xpath = "//button[@id='blog-submit-button-save']")
public WebElement sendButton;

@FindBy(xpath="//div[contains(@id,'blog_post_body')]")
    public WebElement urlLink;



}
