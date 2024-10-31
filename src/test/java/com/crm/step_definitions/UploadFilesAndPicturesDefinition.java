package com.crm.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.velocity.runtime.directive.contrib.For;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class UploadFilesAndPicturesDefinition {

    @Given("User can upload files and pictures")
    public void user_can_upload_files_and_pictures() {


        WebElement driver=null;
        driver.findElement(By.id("file-upload")).sendKeys("path/to/your/file.jpg");


    }
    @When("user can insert the files and images into the text")
    public void user_can_insert_the_files_and_images_into_the_text() {
        WebElement driver=null;
       //driver.findElement(By.id("image-upload")).sendKeys("path/to/your/image.jpg");
        String projectPath = System.getProperty("C:\\Users\\meden\\IdeaProjects\\B36_GR6-CRM_Sprint-2\\src\\test\\resources\\files");
    }
    @When("user can remove files and images into the text")
    public void user_can_remove_files_and_images_into_the_text() {
        WebElement driver=null;
        driver.findElement(By.id("remove-image")).click();
        driver.findElement(By.id("remove-file")).click();




    }

}