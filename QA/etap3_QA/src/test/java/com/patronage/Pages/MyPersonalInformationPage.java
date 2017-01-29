package com.patronage.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MyPersonalInformationPage  {


    @FindBy(how = How.CSS, using = "div.col-sm-6:nth-child(1) > ul:nth-child(1) > li:nth-child(5) > a:nth-child(1)")
    private WebElement btnMyPersonalInformation;

    @FindBy(how = How.CSS, using = "#uniform-id_gender1.radio")
    private WebElement radiobtnGender;

    @FindBy(how = How.ID_OR_NAME, using = "firstname")
    private WebElement firstNameTextBox;

    @FindBy(how = How.ID_OR_NAME, using = "lastname")
    private WebElement lastNameTextBox;

    @FindBy(how = How.ID_OR_NAME, using = "email")
    private WebElement emailTextBox;

    @FindBy(how = How.ID_OR_NAME, using = "days")
    private WebElement dayOfDateBirthSelect;

    @FindBy(how = How.ID_OR_NAME, using = "months")
    private WebElement monthOfDateBirthSelect;

    @FindBy(how = How.ID_OR_NAME, using = "years")
    private WebElement yearOfDateBirthSelect;

    @FindBy(how = How.ID_OR_NAME, using = "old_passwd")
    private WebElement currentPasswdTextBox;

    @FindBy(how = How.ID_OR_NAME, using = "passwd")
    private WebElement newPasswdTextBox;

    @FindBy(how = How.ID_OR_NAME, using = "confirmation")
    private WebElement passwdConfirmationTextBox;

    @FindBy(how = How.ID_OR_NAME, using = "submitIdentity")
    private WebElement btnSubmitIdentity;

    public WebElement getBtnMyPersonalInformation() {
        return btnMyPersonalInformation;
    }

    public WebElement getRadiobtnGender() {
        return radiobtnGender;
    }

    public WebElement getFirstNameTextBox() {
        return firstNameTextBox;
    }

    public WebElement getLastNameTextBox() {
        return lastNameTextBox;
    }

    public WebElement getEmailTextBox() {
        return emailTextBox;
    }

    public WebElement getDayOfDateBirthSelect() {
        return dayOfDateBirthSelect;
    }

    public WebElement getMonthOfDateBirthSelect() {
        return monthOfDateBirthSelect;
    }

    public WebElement getYearOfDateBirthSelect() {
        return yearOfDateBirthSelect;
    }

    public WebElement getCurrentPasswdTextBox() { return currentPasswdTextBox; }

    public WebElement getNewPasswdTextBox() {
        return newPasswdTextBox;
    }

    public WebElement getPasswdConfirmationTextBox() {
        return passwdConfirmationTextBox;
    }

    public WebElement getBtnSubmitIdentity() {
        return btnSubmitIdentity;
    }



}
