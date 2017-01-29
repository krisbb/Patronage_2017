package com.patronage.Pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MainPage {

    @FindBy(how = How.CSS, using = "img.logo.img-responsive")
    private WebElement mainPageLogo;

    @FindBy(how = How.ID_OR_NAME, using = "search_query")
    private WebElement queryTextBox;

    @FindBy(how = How.ID_OR_NAME, using = "submit_search")
    private WebElement btnSubmitSearch;

    @FindBy(how = How.CLASS_NAME, using = "login")
    private WebElement btnLogin;

    @FindBy(how = How.ID_OR_NAME, using = "email")
    private WebElement emailTextBox;

    @FindBy(how = How.ID_OR_NAME, using = "passwd")
    private WebElement passwdTextBox;

    @FindBy(how = How.ID_OR_NAME, using = "SubmitLogin")
    private WebElement btnSubmitLogin;

    @FindBy(how = How.CLASS_NAME, using = "account")
    private WebElement btnMyAccount;

    @FindBy(how = How.CSS, using = "div.col-sm-6:nth-child(1) > ul:nth-child(1) > li:nth-child(4) > a:nth-child(1)")
    private WebElement btnMyAddresses;

    @FindBy(how = How.CSS, using = ".logout")
    private WebElement btnLogout;

    public WebElement getBtnLogout() { return  btnLogout; }
    public WebElement getQueryTextBox() { return queryTextBox; }
    public WebElement getBtnSubmitSearch() { return btnSubmitSearch; }
    public WebElement getMainPageLogo() { return mainPageLogo; }
    public WebElement getBtnSubmitLogin() { return btnSubmitLogin; }
    public WebElement getPasswdTextBox() { return passwdTextBox; }
    public WebElement getBtnLogin() { return btnLogin; }
    public WebElement getEmailTextBox() { return emailTextBox; }
    public WebElement getBtnMyAccount() { return btnMyAccount; }
    public WebElement getBtnMyAddresses() { return btnMyAddresses; }



    public void login( String username, String passwd ){
        getBtnLogin().click();
        getEmailTextBox().sendKeys(username);
        getPasswdTextBox().sendKeys(passwd);
        getBtnSubmitLogin().click();
    }

}
