package com.patronage.Pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MyAddressesPage {

    @FindBy(how = How.CSS, using = "a.button-medium:nth-child(1)")
    private WebElement btnAddNewAddress;

    @FindBy(how = How.ID_OR_NAME, using = "firstname")
    private WebElement firstNameTextBox;

    @FindBy(how = How.ID_OR_NAME, using = "lastname")
    private WebElement lastNameTextBox;

    @FindBy(how = How.ID_OR_NAME, using = "address1")
    private WebElement addressTextBox;

    @FindBy(how = How.ID_OR_NAME, using = "city")
    private WebElement cityTextBox;

    @FindBy(how = How.ID_OR_NAME, using = "postcode")
    private WebElement postCodeTextBox;

    @FindBy(how = How.ID_OR_NAME, using = "phone_mobile")
    private WebElement mobilePhoneTextBox;

    @FindBy(how = How.ID_OR_NAME, using = "id_state")
    private WebElement stateIdSelect;

    @FindBy(how = How.ID_OR_NAME, using = "id_country")
    private WebElement countryIdSelect;

    @FindBy(how = How.ID_OR_NAME, using = "alias")
    private WebElement aliasTextBox;

    @FindBy(how = How.ID_OR_NAME, using = "submitAddress")
    private WebElement btnSubmitAddress;

    @FindBy(how = How.CSS, using = "a.button-small:nth-child(2)")
    private WebElement btnDeleteMyAddress;

    public WebElement getBtnDeleteMyAddress() { return btnDeleteMyAddress; }
    public WebElement getBtnAddNewAddress() { return btnAddNewAddress; }
    public WebElement getFirstNameTextBox() {
        return firstNameTextBox;
    }
    public WebElement getLastNameTextBox() {
        return lastNameTextBox;
    }
    public WebElement getAddressTextBox() {
        return addressTextBox;
    }
    public WebElement getCityTextBox() {
        return cityTextBox;
    }
    public WebElement getPostCodeTextBox() {
        return postCodeTextBox;
    }
    public WebElement getMobilePhoneTextBox() {
        return mobilePhoneTextBox;
    }
    public WebElement getStateIdSelect() {
        return stateIdSelect;
    }
    public WebElement getCountryIdSelect() {
        return countryIdSelect;
    }
    public WebElement getBtnSubmitAddress() {
        return btnSubmitAddress;
    }
    public WebElement getAliasTextBox() {
        return aliasTextBox;
    }

    public void fastAddAddress(){
        getFirstNameTextBox().clear();
        getFirstNameTextBox().sendKeys("KrzysztofTest");
        getLastNameTextBox().clear();
        getLastNameTextBox().sendKeys("GajekTest");
        getAddressTextBox().sendKeys("Narutowicza");
        getCityTextBox().sendKeys("Szczecin");
        getStateIdSelect().sendKeys("Colorado");
        getPostCodeTextBox().sendKeys("11111");
        getCountryIdSelect().sendKeys("United States");
        getMobilePhoneTextBox().sendKeys("123456789");
        getAliasTextBox().clear();
        getAliasTextBox().sendKeys("My new Title");

        getBtnSubmitAddress().click();
    }
}
