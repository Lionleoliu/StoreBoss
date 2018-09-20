package ShopKeeperPageResource;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class ShopPageForShopKeeper {
    AndroidDriver driver;
    public static final String WHOLESALEDISCOUNTAMOUNT= "1";
    public static final String INVENTORYAMOUNTBIGPACK = "2000";
    public static final String INVENTORYAMOUNTSMALLPACK = "1";

    //初始化页面
    public ShopPageForShopKeeper(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver,5,TimeUnit.SECONDS),this);
    }

    //商品管理图标
    @AndroidFindBy(uiAutomator = "text(\"商品管理\")")
    AndroidElement shopManagement;

    //白酒类目
    @AndroidFindBy(uiAutomator = "text(\"白酒\")")
    AndroidElement riceWineCateGory;

    //置顶按钮
    @AndroidFindBy(uiAutomator = "text(\"置顶\")")
    AndroidElement isTop;

    //取消置顶按钮
    @AndroidFindBy(uiAutomator = "text(\"取消置顶\")")
    AndroidElement cancelIsTop;

    //批发优惠按钮
    @AndroidFindBy(uiAutomator = "text(\"批发优惠\")")
    AndroidElement wholeSaleDiscount;

    //设置批发优惠按钮
    @AndroidFindBy(uiAutomator = "text(\"设置批发会员优惠\")")
    AndroidElement setWholeSaleDiscount;

    //取消按钮
    @AndroidFindBy(uiAutomator = "text(\"取消\")")
    AndroidElement cancel;

    //上下架按钮
    @AndroidFindBy(uiAutomator = "text(\"上下架\")")
    AndroidElement putAndUnshelve;

    //设置零售价
    @AndroidFindBy(uiAutomator = "text(\"设置零售价\")")
    AndroidElement setRetailPrice;

    //下架按钮
    @AndroidFindBy(uiAutomator = "text(\"下架\")")
    AndroidElement Unshelve;

    //上架按钮
    @AndroidFindBy(uiAutomator = "text(\"上架\")")
    AndroidElement putaway;

    //盘存按钮
    @AndroidFindBy(uiAutomator = "text(\"盘存\")")
    AndroidElement takeInventory;

    //确定按钮
    @AndroidFindBy(uiAutomator = "text(\"确定\")")
    AndroidElement confirm;

    //设置提成
    @AndroidFindBy(uiAutomator = "text(\"设置提成\")")
    AndroidElement setCommission;

    //饮料类目
    @AndroidFindBy(uiAutomator = "text(\"饮料\")")
    AndroidElement drink;

    //外采
    @AndroidFindBy(uiAutomator = "text(\"外采\")")
    AndroidElement outsidePurchase;

    //本地供应商
    @AndroidFindBy(uiAutomator = "text(\"本地供货商\")")
    AndroidElement localSupplier;

    //商品详情按钮（小包装字样做参照）
    @AndroidFindBy(uiAutomator = "text(\"冰露水550ml\")")
    AndroidElement iceDew;

    //编辑按钮
    @AndroidFindBy(uiAutomator = "text(\"编辑\")")
    AndroidElement edit;

    //保存按钮
    @AndroidFindBy(uiAutomator = "text(\"保存\")")
    AndroidElement save;

    //已下架
    @AndroidFindBy(uiAutomator = "text(\"已下架\")")
    AndroidElement alreadyUnshelve;

    public AndroidDriver getDriver() {
        return driver;
    }

    public AndroidElement getShopManagement() {
        return shopManagement;
    }

    public AndroidElement getRiceWineCateGory() {
        return riceWineCateGory;
    }

    public AndroidElement getIsTop() {
        return isTop;
    }

    public AndroidElement getCancelIsTop() {
        return cancelIsTop;
    }

    public AndroidElement getWholeSaleDiscount() {
        return wholeSaleDiscount;
    }

    public AndroidElement getSetWholeSaleDiscount() {
        return setWholeSaleDiscount;
    }

    public AndroidElement getCancel() {
        return cancel;
    }

    public AndroidElement getPutAndUnshelve() {
        return putAndUnshelve;
    }

    public AndroidElement getSetRetailPrice() {
        return setRetailPrice;
    }

    public AndroidElement getUnshelve() {
        return Unshelve;
    }

    public AndroidElement getPutAway() {
        return putaway;
    }

    public AndroidElement getTakeInventory() {
        return takeInventory;
    }

    public AndroidElement getConfirm() {
        return confirm;
    }

    public AndroidElement getSetCommission() {
        return setCommission;
    }

    public AndroidElement getDrink() {
        return drink;
    }

    public AndroidElement getOutsidePurchase() {
        return outsidePurchase;
    }

    public AndroidElement getLocalSupplier() {
        return localSupplier;
    }

    public AndroidElement getPutaway() {
        return putaway;
    }

    public AndroidElement getIceDew() {
        return iceDew;
    }

    public AndroidElement getEdit() {
        return edit;
    }

    public AndroidElement getSave() {
        return save;
    }

    public AndroidElement getAlreadyUnshelve() {
        return alreadyUnshelve;
    }

    public AndroidElement getCokeColaCategory() {
        return cokeColaCategory;
    }

    //可口可乐类目
    @AndroidFindBy(uiAutomator = "text(\"可口可乐\")")
    AndroidElement cokeColaCategory;
}
