package com.thoughtworks.test;

import com.thoughtworks.base.BaseClass;
import com.thoughtworks.model.AddToCart;
import com.thoughtworks.model.CartIcon;
import com.thoughtworks.model.CustomerDetails;
import com.thoughtworks.model.OrderConfirmation;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

@Listeners(com.thoughtworks.base.Listener.class)
public class OrderConfirmationTest extends BaseClass {


    @Test
    public void performOperationOnConfirmOrder() {

        AddToCart add = new AddToCart(driver);
        add.clickOnAddToCartBtn();
        CartIcon icon = new CartIcon(driver);
        icon.clickOnCartIcon();
        icon.setQuantity();
        icon.clickOnProceedButton();
        CustomerDetails customerDetails = new CustomerDetails(driver);
        customerDetails.setName("Hemil");
        customerDetails.setEmail("hemil123@gmail.com");
        customerDetails.setPinCode("444106");
        customerDetails.setAddress("Pune");
        customerDetails.selectCountry("Other");
        customerDetails.setType();
        customerDetails.clickOnContinueButton();
        OrderConfirmation confirmation = new OrderConfirmation(driver);
        confirmation.clickOnCheckoutButton();
        confirmation.clickOnContinueShopping();
    }
}
