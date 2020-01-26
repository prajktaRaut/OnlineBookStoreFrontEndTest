package com.thoughtworks.model;

import com.thoughtworks.base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartIcon extends BaseClass {

    @FindBy(xpath = "//button[@class=\"MuiButtonBase-root MuiIconButton-root\"]")
    WebElement displayCart;

    @FindBy(xpath= "//button[@class=\"MuiButtonBase-root MuiButton-root MuiButton-text\"]")
    WebElement addedToCart;

    @FindBy(xpath = "//input[@class=\"quantityButton.plusMinus\"]")
    WebElement quantity;

    @FindBy(xpath = "//*[@id=\"root\"]//a/p")
    WebElement remove;

    @FindBy(xpath = "//button[@id='panel1a-header']")
    WebElement proceedBtn;

    public CartIcon(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    public void clickOnCartIcon(){
        displayCart.click();
        loading();
        addedToCart.click();
    }

    public  void setQuantity(){
        quantity.clear();
        quantity.sendKeys("5");
        loading();
    }

    public void clickOnProceedButton()
    {
        proceedBtn.click();
        loading();
    }

}
