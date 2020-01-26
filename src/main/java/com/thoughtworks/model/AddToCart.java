package com.thoughtworks.model;

import com.thoughtworks.base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCart extends BaseClass {

    @FindBy(xpath="//button[@id='cartButton1']//span[text()='Add To Cart']")
    WebElement addBook;

    public AddToCart(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    public void clickOnAddToCartBtn()
    {
        addBook.click();
        loading();
    }

}
