package com.patronage.Steps;


import com.patronage.BrowserDriver;
import com.patronage.Pages.MainPage;
import com.patronage.Pages.MyPersonalInformationPage;
import cucumber.api.Scenario;
import cucumber.api.java8.En;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UpdatePersonalInfo implements En {

    WebDriver driver = new ChromeDriver();
    String baseUrl = "automationpractice.com";
    MainPage mp = PageFactory.initElements(driver, MainPage.class);
    MyPersonalInformationPage mpip = PageFactory.initElements(driver, MyPersonalInformationPage.class);

    public UpdatePersonalInfo() {

        After(Scenario -> {

            driver.quit();
        });

        Given("^user is loged in on account$", () -> {
            driver.get("http://" + baseUrl);
            mp.login("gajek.krzysiek@gmail.com","tester");
        });

        When("^user click on the my personal information button$", () -> {
            mpip.getBtnMyPersonalInformation().click();
        });

        And("^fill textboxes$", () -> {
            mpip.getRadiobtnGender().click();
            mpip.getFirstNameTextBox().clear();
            mpip.getFirstNameTextBox().sendKeys("Krzysztof");
            mpip.getLastNameTextBox().clear();
            mpip.getLastNameTextBox().sendKeys("Gajek");
            mpip.getEmailTextBox().clear();
            mpip.getEmailTextBox().sendKeys("gajek.krzysiek@gmail.com");

            //Birth Date
            mpip.getDayOfDateBirthSelect().sendKeys("5");
            mpip.getMonthOfDateBirthSelect().sendKeys("August");
            mpip.getYearOfDateBirthSelect().sendKeys("1994");

            mpip.getCurrentPasswdTextBox().sendKeys("tester");
        });

        And("^click save/update button$", () -> {
            mpip.getBtnSubmitIdentity().click();
        });

        Then("^user should see message that description is changed$", () -> {
            WebDriverWait wait = new WebDriverWait(driver, 10);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("box")));

            Assert.assertEquals("Your personal information has been successfully updated.",
                    driver.findElement(By.cssSelector(".alert.alert-success"))
                    .getText());
            mp.getBtnLogout().click();
        });


    }

}
