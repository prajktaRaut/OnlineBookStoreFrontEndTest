package com.thoughtworks.test;

import com.thoughtworks.base.BaseClass;
import com.thoughtworks.model.AddToCart;
import com.thoughtworks.model.CartIcon;
import com.thoughtworks.model.CustomerDetails;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(com.thoughtworks.base.Listener.class)
public class AddCustomerDetailsTest extends BaseClass {

    @Test(dataProvider="testData",dataProviderClass = BaseClass.class)
    public void performOperationOnAddedCustomerDetails(String name, String email, String pinCode, String address, String country) {
        try {
            System.out.println("Name is "+name);
            AddToCart add = new AddToCart(driver);
            add.clickOnAddToCartBtn();
            CartIcon icon = new CartIcon(driver);
            icon.clickOnCartIcon();
            icon.setQuantity();
            icon.clickOnProceedButton();
            CustomerDetails customerDetails = new CustomerDetails(driver);
            customerDetails.setName(name);
            customerDetails.setEmail(email);
            customerDetails.setPinCode(pinCode);
            customerDetails.setAddress(address);
            customerDetails.selectCountry(country);
            customerDetails.setType();
            customerDetails.clickOnContinueButton();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
