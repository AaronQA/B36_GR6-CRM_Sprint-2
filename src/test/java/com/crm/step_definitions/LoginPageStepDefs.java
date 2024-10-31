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
        String actualErrorMessage = loginPage.errorMessage.getText();
        Assert.assertEquals("Error message verification failed.", expectedErrorMessage, actualErrorMessage);
    }

    @When("user clicks on Remember me on this computer")
    public void user_clicks_on_remember_me_on_this_computer() {
        loginPage.rememberMeBox.click();
    }
    @Then("user should be able to see checkbox is clicked")
    public void user_should_be_able_to_see_checkbox_is_clicked() {
        Assert.assertTrue("Remember me checkbox verification failed.", loginPage.rememberMeBox.isSelected());
    }
    @Then("user should be able to see Remember me on this computer text")
    public void user_should_be_able_to_see_remember_me_on_this_computer() {
        Assert.assertEquals("Text verification is failed.", "Remember me on this computer",
                loginPage.rememberMeText.getText());
    }

    @When("user types {string} and {string}")
    public void user_types_and(String username, String password) {
        loginPage.usernameInput.sendKeys(username);
        loginPage.passwordInput.sendKeys(password);
    }
    @Then("password should be displayed as bullet signs")
    public void password_should_be_displayed_as_bullet_signs() {
        Assert.assertEquals("Password verification is failed.",
                loginPage.passwordInput.getAttribute("type"), "password");
    }

    @When("user clicks on Drive, Calendar and Time and Reports")
    public void user_clicks_on_drive_calendar_and_time_and_reports() {
        loginPage.drive.click();
        loginPage.calendar.click();
        loginPage.time_and_reports.click();
    }

    @When("user logs out")
    public void user_logs_out() {
        loginPage.userIcon.click();
        loginPage.logoutButton.click();
    }

    @When("user logs in as {string} again")
    public void user_logs_in_as_again(String userType) {
        loginPage.usernameInput.clear();
        loginPage.login(userType);
    }


}
