package com.crm.step_definitions;

import com.crm.pages.LoginPage;
import com.crm.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginPageStepDefs {
    LoginPage loginPage = new LoginPage();

    @Given("user is on the login page")
    public void userIsOnTheLoginPage() {

        System.out.println("DONE IN HOOKS");

    }

    @When("user logs in as {string}")
    public void user_logs_in_as(String userType) {
        loginPage.login(userType);
    }

    @Then("user should be able to see {string} as page title")
    public void userShouldLandOnHomePageWith(String title) {
        BrowserUtils.verifyTitleContains(title);
    }

    @When("user logs in with {string} or {string}")
    public void user_logs_in_with_or(String username, String password) {
        loginPage.login(username, password);
    }
    @Then("error message {string} should be displayed")
    public void error_message_should_be_displayed(String expectedErrorMessage) {
        String actualErrorMessage = loginPage.invalidLoginOrPassword.getText();
        Assert.assertEquals("Error message verification failed.", expectedErrorMessage, actualErrorMessage);
    }

    @When("user clicks on Remember me on this computer")
    public void user_clicks_on_remember_me_on_this_computer() {
        loginPage.rememberMeBox.click();
    }
    @Then("user should be able to see checkbox is clicked")
    public void user_should_be_able_to_see_checkbox_is_clicked() {

    }


}
