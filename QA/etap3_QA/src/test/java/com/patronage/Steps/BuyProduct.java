package com.patronage.Steps;


import com.patronage.DriverFactory;
import com.patronage.Pages.BuyingProcessPage;
import com.patronage.Pages.MainPage;
import com.patronage.Pages.MyAddressesPage;
import cucumber.api.Scenario;
import cucumber.api.java8.En;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BuyProduct extends DriverFactory implements En {

    String baseUrl = "automationpractice.com";
    MainPage mp = PageFactory.initElements(driver, MainPage.class);
    BuyingProcessPage bpp = PageFactory.initElements(driver, BuyingProcessPage.class);
    MyAddressesPage map = PageFactory.initElements(driver, MyAddressesPage.class);
    WebDriverWait wait = new WebDriverWait(driver, 10);

    public BuyProduct() {

//        Before(Scenario -> {
//            driver = new DriverFactory().getDriver();
//            mp = PageFactory.initElements(driver, MainPage.class);
//            bpp = PageFactory.initElements(driver, BuyingProcessPage.class);
//            map = PageFactory.initElements(driver, MyAddressesPage.class);
//        });
//
//        After(Scenario -> {
//            new DriverFactory().destroyDriver();
//        });

        Given("^User is loged in on account$", () -> {
            driver.get("http://" + baseUrl);
            mp.login("gajek.krzysiek@gmail.com", "tester");
            driver.get("http://" + baseUrl);
        });

        When("^user click on the chosen product$", () -> {
            bpp.getProductLink().click();
        });

        And("^click on button add to cart$", () -> {
            bpp.getBtnAddToCart().click();
        });

        And("^click on button proceed to checkout$", () -> {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("layer_cart")));
            bpp.getBtnProceedToCheckout().click();
        });

        And("^submit button proceed to checkout in Summary$", () -> {
            bpp.getBtnInSummaryProceedToCheckout().click();
        });

        And("^fill all address information$", () -> {
           map.fastAddAddress();
        });

        And("^with chosen address submit button proceed to checkout$", () -> {
           bpp.getBtnInAddressProceedToCheckout().click();
        });

        And("^agree with terms of service afterwards click button proceed to checkout$", () -> {
            bpp.getTermsOfServiceCheckBox().click();
            bpp.getBtnInShippingProceedToCheckout().click();
        });

        And("^user choose payment method$", () -> {
            bpp.getBtnPaymentWithCheque().click();
        });

        And("^confirm order$", () -> {
            bpp.getBtnConfirmOrder().click();
        });

        Then("^user should see results$", () -> {

            wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("alert-success")));

            Assert.assertEquals("Your order on My Store is complete.",
                    driver.findElement(By.className("alert-success")).getText());

            driver.navigate().to("http://automationpractice.com/index.php?controller=addresses");
            driver.findElement(By.cssSelector("a.button-small:nth-child(2)")).click();
            driver.switchTo().alert().accept();
            mp.getBtnLogout().click();
        });
    }
}
