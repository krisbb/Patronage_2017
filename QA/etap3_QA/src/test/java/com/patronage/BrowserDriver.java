package com.patronage;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

/*
Probowalem rozwiazac "problem" otwierania sie przegladarek
liczba otwartych przegladarek = liczbie plikow .feature

Singleton jako wzorzec dalby mi taka mozliwosc
wszystko ladnie dzialalo dopoki nie zaczelo mi zwracac dziwnych
bledow o braku elementu ,ktory zostal klikniety
TODO

Usage : Webdriver driver = BrowserDriver.getBrowserDriver().getDriver();
 */

public class BrowserDriver {
    private WebDriver driver;
    private static BrowserDriver browserDriver;

    private BrowserDriver(){
        driver = new ChromeDriver();
        //driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }

    public static BrowserDriver getBrowserDriver() {
        if( browserDriver == null ) {
            browserDriver = new BrowserDriver();
        }
        return browserDriver;
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    @Override
    public void finalize() {
        driver.quit();
    }
}
