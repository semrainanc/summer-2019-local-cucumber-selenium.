package com.vytrack.step_definitions;

import com.vytrack.pages.LoginPage;
import com.vytrack.utilities.ConfigurationReader;
import io.cucumber.java.en.Given;

public class AccountTypeStepDefs {

    @Given("the user logs in as a {string}")
    public void the_user_logs_in_as_a(String string) {
        String dUsername = ConfigurationReader.get(string);
        String dPassword = ConfigurationReader.get(string + "_password");
        LoginPage loginPage = new LoginPage();
        loginPage.login(dUsername, dPassword);
    }
}