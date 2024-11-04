package com.crm.pages;

import com.crm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UploadFilesPage extends BasePage{

    public UploadFilesPage(){PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "feed-add-post-form-tab-message")
    public WebElement messageButton;


    @FindBy(id = "bx-b-uploadfile-blogPostForm")
    public WebElement uploadFilesButton;

    @FindBy(xpath = "//input[@name='bxu_files[]']")
    public WebElement uploadFilesAndImagesButton;

    @FindBy(xpath = "//span[@class='insert-btn-text']")
    public WebElement insertIntextButton;





}
