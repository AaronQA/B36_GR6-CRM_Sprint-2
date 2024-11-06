package com.crm.step_definitions;

import com.crm.pages.addLinkPage;
import com.crm.utilities.BrowserUtils;
import com.crm.utilities.Driver;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import io.cucumber.java.en.When;
import io.cucumber.java.zh_cn.假如;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class US_06_addLinkTextStepDefs {
Driver driver;

addLinkPage addLinkPage = new addLinkPage();
    @When("the user is on the message tab")
    public void the_user_is_on_the_message_tab(){
        addLinkPage.messageTab.click();
        BrowserUtils.sleep(2);
    }
    @When("the user clicks on the link tab option")
    public void the_user_clicks_on_the_link_tab_option() {
        addLinkPage.linkTabOption.click();
        BrowserUtils.sleep(2);
    }
    @When("the user enters {string} in the link url input")
    public void the_user_enters_in_the_link_url_input(String urlText) {
        addLinkPage.linkUrlInput.sendKeys(urlText);
        BrowserUtils.sleep(2);

    }
    @When("the user clicks the save button")
    public void the_user_clicks_the_save_button() {
        addLinkPage.saveButton.click();
        BrowserUtils.sleep(2);
    }
    @When("the user clicks on the send button")
    public void the_user_clicks_on_the_send_button() {
       addLinkPage.sendButton.click();
        BrowserUtils.sleep(2);
    }
    @Then("the user should see the linkText added")
    public void the_user_should_see_the_link_text_added() {

        Assert.assertTrue(addLinkPage.urlLink.isDisplayed());
    }

    @When("the user is on home page")
    public void the_user_is_on_home_page() {

    }
    @When("the user clicks on the textLink")
    public void the_user_clicks_on_the_text_link() {
        BrowserUtils.sleep(2);
        addLinkPage.urlLink.click();

    }
    @Then("the user navigates to the correct url")
    public void the_user_navigates_to_the_correct_url() {
        Assert.assertTrue(addLinkPage.urlLink.isEnabled());
        BrowserUtils.sleep(2);
    }
    @Then("the user should see the link opens in a new tab")
    public void theUserShouldSeeTheLinkOpensInANewTab(){

        // not sure how to do this step with ready utility methods







    }


}











