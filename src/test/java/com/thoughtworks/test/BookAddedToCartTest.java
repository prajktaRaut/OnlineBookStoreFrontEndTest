package com.thoughtworks.test;

import com.thoughtworks.base.BaseClass;
import com.thoughtworks.model.AddToCart;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(com.thoughtworks.base.Listener.class)
public class BookAddedToCartTest extends BaseClass {

    @Test
    public void performOperationOnAddToCartButton() {
            AddToCart add = new AddToCart(driver);
            add.clickOnAddToCartBtn();
    }
}


