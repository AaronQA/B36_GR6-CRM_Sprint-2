package com.crm.pages;

import com.crm.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UploadFilesAndPicturesPage extends BasePage{


    @FindBy(xpath="//span[@id='bx-b-uploadfile-blogPostForm']")
    public  WebElement uploadFilesAndPicturesButton;

    // Other elements and methods for uploading files and pictures go here...
    String projectPath = System.getProperty("C:\\Users\\meden\\IdeaProjects\\B36_GR6-CRM_Sprint-2\\src\\test\\resources\\files");

    //the path of the file
    String filePathPNG = "C:\\Users\\meden\\IdeaProjects\\B36_GR6-CRM_Sprint-2\\src\\test\\resources\\files";

    //it concatenates the project path and the file path to obtain the full path of the PNG file
    //String fullPathJPG = projectPath + "C:\\Users\\meden\\IdeaProjects\\B36_GR6-CRM_Sprint-2\\src\\test\\resources\\files" + filePathPNG;

    public void upload(){
        uploadFilesAndPicturesButton.click();
        BrowserUtils.sleep(2000);

    }
}
