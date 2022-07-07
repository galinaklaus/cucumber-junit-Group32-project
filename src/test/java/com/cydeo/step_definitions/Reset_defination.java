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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Reset_defination {
    WebDriver driver = Driver.getDriver();

    LoginPage loginPage = new LoginPage();

    DashboardPage dashboardPage=new DashboardPage();

    VehiclesPage vehiclesPage = new VehiclesPage();

    WebDriverWait wait = new WebDriverWait(driver, 10);

    @Given("User is on VyTrack homepage")
    public void user_is_on_vyTrack_homepage() {
//        driver.get(ConfigurationReader.getProperty("vytrack_login_url"));
//
//        loginPage.login(ConfigurationReader.getProperty("vytrack_username"),ConfigurationReader.getProperty("vytrack_password"));
    }
    @When("User clicks on Fleet")

    public void user_clicks_on_fleet() throws InterruptedException {
        if (ConfigurationReader.getProperty("vytrack_username").equals("user185")) {
            dashboardPage.fleetBtn.click();
            Thread.sleep(5000);
        } else {
            dashboardPage.fleet.click();
            Thread.sleep(5000);
        }
    }
    @Then("User clicks on Vehicles under Fleet dropdown")
    public void user_clicks_on_vehicles_under_fleet_dropdown() throws InterruptedException {
        dashboardPage.vehiclesBtn.click();
        Thread.sleep(5000);
    }

    @Then("user see title of page as {string}")
    public void user_see_title_of_page_as(String string)  {
        if (ConfigurationReader.getProperty("vytrack_username").equals("user185")){

            String expectedTitle = string.replace("All - ","");
            wait.until(ExpectedConditions.titleIs(expectedTitle));
            Assert.assertEquals(expectedTitle, Driver.getDriver().getTitle());
        }
        else {
            wait.until(ExpectedConditions.titleIs(string));
            Assert.assertEquals(string, Driver.getDriver().getTitle());
        }

    }
    @Then("User click Grid setting")
    public void user_click_grid_setting() throws InterruptedException {
        vehiclesPage.gridSetting.click();

        Thread.sleep(2000);
    }

    @Then("User see section with {string} heading")
    public void user_see_section_with_heading(String string) {
        String actualGrid = vehiclesPage.gridMsg.getText();

        Assert.assertEquals(string,actualGrid);
    }

    @When("User click on Id from checkbox")
    public void user_click_on_id_from_checkbox() throws InterruptedException {
        vehiclesPage.idButton.click();
        Thread.sleep(2000);
    }

    @Then("User see id column on vehicle page")
    public void user_see_id_column_on_vehicle_page() throws InterruptedException {
        if(ConfigurationReader.getProperty("vytrack_username").equals("storemanager220")) {

            String idMsg = vehiclesPage.idColumn.getText();
            System.out.println("resetPage.idColumn.isDisplayed() = " + vehiclesPage.idColumn.isDisplayed());
            Assert.assertEquals("ID", idMsg);
            Thread.sleep(2000);
        }
        else{

            String idMsg = vehiclesPage.idColumn1.getText();
            System.out.println("resetPage.idColumn1.isDisplayed() = " + vehiclesPage.idColumn1.isDisplayed());
            Assert.assertEquals("ID", idMsg);
            Thread.sleep(2000);
        }
    }
    @Then("User sees Reset button is on the left side of Grid settings")
    public void user_sees_reset_button_is_on_the_left_side_of_grid_settings() {

        boolean isOnLeft = vehiclesPage.IfBtnOnTheLeft("Grid Settings", "Reset");
        Assert.assertTrue("Verification of Reset button location failed", isOnLeft);
    }
    @When("User click the reset button")
    public void user_click_the_reset_button() {
        vehiclesPage.resetButton.click();
    }
    @Then("Id checkbox is unselected")
    public void id_checkbox_is_unselected() throws InterruptedException {
        if(ConfigurationReader.getProperty("vytrack_username").equals("storemanager220")) {
            String idMsg = vehiclesPage.idColumn.getText();
            Assert.assertEquals("LICENSE PLATE", idMsg);
            Thread.sleep(2000);
        }
        else{
            String idMsg = vehiclesPage.idColumn1.getText();
            Assert.assertEquals("LICENSE PLATE", idMsg);
            Thread.sleep(2000);
        }
    }
}

