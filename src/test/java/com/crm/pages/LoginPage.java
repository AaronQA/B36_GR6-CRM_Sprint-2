package com.crm.pages;

import com.crm.utilities.ConfigurationReader;
import com.crm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(name = "USER_LOGIN")
    public WebElement usernameInput;

    @FindBy(name = "USER_PASSWORD")
    public WebElement passwordInput;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement loginButton;

    @FindBy(xpath = "//div[@class='errortext']")
    public WebElement errorMessage;

    @FindBy(xpath = "//input[@name='USER_REMEMBER']")
    public WebElement rememberMeBox;

    @FindBy(xpath = "//label[@for='USER_REMEMBER']")
    public WebElement rememberMeText;


    public void login(String username, String password) {
        this.usernameInput.sendKeys(username);
        this.passwordInput.sendKeys(password);
        this.loginButton.click();
    }


    public void login(String userType) {
        this.usernameInput.sendKeys(ConfigurationReader.getProperty(userType + "_username"));
        this.passwordInput.sendKeys(ConfigurationReader.getProperty(userType + "_password"));
        this.loginButton.click();
    }

}
