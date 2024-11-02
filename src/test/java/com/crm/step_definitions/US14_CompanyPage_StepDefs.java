package com.crm.step_definitions;

import com.crm.pages.CompanyPage;
import com.crm.utilities.BrowserUtils;
import com.crm.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class US14_CompanyPage_StepDefs {

    CompanyPage companyPage = new CompanyPage();

    @When("user navigates to the {string} page")
    public void user_navigates_to_the_page(String module) {
        switch (module) {
            case "Active Stream":
                companyPage.ActivityStream.click();
                break;
            case "Tasks":
                companyPage.tasks.click();
                break;
            case "Chat and Calls":
                companyPage.chat_and_calls.click();
                break;
            case "Workgroups":
                companyPage.workgroups.click();
                break;
            case "Drive":
                companyPage.drive.click();
                break;
            case "Calendar":
                companyPage.calendar.click();
                break;
            case "Mail":
                companyPage.mail.click();
                break;
            case "Contact Center":
                companyPage.contactCenter.click();
                break;
            case "Time and Reports":
                companyPage.time_and_reports.click();
                break;
            case "Employees":
                companyPage.employees.click();
                break;
            case "Services":
                companyPage.services.click();
                break;
            case "Company":
                companyPage.company.click();
                break;
        }
    }

    @Then("user should see below modules")
    public void user_should_see_below_modules(List<String> expectedModules) {
        List<String> actualModules = BrowserUtils.getElementsText(companyPage.modules);
        Assert.assertEquals("Module verification is failed.", expectedModules, actualModules);
    }

    @When("user navigates to the {string} module")
    public void user_navigates_to_the_module(String module) {
        switch (module) {
            case "Official Information":
                companyPage.officialInformation.click();
                break;
            case "Our Life":
                companyPage.ourLife.click();
                break;
            case "About Company":
                companyPage.aboutCompany.click();
                Driver.getDriver().navigate().back();
                break;
            case "Photo Gallery":
                companyPage.photoGallery.click();
                break;
            case "Video":
                companyPage.video.click();
                break;
            case "Career":
                companyPage.career.click();
                break;
            case "Business News (RSS)":
                companyPage.businessNewsRSS.click();
                break;
            case "More":
                companyPage.more.click();
                break;
        }
    }
}
