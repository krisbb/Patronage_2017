package com.patronage;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {

    protected static WebDriver driver;

    public DriverFactory() {
        initialize();
    }

    public void initialize() {
        if (driver == null) {
            createNewDriverInstance();
        }
    }

    private void createNewDriverInstance() {
                driver = new ChromeDriver();
    }
/*
good but i can handle it without it
    public void setUrl() {
        if (url) {
            if (url.startsWith("http://") || url.startsWith("https://")) {
                driver.get(url)
            } else {
                driver.get("http://" + url)
            }
        }
    }
*/
    public WebDriver getDriver() {
        return driver;
    }

    public void destroyDriver() {
        // security ? :)
        if(driver !=null) {
            driver.quit();
            driver = null;
        }

    }

}
