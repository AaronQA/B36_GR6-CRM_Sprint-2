package com.crm.step_definitions;

import com.crm.pages.MyProfilePage;
import com.crm.utilities.BrowserUtils;
import com.crm.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class MyProfileStepDefs {

    MyProfilePage profilePage = new MyProfilePage();

    @When("user Click on the email on the right top on the home page")
    public void user_click_on_the_email_on_the_right_top_on_the_home_page () {
        profilePage.userIcon.click();
        Driver.getDriver().manage().window().setSize(new Dimension(3 , 3));
    }

    @And("user should be able to resize the browser window")
    public void userShouldBeAbleToResizeTheBrowserWindow () {

    }


    @When("user Click on the {string} option")
    public void user_click_on_the_option (String string) {
        profilePage.myProfile.click();


    }

    @Then("user should be able to see list of options my profile")
    public void user_should_be_able_to_see_list_of_options_my_profile (List<String> expectedOptions) {

        Assert.assertEquals(expectedOptions , BrowserUtils.getElementsText(profilePage.Options));

    }

    @When("user refreshes the page")
    public void userRefreshesThePage () {
        Driver.getDriver().navigate().refresh();
    }


    @Then("user should see {string} as email under General tab")
    public void user_should_see_as_email_under_general_tab (String string) {
        System.out.println("emailUnderGeneral is Displayed : " + profilePage.emailUnderGeneral.isDisplayed());

    }

    @Then("then user should see {string} as email under Contact information")
    public void then_user_should_see_as_email_under_contact_information (String string) {
        System.out.println("emailUnderContactInformation is Displayed : " + profilePage.emailUnderContactInformation.isDisplayed());
        BrowserUtils.sleep(2);
    }

    @Then("then user should verify that the both emails are the same")
    public void then_user_should_verify_that_the_both_emails_are_the_same () {
        Assert.assertEquals(profilePage.emailUnderGeneral.getText() , profilePage.emailUnderContactInformation.getText());

    }


    @Then("the user should not see all the expected options")
    public void theUserShouldNotSeeAllTheExpectedOptions () {
        List<WebElement> visibleOptions = profilePage.Options;
        // Assuming there should be 5 options normally
        Assert.assertTrue("All expected options are visible" , visibleOptions.size() < 5);
    }

    @And("the user should only see the following options:")
    public void userShouldOnlySeeFollowingOptions (List<String> expectedOptions) {
        List<String> actualVisibleOptions = BrowserUtils.getElementsText(profilePage.Options);
        Assert.assertEquals("Visible options do not match expected" , expectedOptions , actualVisibleOptions);
    }

    @And("the user should see an error message {string}")
    public void userShouldSeeErrorMessage (String expectedErrorMessage) {
        System.err.println("error message: " + expectedErrorMessage);
    }


    @Then("the {string} displayed under the General tab should have an invalid format")
    public void theDisplayedUnderTheGeneralTabShouldHaveAnInvalidFormat (String expectedErrorMessage) {
        Assert.assertTrue(expectedErrorMessage , profilePage.emailUnderGeneral.isDisplayed());
    }
}





