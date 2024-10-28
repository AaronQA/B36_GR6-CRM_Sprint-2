package com.crm.pages;

import com.crm.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UploadFilesAndPicturesPage extends BasePage{

    @FindBy(xpath="//span[@id='bx-b-uploadfile-blogPostForm']")
    public  WebElement uploadFilesAndPicturesButton;

    public void upload(){
        uploadFilesAndPicturesButton.click();
        BrowserUtils.sleep(2000);

    }
}
