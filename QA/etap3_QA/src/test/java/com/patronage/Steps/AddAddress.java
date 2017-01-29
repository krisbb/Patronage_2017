package com.patronage.Steps;

import com.patronage.BrowserDriver;
import com.patronage.Pages.MainPage;
import com.patronage.Pages.MyAddressesPage;
import cucumber.api.Scenario;
import cucumber.api.java8.En;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddAddress implements En {

    WebDriver driver = new ChromeDriver();
    String baseUrl = "automationpractice.com";
    MainPage mp = PageFactory.initElements(driver, MainPage.class);
    MyAddressesPage map = PageFactory.initElements(driver, MyAddressesPage.class);

    public AddAddress() {

        /*Before(Scenario -> {
            driver = new ChromeDriver();
            mp = PageFactory.initElements(driver, MainPage.class);
            map = PageFactory.initElements(driver, MyAddressesPage.class);
        });*/

        After(Scenario -> {
            driver.quit();
        });

        Given("^user is logged in on account$", () -> {
            driver.get("http://" + baseUrl);
            mp.login("gajek.krzysiek@gmail.com", "tester");
        });

        And( "^navigate to my account page$" , () -> {
            mp.getBtnMyAccount().click();
        });

        When("^user click on my addresses button$", () -> {
            mp.getBtnMyAddresses().click();
        });

        And("^click on add new address button$", () -> {
            map.getBtnAddNewAddress().click();
        });

        And("^fill empty text boxes$", () -> {

            map.getFirstNameTextBox().clear();
            map.getFirstNameTextBox().sendKeys("KrzysztofTest");
            map.getLastNameTextBox().clear();
            map.getLastNameTextBox().sendKeys("GajekTest");
            map.getAddressTextBox().sendKeys("Narutowicza");
            map.getCityTextBox().sendKeys("Szczecin");
            map.getStateIdSelect().sendKeys("Colorado");
            map.getPostCodeTextBox().sendKeys("11111");
            map.getCountryIdSelect().sendKeys("United States");
            map.getMobilePhoneTextBox().sendKeys("123456789");
            map.getAliasTextBox().clear();
            map.getAliasTextBox().sendKeys("My new Title");

        });

        And("^click save button$", () -> {
            map.getBtnSubmitAddress().click();
        });

        Then("^user should see the new added data address$", () -> {
            WebDriverWait wait = new WebDriverWait(driver, 10);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("bloc_adresses")));

            Assert.assertEquals(false, driver.findElements(By.cssSelector(".page-subheading")).contains("My new Title"));

            map.getBtnDeleteMyAddress().click();
            driver.switchTo().alert().accept();
            mp.getBtnLogout().click();
        });
    }
}
