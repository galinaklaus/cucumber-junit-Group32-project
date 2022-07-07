package com.cydeo.step_definitions;

import com.cydeo.pages.Vytrack_pages.LoginPage;
import com.cydeo.pages.Vytrack_pages.VehiclePageGrid;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GridResetStepDef {


    LoginPage loginPage = new LoginPage();

    VehiclePageGrid vehiclePageGrid = new VehiclePageGrid();



    @Given("the Sales Manager is on Vytrack homepage")
    public void the_sales_manager_is_on_vytrack_homepage() throws InterruptedException {

        Driver.getDriver().get("vytrack_login_url");
        loginPage.login((ConfigurationReader.getProperty("vytrack_username")),(ConfigurationReader.getProperty("vytrack_password")));

    }
    @When("the Sales Manager clicks on Fleet dropdown")
    public void the_sales_manager_clicks_on_fleet_dropdown() {

        BrowserUtils.waitForClickablility(vehiclePageGrid.feetMenu,5);
        vehiclePageGrid.feetMenu.click();


    }
    @Then("the Sales Manager clicks on Vehicles under fleet dropdown")
    public void the_sales_manager_clicks_on_vehicles_under_fleet_dropdown() {

        vehiclePageGrid.vehicles.click();

    }

    @Given("the Sales Manager is on Vehicle page")
    public void the_sales_manager_is_on_vehicle_page() {



    }
    @When("the Sales Manager sees Grid Settings is on the right side of the Reset button and on the right side of the page")
    public void the_sales_manager_sees_grid_settings_is_on_the_right_side_of_the_reset_button_and_on_the_right_side_of_the_page() {



    }
    @Then("the Sales Manager should be able to click Grid Settings button")
    public void the_sales_manager_should_be_able_to_click_grid_settings_button() {

    }

}
