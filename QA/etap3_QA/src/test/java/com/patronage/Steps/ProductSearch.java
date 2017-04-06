package com.patronage.Steps;


import com.patronage.DriverFactory;
import com.patronage.Pages.MainPage;
import cucumber.api.java8.En;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductSearch extends DriverFactory implements En {


    String baseUrl = "automationpractice.com";
    MainPage mp = PageFactory.initElements(driver, MainPage.class);


    public ProductSearch(){

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
