package com.vytrack.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class GridExample {

    public static void main(String[] args) throws MalformedURLException {

        // Create URL for the hub
        URL url = new URL("http://localhost:4445/wd/hub");

        // create options
        ChromeOptions chromeOptions = new ChromeOptions();

        // RemoteWebDriver--> used to open browser remotely using grid
        WebDriver driver = new RemoteWebDriver(url, chromeOptions);

        driver.get("https://selenium.dev");
        System.out.println(driver.getTitle());
        driver.quit();
    }
}