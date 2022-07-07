package com.cydeo.pages.Vytrack_pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VehiclePageGrid {

    public VehiclePageGrid(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(partialLinkText = "Fleet")
    public WebElement feetMenu;

    @FindBy(partialLinkText = "Vehicles")
    public WebElement vehicles;

    @FindBy(partialLinkText = "Reset")
    public WebElement gridResetBtn;

    @FindBy(xpath = "//i[@class='fa-cog hide-text']")
    public WebElement gridSettingsBtn;


 }


