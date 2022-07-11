package com.cydeo.step_definitions;

import com.cydeo.pages.Vytrack_pages.DashboardPage;
import com.cydeo.pages.Vytrack_pages.LoginPage;
import com.cydeo.pages.Vytrack_pages.VehiclesPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Reset_defination {

    WebDriver driver = Driver.getDriver();

    LoginPage loginPage = new LoginPage();

    DashboardPage dashboardPage=new DashboardPage();

    VehiclesPage vehiclesPage = new VehiclesPage();

    @Given("User is on VyTrack homepage")
    public void user_is_on_vyTrack_homepage() {
        System.out.println();
    }

    @When("User clicks on Fleet")
    public void user_clicks_on_fleet()  {
        Driver.getDriver().manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        if (ConfigurationReader.getProperty("vytrack_username").equals("user185")) {
            dashboardPage.fleetBtn_truckDriver.click();

        } else {
            dashboardPage.fleetBtn_manager.click();
        }
    }

    @Then("User clicks on Vehicles under Fleet dropdown")
    public void user_clicks_on_vehicles_under_fleet_dropdown() {
        dashboardPage.vehiclesBtn.click();
        Driver.getDriver().manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }

    @Then("User see title of page")
    public void user_see_title_of_page() {
        Driver.getDriver().manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        if (ConfigurationReader.getProperty("vytrack_username").equals("user185")){

            Assert.assertEquals(vehiclesPage.titleDriver, Driver.getDriver().getTitle());
        }
        else {

            Assert.assertEquals(vehiclesPage.titleManager, Driver.getDriver().getTitle());
        }
    }

    @Then("User click Grid setting")
    public void user_click_grid_setting() {
        vehiclesPage.gridSetting.click();
        Driver.getDriver().manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }

    @Then("User see section with {string} heading")
    public void user_see_section_with_heading(String string) {
        String actualGrid = vehiclesPage.gridMsg.getText();

        Assert.assertEquals(string,actualGrid);
    }

    @When("User click on Id from checkbox")
    public void user_click_on_id_from_checkbox()  {
        vehiclesPage.idButton1.click();
        Driver.getDriver().manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }

    @Then("User see id checkbox is selected")
    public void user_see_id_checkbox_is_selected() {

        System.out.println("vehiclesPage.idButton.isSelected() = " + vehiclesPage.idButton1.isSelected());
    }

    @Then("User sees Reset button is on the left side of Grid settings")
    public void user_sees_reset_button_is_on_the_left_side_of_grid_settings() {

        boolean isOnLeft = vehiclesPage.IfBtnOnTheLeft("Grid Settings", "Reset");
        Assert.assertTrue("Verification of Reset button location failed", isOnLeft);
    }
    @When("User click the reset button")
    public void user_click_the_reset_button() {
        vehiclesPage.resetBtn.click();
    }
    @Then("User see id checkbox is unselected")
    public void user_see_id_checkbox_is_unselected() {

        System.out.println("vehiclesPage.idButton.isSelected() = " + vehiclesPage.idButton1.isSelected());
    }

}

