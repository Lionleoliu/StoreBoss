package POSAutomationtest;


import ShopKeeperPageResource.BaseForShopKeeper;
import io.appium.java_client.android.AndroidDriver;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.testng.annotations.*;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestMethod {
    private AndroidDriver driver;
    Logger logger = Logger.getLogger("TestMethod");

    public static void configure(){
    PropertyConfigurator.configure("E:\\YJPWork\\Code\\YJPRetailAutoTestDemo\\log4j.properties");
    }

    @BeforeSuite//设置
    public void setUp() throws IOException, InterruptedException {
        configure();
        Runtime.getRuntime().exec("cmd /c start E:\\Appium\\startappium.bat");
        Thread.sleep(5000L);
        driver = BaseForShopKeeper.SetUp();
    }

    public String refFormatNowDate() {
        Date nowTime = new Date(System.currentTimeMillis());
        SimpleDateFormat sdFormatter = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
        String retStrFormatNowDate = sdFormatter.format(nowTime);
        return retStrFormatNowDate;
    }

    @AfterMethod
    public void screenShot() throws IOException {
        String filePath = "E:\\YJPLPIC";
        String fileName = refFormatNowDate()+".png";
        File srcFile = driver.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile, new File(filePath + "\\" + fileName));
    }

}
