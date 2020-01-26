package com.thoughtworks.model;

import com.thoughtworks.base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CustomerDetails extends BaseClass {

    @FindBy(xpath = "//*[@type=\"text\" and @name=\"name\"]")
    WebElement name;

    @FindBy(xpath = "//input[@type=\"text\" and @name=\"emailid\"]")
    WebElement email;

    @FindBy(xpath = "//input[@type=\"text\" and @name=\"pinCode\"]")
    WebElement pincode;

    @FindBy(xpath = "//input[@type=\"text\" and @name=\"address\"]")
    WebElement address;

    @FindBy(xpath = "//input[@name=\"position\" and @value=\"top\"]")
    WebElement homeType;

    @FindBy(xpath = "//*[@id=\"root\"]/div//select")
    WebElement countrySelection;

    @FindBy(xpath = "//input[@class='button']")
    WebElement continueBtn;

    public CustomerDetails(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    public void setName(String customerName)
    {
        name.sendKeys(customerName);
        loading();
    }

    public void setPinCode(String pinCodeValue)
    {
        pincode.sendKeys(pinCodeValue);
        loading();
    }

    public void setAddress(String newAddress)
    {
        address.sendKeys(newAddress);
        loading();
    }

    public void setType()
    {
        homeType.click();
        loading();
    }

    public void setEmail(String emailValue)
    {
        email.sendKeys(emailValue);
        loading();
    }

    public void selectCountry(String country)
    {
        Select select = new Select(countrySelection);
        select.selectByVisibleText(country);
        loading();
    }


    public void clickOnContinueButton()
    {
        continueBtn.click();
        loading();
    }
}
