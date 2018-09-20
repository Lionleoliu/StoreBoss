package ShopKeeperPageResource;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class MainPageForShopKeeper {
    AndroidDriver driver;
    public static final String Maotai = "maotai";

    //初始化页面
    public MainPageForShopKeeper(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver,5,TimeUnit.SECONDS),this);
    }

    //空类目测试店铺切换店铺按钮
    @AndroidFindBy(uiAutomator = "text(\"空类目测试店铺\")")
    AndroidElement emptyCategoryshop;

    //切换到易酒批零西藏舞阳店
    @AndroidFindBy(uiAutomator = "text(\"易酒批零西藏舞阳店\")")
    AndroidElement tibetWuYangShop;

    //今日销售额
    @AndroidFindBy(uiAutomator = "text(\"今日销售额(元)\")")
    AndroidElement salesRevenue;

    //葡萄酒类目
    @AndroidFindBy(uiAutomator = "text(\"葡萄酒\")")
    AndroidElement wineCategory;

    //商品按钮
    @AndroidFindBy(uiAutomator = "text(\"商品\")")
    AndroidElement product;

    //搜索框
    @AndroidFindBy(uiAutomator = "text(\"请输入商品名称或助记码\")")
    AndroidElement searchBar;

    //搜索按钮
    @AndroidFindBy(uiAutomator = "text(\"搜索\")")
    AndroidElement search;

    //返回按钮
    @AndroidFindBy(xpath = "//android.widget.ImageView[@bounds='[23,59][61,97]']")
    AndroidElement returnButton;

    //今日利润按钮
    @AndroidFindBy(uiAutomator = "text(\"今日利润(元)\")")
    AndroidElement todayRevenue;

    //今日流水按钮
    @AndroidFindBy(uiAutomator = "text(\"今日流水\")")
    AndroidElement todayFlow;

    //全部订单按钮
    @AndroidFindBy(uiAutomator = "text(\"全部订单\")")
    AndroidElement totalOrders;

    //线下订单按钮
    @AndroidFindBy(uiAutomator = "text(\"线下订单\")")
    AndroidElement offlineOrders;

    //全部收银员按钮
    @AndroidFindBy(uiAutomator = "text(\"全部收银员\")")
    AndroidElement allCashier;

    //收银员李达
    @AndroidFindBy(uiAutomator = "text(\"李达\")")
    AndroidElement cashierLida;

    //待接单按钮
    @AndroidFindBy(uiAutomator = "text(\"待接单\")")
    AndroidElement waitingOrders;

    //订单号和会员手机号搜索框
    @AndroidFindBy(uiAutomator = "text(\"输入订单号/会员手机号\")")
    AndroidElement searchBarForOrders;

    //已接单按钮
    @AndroidFindBy(uiAutomator = "text(\"已接单\")")
    AndroidElement acceptOrders;

    //已完成按钮
    @AndroidFindBy(uiAutomator = "text(\"已完成\")")
    AndroidElement completeOrders;

    //已取消按钮
    @AndroidFindBy(uiAutomator = "text(\"已取消\")")
    AndroidElement cancelOrders;

    //近7天按钮
    @AndroidFindBy(uiAutomator = "text(\"近7天\")")
    AndroidElement sevenDaysButton;

    //今天按钮
    @AndroidFindBy(uiAutomator = "text(\"今天\")")
    AndroidElement todayButton;

    public AndroidElement getTodayRevenue() {
        return todayRevenue;
    }

    public AndroidElement getTodayFlow() {
        return todayFlow;
    }

    public AndroidElement getTotalOrders() {
        return totalOrders;
    }

    public AndroidElement getOfflineOrders() {
        return offlineOrders;
    }

    public AndroidElement getAllCashier() {
        return allCashier;
    }

    public AndroidElement getCashierLida() {
        return cashierLida;
    }

    public AndroidElement getWaitingOrders() {
        return waitingOrders;
    }

    public AndroidElement getSearchBarForOrders() {
        return searchBarForOrders;
    }

    public AndroidElement getAcceptOrders() {
        return acceptOrders;
    }

    public AndroidElement getCompleteOrders() {
        return completeOrders;
    }

    public AndroidElement getCancelOrders() {
        return cancelOrders;
    }

    public AndroidElement getSevenDaysButton() {
        return sevenDaysButton;
    }

    public AndroidElement getTodayButton() {
        return todayButton;
    }

    public AndroidDriver getDriver() {
        return driver;

    }

    public AndroidElement getEmptyCategoryshop() {
        return emptyCategoryshop;
    }

    public AndroidElement getTibetWuYangShop() {
        return tibetWuYangShop;
    }

    public AndroidElement getSalesRevenue() {
        return salesRevenue;
    }

    public AndroidElement getWineCategory() {
        return wineCategory;
    }

    public AndroidElement getProduct() {
        return product;
    }

    public AndroidElement getSearchBar() {
        return searchBar;
    }

    public AndroidElement getSearch() {
        return search;
    }

    public AndroidElement getReturnButton() {
        return returnButton;
    }



}
