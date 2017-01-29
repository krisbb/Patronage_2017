package com.patronage.Pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MyWishlistPage {

    @FindBy(how = How.CLASS_NAME, using = "product_img_link")
    private WebElement productLink;

    @FindBy(how = How.ID_OR_NAME, using = "wishlist_button")
    private WebElement btnAddToWishlist;

    @FindBy(how = How.CLASS_NAME, using = "fancybox-error")
    private WebElement addedToWishListMsg;

    @FindBy(how = How.CSS, using = ".fancybox-close")
    private WebElement btnCloseWishListMsg;

    @FindBy(how = How.CLASS_NAME, using = "lnk_wishlist")
    private WebElement btnMyWishlist;

    @FindBy(how = How.CSS , using = ".wishlist_delete > a:nth-child(1)")
    private WebElement btnDeleteWishlist;

    public WebElement getProductLink() {
        return productLink;
    }

    public WebElement getBtnAddToWishlist() {
        return btnAddToWishlist;
    }

    public WebElement getAddedToWishListMsg() {
        return addedToWishListMsg;
    }

    public WebElement getBtnCloseWishListMsg() {
        return btnCloseWishListMsg;
    }

    public WebElement getBtnMyWishlist() {
        return btnMyWishlist;
    }

    public WebElement getBtnDeleteWishlist() {
        return btnDeleteWishlist;
    }

}
