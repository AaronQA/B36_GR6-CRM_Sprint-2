package com.crm.pages;

import com.crm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.xpath.XPath;
import java.util.List;

public class MyProfilePage extends BasePage {

    public MyProfilePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//a[.='My Profile']")

    public WebElement myProfile;


    @FindBy(xpath = "//div[@id='profile-menu-filter']//a")
    public  List<WebElement> Options;


    @FindBy(xpath ="//span[@id='pagetitle']")
    public WebElement emailUnderGeneral;

    @FindBy(xpath = "//td[@class='user-profile-nowrap-second'] " )

    public WebElement emailUnderContactInformation;

}
