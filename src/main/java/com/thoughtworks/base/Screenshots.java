package com.thoughtworks.base;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

public class Screenshots extends BaseClass{

    public void getScreenShots(WebDriver driver, String testName)
    {
        try {
            TakesScreenshot takesScreenshot= (TakesScreenshot) driver;
            System.out.println("Driver:"+driver);
            File srcFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
            File destFile = new File("/home/user23/IdeaProjects/OnlineBookStoreUI/src/test/resources/Screenshot"+testName+ LocalDateTime.now() +".jpg");
            FileUtils.copyFile(srcFile,destFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
