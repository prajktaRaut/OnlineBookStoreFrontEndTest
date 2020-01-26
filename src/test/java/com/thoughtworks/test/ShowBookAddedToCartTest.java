package com.thoughtworks.test;

import com.thoughtworks.base.BaseClass;
import com.thoughtworks.model.AddToCart;
import com.thoughtworks.model.CartIcon;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(com.thoughtworks.base.Listener.class)
public class ShowBookAddedToCartTest extends BaseClass {

    @Test
    public void showBookAddedToCart(){

            AddToCart add = new AddToCart(driver);
            add.clickOnAddToCartBtn();
            CartIcon icon = new CartIcon(driver);
            icon.clickOnCartIcon();
            icon.setQuantity();
            icon.clickOnProceedButton();
    }
}
