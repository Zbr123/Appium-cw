package pages.android;

import core.utils.AndroidCore.AndroidDriverSetup;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.Page;

public class HomePage {

//    private String titleXpath = "//android.view.ViewGroup/android.widget.TextView";
//    private String immediateButtonID = "com.meritnation.store.testingapp:id/btn1";
//    private String flexibleButtonID = "com.meritnation.store.testingapp:id/btn2";
//    private String versionCodeID = "com.meritnation.store.testingapp:id/ver_code";
//    private String versionNameID = "com.meritnation.store.testingapp:id/ver_name";
//    private String resultText = "com.meritnation.store.testingapp:id/txt";
//    private String getTitle = "//android.widget.TextView[@text='The App']";
//    private String TextFieldDemoApp = "messageInput";
//    private String getSaveButton = "//android.view.ViewGroup[@content-desc='messageSaveBtn']/android.widget.TextView";

    private String titleAccessibilityID = "SignInScreen:AppLogo:logo";
    private String emailAccessibilityID = "SignInScreen:EmailInput:email";
    private String passwordAccessibilityID = "SignInScreen:PasswordInput:password";
    private String signinbtnAccessibilityID = "SignInScreen:SignInButtonText:signinbuttontext";
    private String ContinuebtnAccessibilityID = "WelcomeScreen:OnContinueButtonText:oncontinuebuttontext";
    private String NextbtnXpath = "//android.widget.TextView[@text='NEXT']";
    private String Envscreen_title_xpath = "//android.widget.TextView[@text='Select Environment']";
    private String Production_title_xpath = "//android.widget.TextView[@text='Production']";
    private String savebtn_xpath = "//android.widget.TextView[@text='Save']";
    private String WelcomeTitle = "WelcomeScreen:AppLogo:logo";
    private String Dashboard_accessbilityID = "NewHomeScreen:SeniorName:seniorname";
    private String MenubtnXpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup";
    private String signoutbtnAccessibilityID = "SideMenu:LogOutEvent:logout";


    private String immediateButtonID = "com.meritnation.store.testingapp:id/btn1";
    private String flexibleButtonID = "com.meritnation.store.testingapp:id/btn2";
    private String versionCodeID = "com.meritnation.store.testingapp:id/ver_code";
    private String versionNameID = "com.meritnation.store.testingapp:id/ver_name";
    private String resultText = "com.meritnation.store.testingapp:id/txt";
    private String getTitle = "//android.widget.TextView[@text='The App']";
    private String TextFieldDemoApp = "messageInput";
    private String getSaveButton = "//android.view.ViewGroup[@content-desc='messageSaveBtn']/android.widget.TextView";


    public HomePage(Page page) {
    }

    public WebElement getTitle() {
        return (AndroidDriverSetup.getAndroidDriver().findElementByAccessibilityId(titleAccessibilityID));
    }

    public WebElement getWelcomeTitle() {
        return (AndroidDriverSetup.getAndroidDriver().findElementByAccessibilityId(WelcomeTitle));
    }

    public WebElement getEmailfield() {
        return (AndroidDriverSetup.getAndroidDriver().findElementByAccessibilityId(emailAccessibilityID));
    }

    public WebElement getPasswordfield() {
        return (AndroidDriverSetup.getAndroidDriver().findElementByAccessibilityId(passwordAccessibilityID));
    }

    public WebElement Signin_btn() {
        return (AndroidDriverSetup.getAndroidDriver().findElementByAccessibilityId(signinbtnAccessibilityID));
    }

    public WebElement Continue_btn() {
        return (AndroidDriverSetup.getAndroidDriver().findElementByAccessibilityId(ContinuebtnAccessibilityID));
    }

    public WebElement Next_btn() {
        return (AndroidDriverSetup.getAndroidDriver().findElementByXPath(NextbtnXpath));
    }

    public WebElement Menu_btn() {
        return (AndroidDriverSetup.getAndroidDriver().findElementByXPath(MenubtnXpath));
    }

    public WebElement Env_screen() {
        return (AndroidDriverSetup.getAndroidDriver().findElementByXPath(Envscreen_title_xpath));
    }

    public WebElement production_btn() {
        return (AndroidDriverSetup.getAndroidDriver().findElementByXPath(Production_title_xpath));
    }

    public WebElement save_btn() {
        return (AndroidDriverSetup.getAndroidDriver().findElementByXPath(savebtn_xpath));
    }

    public WebElement Wellness_dashboard() {
        return (AndroidDriverSetup.getAndroidDriver().findElementByAccessibilityId(Dashboard_accessbilityID));
    }

    public WebElement Signout_btn() {
        return (AndroidDriverSetup.getAndroidDriver().findElementByAccessibilityId(signoutbtnAccessibilityID));
    }

    public WebElement getVersionCode() {
        return (AndroidDriverSetup.getAndroidDriver().findElement(By.id(versionCodeID)));
    }

    public WebElement getVersionName() {
        return (AndroidDriverSetup.getAndroidDriver().findElement(By.id(versionNameID)));
    }

    public WebElement getButton(int num) {
        return (AndroidDriverSetup.getAndroidDriver().findElement(By.id("com.meritnation.store.testingapp:id/btn" + num)));
    }

    public WebElement getImmediateButton() {
        return (AndroidDriverSetup.getAndroidDriver().findElement(By.id(immediateButtonID)));
    }

    public WebElement getFlexibleButton() {
        return (AndroidDriverSetup.getAndroidDriver().findElement(By.id(flexibleButtonID)));
    }

    public WebElement getResult() {
        return (AndroidDriverSetup.getAndroidDriver().findElement(By.id(resultText)));
    }

    public void backButton() {
        AndroidDriverSetup.getAndroidDriver().navigate().back();
    }

    public WebElement getTitleDemoApp() {
        return (AndroidDriverSetup.getAndroidDriver().findElement(By.xpath(getTitle)));
    }

    public WebElement getTabNameDemoApp(String name) {
        return (AndroidDriverSetup.getAndroidDriver().findElementByAccessibilityId(name));
    }

    public WebElement getTextFieldDemoApp() {
        return (AndroidDriverSetup.getAndroidDriver().findElementByAccessibilityId(TextFieldDemoApp));
    }

    public WebElement getSaveButtonDemoApp() {
        return (AndroidDriverSetup.getAndroidDriver().findElement(By.xpath(getSaveButton)));
    }

    public WebElement getEchoedTextDemoApp(String echo) {
        return (AndroidDriverSetup.getAndroidDriver().findElementByAccessibilityId(echo));
    }

    public WebElement getOptionDemoApp(String option) {
        return (AndroidDriverSetup.getAndroidDriver().findElementByAccessibilityId(option));
    }

    public void scrollToElementWithAccessibilityId(String accessibilityId) {
        String uiAutomatorString = String.format("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().description(\"%s\"))", accessibilityId);
        AndroidDriverSetup.getAndroidDriver().findElement(MobileBy.AndroidUIAutomator(uiAutomatorString));
    }
}
