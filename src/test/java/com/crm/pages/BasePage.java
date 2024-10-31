package com.crm.pages;

import com.crm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public abstract class BasePage {

    public BasePage () {

        PageFactory.initElements(Driver.getDriver() , this);
    }

    @FindBy(xpath = "//span[normalize-space()='Activity Stream']")
    public WebElement ActivityStream;

    @FindBy(xpath = "//span[normalize-space()='Tasks']")
    public WebElement tasks;

    @FindBy(xpath = "//span[normalize-space()='Chat and Calls']")
    public WebElement chat_and_calls;

    @FindBy(xpath = "//span[normalize-space()='Workgroups']")
    public WebElement workgroups;

    @FindBy(xpath = "//span[normalize-space()='Drive']")
    public WebElement drive;

    @FindBy(xpath = "//span[normalize-space()='Calendar']")
    public WebElement calendar;

    @FindBy(xpath = "//span[normalize-space()='Mail']")
    public WebElement mail;

    @FindBy(xpath = "//span[normalize-space()='Contact Center']")
    public WebElement contactCenter;

    @FindBy(xpath = "//span[normalize-space()='Time and Reports']")
    public WebElement time_and_reports;

    @FindBy(xpath = "//span[normalize-space()='Employees']")
    public WebElement employees;

    @FindBy(xpath = "//span[normalize-space()='Services']")
    public WebElement services;

    @FindBy(xpath = "//span[normalize-space()='Company']")
    public WebElement company;

    @FindBy(xpath = "//a[@id='logo_24_a']")
    public WebElement CRM24;

    @FindBy(xpath = "//div[@id='user-block']")
    public WebElement userIcon;


}
