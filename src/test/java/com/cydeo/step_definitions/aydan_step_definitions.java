package com.cydeo.step_definitions;

import com.cydeo.pages.Vytrack_pages.DashboardPage;
import com.cydeo.pages.Vytrack_pages.LoginPage;
import com.cydeo.pages.Vytrack_pages.VehiclesPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.junit.Assert;

public class aydan_step_definitions {

    DashboardPage dashboardPage= new DashboardPage();
    LoginPage loginPage = new LoginPage();
    VehiclesPage vehiclesPage = new VehiclesPage();



    @Given("the user is on VyTrack homepage")
    public void the_user_is_on_vy_track_homepage()  {


    }
    @Given("the user clicks on Fleet")
    public void the_user_clicks_on_fleet()  {

        BrowserUtils.waitFor(2);
        dashboardPage.fleetBtn.click();





    }
    @Given("the user clicks on Vehicles under Fleet dropdown")
    public void the_user_clicks_on_vehicles_under_fleet_dropdown()  {

        BrowserUtils.waitFor(2);
        dashboardPage.vehiclesBtn.click();

    }
    @Then("Truck driver see title of page as {string}")
    public void truck_driver_see_title_of_page_as(String string) {

        BrowserUtils.waitFor(2);
        String actualtitle = Driver.getDriver().getTitle();

        Assert.assertEquals(string,actualtitle);


    }
    @Given("Truck driver click Grid setting")
    public void truck_driver_click_grid_setting()  {
        BrowserUtils.waitFor(2);
        vehiclesPage.gridSetting.click();

    }
    @Then("Truck driver see section with {string} heading")
    public void truck_driver_see_section_with_heading(String string) {

        BrowserUtils.waitFor(2);
        String actualmessage= vehiclesPage.gridMsg.getText();
        Assert.assertEquals(string,actualmessage);

    }

    @When("Truck driver click on Id from checkbox")
    public void truck_driver_click_on_id_from_checkbox()  {


        BrowserUtils.waitFor(2);
        vehiclesPage.idButton.click();

    }

    @Then("Truck driver see Id checkbox is selected")
    public void truck_driver_see_id_checkbox_is_selected()  {
        BrowserUtils.waitFor(2);
        System.out.println("vehiclesPage.idColumn1.isDisplayed() = " + vehiclesPage.idColumn1.isDisplayed());


    }

    @When("Truck driver sees reset on the left side of the Grid setting")
    public void truck_driver_sees_reset_on_the_left_side_of_the_grid_setting()  {

       BrowserUtils.waitFor(2);
   boolean Isonleft = vehiclesPage.IfBtnOnTheLeft("Grid Settings",  "Reset");
   Assert.assertTrue("verfication is reset button it on left of grid seeting",Isonleft);

    }
    @When("Truck driver clicks the reset button")
    public void truck_driver_the_reset_button()  {
        BrowserUtils.waitFor(2);
      vehiclesPage.resetButton.click();




    }
    @Then("Truck driver see Id checkbox is unselected")
    public void truck_driver_see_id_checkbox_is_unselected()  {
        BrowserUtils.waitFor(2);
      Assert.assertFalse("Id box is not selected ", vehiclesPage.idButton.isSelected());


    }














}
