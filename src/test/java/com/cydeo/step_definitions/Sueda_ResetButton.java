package com.cydeo.step_definitions;

import com.cydeo.pages.Vytrack_pages.DashboardPage;
import com.cydeo.pages.Vytrack_pages.VehiclesPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Sueda_ResetButton {

    DashboardPage dashboardPage = new DashboardPage();
    VehiclesPage vehiclesPage = new VehiclesPage();

    @Given("the user is on Vytrack homepage")
    public void the_user_is_on_vytrack_homepage() {
    }
    @When("the user clicks on Fleet dropdown")
    public void theUserClicksOnFleetDropdown() {
        BrowserUtils.waitFor(2);
        dashboardPage.fleetBtn_manager.click();
    }
    @Then("the user clicks on Vehicles under Fleet dropdown")
    public void the_user_clicks_on_vehicles_under_fleet_dropdown() {
        BrowserUtils.waitFor(2);
        dashboardPage.vehiclesBtn.click();
    }
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
//     @Then("the sales manager sees popup with {string} heading")
//     public void the_sales_manager_sees_popup_with_heading(String string) {
//         BrowserUtils.waitFor(2);
//         Assert.assertEquals(string, vehiclesPage.gridMsg.getText());
//     }
    @When("the sales manager should be able to select Id item checkbox")
    public void the_sales_manager_should_be_able_to_select_id_item_checkbox() {
        BrowserUtils.waitFor(2);
        vehiclesPage.idButton.click();
    }
    @Then("the sales manager sees Id column")
    public void the_sales_manager_sees_id_column() {
        BrowserUtils.waitFor(2);
        Assert.assertTrue(vehiclesPage.idButton.isDisplayed());
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
    @Then("the sales manager should be able to see previously selected item is unselected")
    public void the_sales_manager_should_be_able_to_see_previously_selected_item_is_unselected() {
        BrowserUtils.waitFor(2);
        Assert.assertFalse(vehiclesPage.idButton.isSelected());
    }

}
