package com.thoughtworks.model;

import com.thoughtworks.base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderConfirmation extends BaseClass {


    @FindBy(xpath = "//span[@class=\"MuiButton-label\"]")
    WebElement continueShopping;

    @FindBy(xpath = "//span[contains(text(),'Checkout')]")
    WebElement checkoutBtn;

    public OrderConfirmation(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    public void clickOnContinueShopping()
    {
        continueShopping.click();
        loading();
    }

    public void clickOnCheckoutButton() {
        checkoutBtn.click();
        loading();
    }

}
