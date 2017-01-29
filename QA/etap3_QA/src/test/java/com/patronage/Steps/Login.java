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

public class Login implements En {

    WebDriver driver = new ChromeDriver();
    String baseUrl = "automationpractice.com";
    MainPage mp = PageFactory.initElements(driver, MainPage.class);

    public Login() {

        After(Scenario -> {
            driver.quit();
        });

        Given("^user is on main page$", () -> {
            driver.get("http://" + baseUrl);
        });

        When("^user click on sign in button$", () -> {
            mp.getBtnLogin().click();
        });

        And("^fill correctly email and password$", () -> {
            mp.getEmailTextBox().sendKeys("gajek.krzysiek@gmail.com");
            mp.getPasswdTextBox().sendKeys("tester");
        });

        /*And("^fill correctly \"([^\"]*)\" and \"([^\"]*)\"$", (String arg0, String arg1) -> {
            mp.getEmailTextBox().sendKeys(arg0);
            mp.getPasswdTextBox().sendKeys(arg1);
            throw new PendingException();
        });*/

        And("^click submit sign in$", () -> {
            mp.getBtnSubmitLogin().click();
        });

        Then("^user should see welcome information$", () -> {
            WebDriverWait wait = new WebDriverWait(driver, 10);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("info-account")));

            Assert.assertEquals(false, driver.findElements(By.className("info-account")).isEmpty());
            mp.getBtnLogout().click();
        });

    }
}
