package com.crm.step_definitions;

import com.crm.pages.UploadFilesPage;
import com.crm.utilities.BrowserUtils;
import io.cucumber.java.en.Then;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class UploadFileDefinition {

    UploadFilesPage uploadFilesPage = new UploadFilesPage();

    @Then("user should be able to upload")
    public void user_should_be_able_to_upload() throws AWTException {
        //Step1:Click on the message button
        uploadFilesPage.messageButton.click();
        //Step2: Click on the upload button
        uploadFilesPage.uploadFilesButton.click();
        //Step3: Click on the upload files and images
        BrowserUtils.sleep(3);
       uploadFilesPage.uploadFilesAndImagesButton.click();
        //Step4: Select a file from the system

        uploadFiles("src/test/resources/files/TestDocx.docx");
        //Step5: Click on the insert in text button
        BrowserUtils.sleep(3000);
        uploadFilesPage.insertIntextButton.click();
    }


    public void uploadFiles(String filePath) throws AWTException {
        // Use Robot class to handle the file dialog
        Robot robot = new Robot();

        // Wait for the dialog to open
        robot.delay(2000);

        // Set the file path you want to upload
        //filePath = "src/test/resources/files/TestDocx.docx"; // Change the path as needed
        StringSelection stringSelection = new StringSelection(filePath);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);

        // Paste the file path
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);

        // Press Enter to confirm
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }
}
