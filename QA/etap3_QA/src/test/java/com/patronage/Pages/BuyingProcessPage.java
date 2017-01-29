package com.patronage.Pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class BuyingProcessPage {

    @FindBy(how = How.CLASS_NAME, using = "product_img_link")
    private WebElement productLink;

    @FindBy(how = How.CSS, using ="button.exclusive") //or name Submit
    private WebElement btnAddToCart;

    @FindBy(how = How.CSS, using = "a.btn:nth-child(2)")
    private WebElement btnProceedToCheckout;

    @FindBy(how = How.CSS, using =".standard-checkout")
    private WebElement btnInSummaryProceedToCheckout;

    @FindBy(how = How.CSS, using ="button.button:nth-child(4)")
    private WebElement btnInAddressProceedToCheckout;

    @FindBy(how = How.ID_OR_NAME, using = "cgv")
    private WebElement termsOfServiceCheckBox;

    @FindBy(how = How.CSS, using ="button.button:nth-child(4)")
    private WebElement btnInShippingProceedToCheckout;

    @FindBy(how = How.CLASS_NAME, using="bankwire")
    private WebElement btnPaymentWithBankWire;

    @FindBy(how = How.CLASS_NAME, using="cheque")
    private WebElement btnPaymentWithCheque;

    @FindBy(how = How.CSS, using = "button.button-medium")
    private WebElement btnConfirmOrder;

    @FindBy(how = How.CLASS_NAME, using = "cheque-indent")
    private WebElement msgAfterConfirmPayingWithCheque;

    public WebElement getBtnAddToCart() {
        return btnAddToCart;
    }

    public WebElement getBtnProceedToCheckout() {
        return btnProceedToCheckout;
    }

    public WebElement getBtnInSummaryProceedToCheckout() {
        return btnInSummaryProceedToCheckout;
    }

    public WebElement getBtnInAddressProceedToCheckout() {
        return btnInAddressProceedToCheckout;
    }

    public WebElement getTermsOfServiceCheckBox() {
        return termsOfServiceCheckBox;
    }

    public WebElement getBtnInShippingProceedToCheckout() {
        return btnInShippingProceedToCheckout;
    }

    public WebElement getBtnPaymentWithBankWire() {
        return btnPaymentWithBankWire;
    }

    public WebElement getBtnPaymentWithCheque() {
        return btnPaymentWithCheque;
    }

    public WebElement getBtnConfirmOrder() {
        return btnConfirmOrder;
    }

    public WebElement getMsgAfterConfirmPayingWithCheque() {
        return msgAfterConfirmPayingWithCheque;
    }

    public WebElement getProductLink() {
        return productLink;
    }

}
