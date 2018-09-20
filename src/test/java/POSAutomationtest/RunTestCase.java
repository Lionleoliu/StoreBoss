package POSAutomationtest;

import ShopKeeperPageResource.BaseForShopKeeper;
import ShopKeeperPageResource.LoginPageForShopKeeper;
import ShopKeeperPageResource.MainPageForShopKeeper;
import ShopKeeperPageResource.ShopPageForShopKeeper;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import java.io.IOException;
import java.net.MalformedURLException;
import java.sql.SQLException;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class RunTestCase extends BaseForShopKeeper {

    private AndroidDriver driver;//全局变量

    @BeforeSuite//设置
    public void setUp() throws IOException, InterruptedException {
//        Runtime.getRuntime().exec("cmd /c start E:\\Appium\\startappium.bat");
//        Thread.sleep(3000L);
        driver = BaseForShopKeeper.SetUp();
        driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
    }

    @AfterSuite//关闭App
    public void tearDown(){
        driver.closeApp();
    }

    @Test(priority = 1)//登陆
    public void login() throws IOException, SQLException, InterruptedException {
        LoginPageForShopKeeper loginPageForShopKeeper = new LoginPageForShopKeeper(driver);
        //Thread.sleep(4000L);

        //loginPageForShopKeeper.inputUserName().sendKeys(LoginPageForShopKeeper.USERNAME);

        WebElement username = (new WebDriverWait(driver, 20))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View[3]/android.widget.EditText")));
        username.sendKeys("18888886667");

        List<AndroidElement> password = driver.findElementsByClassName("android.widget.EditText");
        password.get(1).sendKeys("886667");

        List<AndroidElement> login = driver.findElementsByClassName("android.widget.TextView");
        login.get(1).click();
    }

    @Test(priority = 2)//切换店铺
    public void checkShopSwitch() {
        MainPageForShopKeeper mainPageForShopKeeper = new MainPageForShopKeeper(driver);
        mainPageForShopKeeper.getEmptyCategoryshop().click();
        mainPageForShopKeeper.getTibetWuYangShop().click();
    }

    @Test(priority = 3)//销售额页面测试
    public void salesRevenueTest() {
        MainPageForShopKeeper mainPageForShopKeeper = new MainPageForShopKeeper(driver);
        mainPageForShopKeeper.getSalesRevenue().click();
        mainPageForShopKeeper.getWineCategory().click();
        mainPageForShopKeeper.getProduct().click();
        mainPageForShopKeeper.getSearchBar().sendKeys("Maotai");
        mainPageForShopKeeper.getSearch().click();
        //返回按钮
        List<AndroidElement> backButton = driver.findElementsByClassName("android.widget.ImageView");
        backButton.get(0).click();
    }

    @Test(priority = 4)//今日利润页面
    public void todayRevenueTest() throws InterruptedException {
        MainPageForShopKeeper mainPageForShopKeeper = new MainPageForShopKeeper(driver);
        mainPageForShopKeeper.getTodayRevenue().click();
        Thread.sleep(2000L);
        List<AndroidElement> backButton = driver.findElementsByClassName("android.widget.ImageView");
        backButton.get(0).click();
    }

    @Test(priority = 5)//今日流水页面
    public void todayFlow() {
        MainPageForShopKeeper mainPageForShopKeeper = new MainPageForShopKeeper(driver);
        mainPageForShopKeeper.getTodayFlow().click();
        mainPageForShopKeeper.getTotalOrders().click();
        mainPageForShopKeeper.getOfflineOrders().click();
        mainPageForShopKeeper.getAllCashier().click();
        mainPageForShopKeeper.getCashierLida().click();
        List<AndroidElement> backButton = driver.findElementsByClassName("android.widget.ImageView");
        backButton.get(0).click();
    }

    @Test(priority = 6)//待接单页面
    public void waitingOrders() {
        MainPageForShopKeeper mainPageForShopKeeper = new MainPageForShopKeeper(driver);
        mainPageForShopKeeper.getWaitingOrders().click();
        mainPageForShopKeeper.getSearchBarForOrders().sendKeys("1695325874563");
        mainPageForShopKeeper.getSearch().click();
        mainPageForShopKeeper.getAcceptOrders().click();
        mainPageForShopKeeper.getCompleteOrders().click();
        mainPageForShopKeeper.getCancelOrders().click();
        mainPageForShopKeeper.getSevenDaysButton().click();
        mainPageForShopKeeper.getTodayButton().click();
        List<AndroidElement> backButton = driver.findElementsByClassName("android.widget.ImageView");
        backButton.get(0).click();
    }

    @Test(priority = 7)//置顶功能
    public void isTop() throws InterruptedException {
        ShopPageForShopKeeper shopPageForShopKeeper = new ShopPageForShopKeeper(driver);
        Thread.sleep(3000L);
        shopPageForShopKeeper.getShopManagement().click();
        shopPageForShopKeeper.getRiceWineCateGory().click();
        shopPageForShopKeeper.getIsTop().click();
        shopPageForShopKeeper.getCancelIsTop().click();
    }

    @Test(priority = 8)//设置批发会员优惠
    public void wholeSaleDiscount(){
        ShopPageForShopKeeper shopPageForShopKeeper = new ShopPageForShopKeeper(driver);
        shopPageForShopKeeper.getWholeSaleDiscount().click();
        List<AndroidElement> wholeSaleDiscountInputBox = driver.findElementsByClassName("android.widget.EditText");
        wholeSaleDiscountInputBox.get(0).sendKeys(ShopPageForShopKeeper.WHOLESALEDISCOUNTAMOUNT);
        shopPageForShopKeeper.getSetWholeSaleDiscount().click();
        shopPageForShopKeeper.getCancel().click();
    }

    @Test(priority = 9)//设置上下架
    public void putAndUnshelve(){
        ShopPageForShopKeeper shopPageForShopKeeper = new ShopPageForShopKeeper(driver);
        shopPageForShopKeeper.getPutAndUnshelve().click();
        shopPageForShopKeeper.getSetRetailPrice().click();
        shopPageForShopKeeper.getUnshelve().click();
        shopPageForShopKeeper.getPutAway().click();
        shopPageForShopKeeper.getCancel().click();
    }

    @Test(priority = 10)//盘存
    public void takeInventory(){
        ShopPageForShopKeeper shopPageForShopKeeper = new ShopPageForShopKeeper(driver);
        shopPageForShopKeeper.getTakeInventory().click();
        List<AndroidElement> inventoryInputBox = driver.findElementsByClassName("android.widget.EditText");
        inventoryInputBox.get(0).sendKeys(ShopPageForShopKeeper.INVENTORYAMOUNTBIGPACK);
        List<AndroidElement> inventoryInputBox2 = driver.findElementsByClassName("android.widget.EditText");
        inventoryInputBox2.get(1).sendKeys(ShopPageForShopKeeper.INVENTORYAMOUNTSMALLPACK);
        shopPageForShopKeeper.getConfirm().click();
    }

    @Test(priority = 11)//提成
    public void setCommission() throws InterruptedException {
        ShopPageForShopKeeper shopPageForShopKeeper = new ShopPageForShopKeeper(driver);
        shopPageForShopKeeper.getSetCommission().click();
        shopPageForShopKeeper.getCancel().click();
        Thread.sleep(2000L);
    }

    @Test(priority = 12)//外采
    public void outsidePurchase() throws InterruptedException {
        ShopPageForShopKeeper shopPageForShopKeeper = new ShopPageForShopKeeper(driver);
        shopPageForShopKeeper.getDrink().click();
        shopPageForShopKeeper.getOutsidePurchase().click();
        Thread.sleep(2000L);
        shopPageForShopKeeper.getLocalSupplier().click();
        List<AndroidElement> purchaseAmount = driver.findElementsByClassName("android.widget.EditText");
        purchaseAmount.get(1).sendKeys(ShopPageForShopKeeper.INVENTORYAMOUNTSMALLPACK);
        shopPageForShopKeeper.getOutsidePurchase().click();
    }

    @Test(priority = 13)//商品详情
    public void productEdit() throws InterruptedException {
        ShopPageForShopKeeper shopPageForShopKeeper = new ShopPageForShopKeeper(driver);
        List<AndroidElement> productDetails = driver.findElementsByClassName("android.widget.ImageView");
        productDetails.get(3).click();
        shopPageForShopKeeper.getEdit().click();
        shopPageForShopKeeper.getSave().click();
        List<AndroidElement> backButton = driver.findElementsByClassName("android.widget.ImageView");
        backButton.get(0).click();
    }

    @Test(priority = 14)//商品搜索
    public void productSearch(){
        ShopPageForShopKeeper shopPageForShopKeeper = new ShopPageForShopKeeper(driver);
        List<AndroidElement> magnifier = driver.findElementsByClassName("android.widget.ImageView");
        magnifier.get(1).click();
        MainPageForShopKeeper mainPageForShopKeeper = new MainPageForShopKeeper(driver);
        mainPageForShopKeeper.getSearchBar().sendKeys(MainPageForShopKeeper.Maotai);
        mainPageForShopKeeper.getSearch().click();
        List<AndroidElement> backButton = driver.findElementsByClassName("android.widget.ImageView");
        backButton.get(0).click();
        List<AndroidElement> backButton1 = driver.findElementsByClassName("android.widget.ImageView");
        backButton1.get(0).click();
        shopPageForShopKeeper.getAlreadyUnshelve().click();
        shopPageForShopKeeper.getCokeColaCategory().click();
        backButton.get(0).click();
    }
}