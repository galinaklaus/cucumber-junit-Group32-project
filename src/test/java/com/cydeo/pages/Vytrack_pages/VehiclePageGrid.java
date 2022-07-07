package com.cydeo.pages.Vytrack_pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
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


    public boolean isButtonOnRight(String buttoonOne,String buttonTwo){

        boolean check = false;
        String xPath;

        xPath = "//a[@title='"+buttoonOne+"']/..//following-sibling::a[@title='"+buttonTwo+"']";

        WebElement element = Driver.getDriver().findElement(By.xpath(xPath));

        if(element.isDisplayed()){
            check=true;
        }



        return check;

    }

}
