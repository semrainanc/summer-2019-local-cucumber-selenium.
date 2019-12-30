package com.vytrack.step_definitions;

import com.vytrack.pages.LoginPage;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import io.cucumber.java.en.Given;
import org.junit.Assert;

public class AccountTypeStepDefs {

    @Given("the user logs in as a {string}")
    public void the_user_logs_in_as_a(String userType) {
        Driver.get().get(ConfigurationReader.get("url"));
        String username= null, password = null;
        switch (userType) {
            case "driver":
                username = ConfigurationReader.get("driver_username");
                password = ConfigurationReader.get("driver_password");
                break;
            case "sales manager":
                username = ConfigurationReader.get("sales_manager_username");
                password = ConfigurationReader.get("sales_manager_password");
                break;
            case "store manager":
                username = ConfigurationReader.get("store_manager_username");
                password = ConfigurationReader.get("store_manager_password");
                break;
            default:
                // Assert.fail --> just fails the test
                Assert.fail("Wrong user type provided");
        }
        new LoginPage().login(username, password);

    }
}