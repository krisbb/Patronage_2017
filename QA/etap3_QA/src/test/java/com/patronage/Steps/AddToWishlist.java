package com.patronage.Steps;


import com.patronage.BrowserDriver;
import com.patronage.Pages.MainPage;
import com.patronage.Pages.MyWishlistPage;
import cucumber.api.Scenario;
import cucumber.api.java8.En;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddToWishlist implements En{

    WebDriver driver = new ChromeDriver();
    String baseUrl = "automationpractice.com";
    MainPage  mp = PageFactory.initElements(driver, MainPage.class);
    MyWishlistPage mwp = PageFactory.initElements(driver, MyWishlistPage.class);

    public AddToWishlist() {

        After(Scenario -> {
            driver.quit();
        });

        Given("^user is logged in$", () -> {
            driver.get("http://" + baseUrl);
            mp.login("gajek.krzysiek@gmail.com", "tester");
            driver.get("http://" + baseUrl);
        });

        When("^user click on the product$", () -> {
            mwp.getProductLink().click();
        });

        And("^user click on the add to wishlist button$", () -> {
            mwp.getBtnAddToWishlist().click();
        });


        Then("^user should see message$", () -> {
            WebDriverWait wait = new WebDriverWait(driver, 10);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("fancybox-error")));
            Assert.assertEquals("Added to your wishlist.", driver.findElement(By.className("fancybox-error")).getText());
            // doesn't work ... end of ideas
            //driver.findElement(By.cssSelector("a.fancybox-item.fancybox-close")).click();
            //wait.until(ExpectedConditions.visibilityOf(mp.getBtnLogout()));
            driver.navigate().to("http://" + baseUrl);
            mp.getBtnLogout().click();
        });

    }

}
