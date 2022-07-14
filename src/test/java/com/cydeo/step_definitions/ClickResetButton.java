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

public class ClickResetButton {

    DashboardPage dashboardPage = new DashboardPage();
    VehiclesPage vehiclesPage = new VehiclesPage();

    @Given("the user is on Vytrack homepage")
    public void the_user_is_on_vytrack_homepage() {
        System.out.println();
    }
//     @When("the user clicks on Fleet dropdown")
//     public void theUserClicksOnFleetDropdown() {
//         BrowserUtils.waitFor(2);
//         if(ConfigurationReader.getProperty("vytrack_username").contains("salesmanager") || ConfigurationReader.getProperty("vytrack_username").contains("storemanager")) {
//             dashboardPage.fleetBtn_manager.click();
//         }else{
//             dashboardPage.fleetBtn_truckDriver.click();
//         }
//     }
    @Then("the user clicks on Vehicles under Fleet dropdown")
    public void the_user_clicks_on_vehicles_under_fleet_dropdown() {
        BrowserUtils.waitFor(2);
        dashboardPage.vehiclesBtn.click();
    }

    // sales manager part

    @Then("the sales manager sees title of page as {string}")
    public void the_sales_manager_sees_title_of_page_as(String string) {
        BrowserUtils.waitFor(2);
        Assert.assertEquals(string, Driver.getDriver().getTitle());
    }
    @Then("the sales manager clicks Grid settings button")
    public void the_sales_manager_clicks_grid_settings_button() {
        BrowserUtils.waitFor(2);
        vehiclesPage.gridSetting.click();
    }
    @Then("the sales manager sees popup with {string} heading")
    public void the_sales_manager_sees_popup_with_heading(String string) {
        BrowserUtils.waitFor(2);
        Assert.assertEquals(string, vehiclesPage.gridMsg.getText());
    }
    @When("the sales manager should be able to select Id item checkbox")
    public void the_sales_manager_should_be_able_to_select_id_item_checkbox() {
        BrowserUtils.waitFor(2);
        vehiclesPage.idButton.click();
    }
    @Then("the sales manager sees Id checkbox is selected")
    public void theSalesManagerSeesIdCheckboxIsSelected() {
        BrowserUtils.waitFor(2);
        System.out.println("vehiclesPage.idButton.isSelected() = " + vehiclesPage.idButton.isSelected());
        Assert.assertTrue(vehiclesPage.idButton.isSelected());
    }
    @Then("the sales manager sees reset button on the left side of Grid settings")
    public void the_sales_manager_sees_reset_button_on_the_left_side_of_grid_settings() {
        BrowserUtils.waitFor(2);
        boolean isOnLeft = vehiclesPage.IfBtnOnTheLeft("Grid Settings", "Reset");
        Assert.assertTrue("Verification of Reset button location failed", isOnLeft);
    }
    @Then("the sales manager should be able to click reset button")
    public void the_sales_manager_should_be_able_to_click_reset_button() {
        BrowserUtils.waitFor(2);
        vehiclesPage.resetBtn.click();
    }
    @Then("the sales manager sees Id checkbox is unselected")
    public void theSalesManagerSeesIdCheckboxIsUnselected() {
        BrowserUtils.waitFor(2);
        System.out.println("vehiclesPage.idButton.isSelected() = " + vehiclesPage.idButton.isSelected());
        Assert.assertFalse(vehiclesPage.idButton.isSelected());
    }

    // store manager part

