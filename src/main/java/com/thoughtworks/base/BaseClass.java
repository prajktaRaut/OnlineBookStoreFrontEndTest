package com.thoughtworks.base;

import com.thoughtworks.generic.ExcelData;
import com.thoughtworks.properties.Library;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class BaseClass extends Library implements IAutoConstant {

    public static WebDriver driver;
    Logger log = Logger.getLogger(BaseClass.class);

    @Parameters("browserName")
    @BeforeMethod
    public void SetUp(String browserName)
    {
        if (browserName.equalsIgnoreCase("chrome"))
        {

            System.setProperty(CHROMEKEY,CHROMEVALUE);
            driver = new ChromeDriver();
            log.info("launching chrome browser");
            driver.manage().window().maximize();
            log.warn("Hey this just a warning message");
            log.fatal("hey this is just fatal error message");
            log.debug("this is debug message");
            String url = getProperty(CONFIGPATH, "URL");
            driver.get(url);
            log.info("entering application URL");
        }
        else if (browserName.equalsIgnoreCase("firefox"))
        {
            System.setProperty(FIREFOXKEY,FIREFOXVALUE);
            driver = new FirefoxDriver();
            driver.manage().window().maximize();
            String url = getProperty(CONFIGPATH, "URL");
            driver.get(url);
        }
    }

    @AfterMethod
    public void tearDown()
    {
        driver.close();
    }

    public void loading()
    {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @DataProvider(name="testData")
    public Object[][] getData() {
        ExcelData config = new ExcelData(EXCELPATH);
        int rows = config.getRowCount(0);
        Object[][] credentials = new Object[rows][5];

        for(int i = 0; i < rows; ++i) {

            credentials[i][0] = config.getData(0, i, 0);
            credentials[i][1] = config.getData(0, i, 1);
            credentials[i][2] = config.getData(0, i, 2);
            credentials[i][3] = config.getData(0, i, 3);
            credentials[i][4] = config.getData(0, i, 4);
        }
        return credentials;
    }
}
