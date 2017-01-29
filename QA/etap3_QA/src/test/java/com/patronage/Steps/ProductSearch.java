package com.patronage.Steps;


import com.patronage.BrowserDriver;
import com.patronage.Pages.MainPage;
import cucumber.api.java8.En;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductSearch implements En {

    WebDriver driver = new ChromeDriver();
    String baseUrl = "automationpractice.com";
    MainPage mp = PageFactory.initElements(driver, MainPage.class);


    public ProductSearch(){

        After(Scenario -> {
            driver.quit();
        });

        Given("^user is on start page$", () -> {
            driver.get("http://" + baseUrl);
        });

        When("^user provide search phrase$", () -> {
            mp.getQueryTextBox().sendKeys("dress");
            mp.getBtnSubmitSearch().click();
        });

        Then("^user should see search results$", () -> {
            WebDriverWait wait = new WebDriverWait(driver, 10);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".product_list")));

            Assert.assertEquals(false, driver.findElements(By.cssSelector(".product_list")).isEmpty());
        });

    }
}