    @Then("the store manager sees title of page as {string}")
    public void the_store_manager_sees_title_of_page_as(String string) {
        BrowserUtils.waitFor(2);
        Assert.assertEquals(string, Driver.getDriver().getTitle());
    }
    @Then("the store manager clicks Grid settings button")
    public void the_store_manager_clicks_grid_settings_button() {
        BrowserUtils.waitFor(2);
        vehiclesPage.gridSetting.click();
    }
    @Then("the store manager sees popup with {string} heading")
    public void the_store_manager_sees_popup_with_heading(String string) {
        BrowserUtils.waitFor(2);
        Assert.assertEquals(string, vehiclesPage.gridMsg.getText());
    }
    @When("the store manager should be able to select Id item checkbox")
    public void the_store_manager_should_be_able_to_select_id_item_checkbox() {
        BrowserUtils.waitFor(2);
        vehiclesPage.idButton.click();
    }
    @Then("the store manager sees Id checkbox is selected")
    public void theStoreManagerSeesIdCheckboxIsSelected() {
        BrowserUtils.waitFor(2);
        System.out.println("vehiclesPage.idButton.isSelected() = " + vehiclesPage.idButton.isSelected());
        Assert.assertTrue(vehiclesPage.idButton.isSelected());
    }
    @Then("the store manager sees reset button on the left side of Grid settings")
    public void the_store_manager_sees_reset_button_on_the_left_side_of_grid_settings() {
        BrowserUtils.waitFor(2);
        boolean isOnLeft = vehiclesPage.IfBtnOnTheLeft("Grid Settings", "Reset");
        Assert.assertTrue("Verification of Reset button location failed", isOnLeft);
    }
    @Then("the store manager should be able to click reset button")
    public void the_store_manager_should_be_able_to_click_reset_button() {
        BrowserUtils.waitFor(2);
        vehiclesPage.resetBtn.click();
    }
    @Then("the store manager sees Id checkbox is unselected")
    public void theStoreManagerSeesIdCheckboxIsUnselected() {
        BrowserUtils.waitFor(2);
        System.out.println("vehiclesPage.idButton.isSelected() = " + vehiclesPage.idButton.isSelected());
        Assert.assertFalse(vehiclesPage.idButton.isSelected());
    }

    // truck driver part

    @Then("the truck driver sees title of page as {string}")
    public void the_truck_driver_sees_title_of_page_as(String string) {
        BrowserUtils.waitFor(2);
        Assert.assertEquals(string, Driver.getDriver().getTitle());
    }
    @Then("the truck driver clicks Grid settings button")
    public void the_truck_driver_clicks_grid_settings_button() {
        BrowserUtils.waitFor(2);
        vehiclesPage.gridSetting.click();
    }
    @Then("the truck driver sees popup with {string} heading")
    public void the_truck_driver_sees_popup_with_heading(String string) {
        BrowserUtils.waitFor(2);
        Assert.assertEquals(string, vehiclesPage.gridMsg.getText());
    }
    @When("the truck driver should be able to select Id item checkbox")
    public void the_truck_driver_should_be_able_to_select_id_item_checkbox() {
        BrowserUtils.waitFor(2);
        vehiclesPage.idButton.click();
    }
    @Then("the truck driver sees Id checkbox is selected")
    public void theTruckDriverSeesIdCheckboxIsSelected() {
        BrowserUtils.waitFor(2);
        System.out.println("vehiclesPage.idButton.isSelected() = " + vehiclesPage.idButton.isSelected());
        Assert.assertTrue(vehiclesPage.idButton.isSelected());
    }
    @Then("the truck driver sees reset button on the left side of Grid settings")
    public void the_truck_driver_sees_reset_button_on_the_left_side_of_grid_settings() {
        BrowserUtils.waitFor(2);
        boolean isOnLeft = vehiclesPage.IfBtnOnTheLeft("Grid Settings", "Reset");
        Assert.assertTrue("Verification of Reset button location failed", isOnLeft);
    }
    @Then("the truck driver should be able to click reset button")
    public void the_truck_driver_should_be_able_to_click_reset_button() {
        BrowserUtils.waitFor(2);
        vehiclesPage.resetBtn.click();
    }
    @Then("the truck driver sees Id checkbox is unselected")
    public void theTruckDriverSeesIdCheckboxIsUnselected() {
        BrowserUtils.waitFor(2);
        System.out.println("vehiclesPage.idButton.isSelected() = " + vehiclesPage.idButton.isSelected());
        Assert.assertFalse(vehiclesPage.idButton.isSelected());
    }



}
