package com.cydeo.step_definitions;

import com.cydeo.pages.Vytrack_pages.DashboardPage;
import com.cydeo.pages.Vytrack_pages.VehiclesPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ClickGridBtnSetStepDef {

    WebDriver driver = Driver.getDriver();

    WebDriverWait wait;

    String username = ConfigurationReader.getProperty("vytrack_username");

    DashboardPage dashboardPage = new DashboardPage();
    VehiclesPage vehiclesPage = new VehiclesPage();


    @Given("User is on VyTrack homepage")
    public void user_is_on_vy_track_homepage() {

    }

    @Given("User clicks on Fleet")
    public void user_clicks_on_fleet() {
        BrowserUtils.waitForClickablility(dashboardPage.getFleetBtn(username), 20);

        dashboardPage.getFleetBtn(username).click();
    }

    @Given("User clicks on Vehicles under Fleet dropdown")
    public void user_clicks_on_vehicles_under_fleet_dropdown() {
        BrowserUtils.waitForClickablility(dashboardPage.vehiclesBtn, 20);
        dashboardPage.vehiclesBtn.click();

    }

    @Given("the Sales Manager is on Vehicle page")
    public void the_sales_manager_is_on_vehicle_page() {
        wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.titleIs("All - Car - Entities - System - Car - Entities - System"));
        Assert.assertTrue(driver.getTitle().equals("All - Car - Entities - System - Car - Entities - System"));
    }

    @When("the Sales Manager sees Grid Settings is on the right side of the Reset button and on the right side of the page")
    public void the_sales_manager_sees_grid_settings_is_on_the_right_side_of_the_reset_button_and_on_the_right_side_of_the_page() {
        boolean btn = vehiclesPage.isTheElementOnTheRIGHTSideOfPage(vehiclesPage.Grid);
        Assert.assertTrue("Grid Settings Button position is  failed ", vehiclesPage.Grid.isDisplayed());
        Assert.assertTrue(" Grid Settings Button assertion failed", btn);

    }

    @Then("the Sales Manager manager should be able to click Grid Settings button")
    public void the_sales_manager_manager_should_be_able_to_click_grid_settings_button() {

        BrowserUtils.waitForClickablility(vehiclesPage.Grid, 20);
        vehiclesPage.Grid.click();

    }

    @Then("the Sales Manager sees {string} , {string} and {string}")
      public void the_sales_manager_sees_and(String name, String sort, String show){

        Assert.assertEquals("Verification failed","NAME",vehiclesPage.nameGridDropdownSalesM.getText());
        Assert.assertEquals("Verification failed","SORT",vehiclesPage.sortGridDropdownSalesM.getText());
        Assert.assertEquals("Verification failed","SHOW",vehiclesPage.showGridDropdownSalesM.getText());



    }




}