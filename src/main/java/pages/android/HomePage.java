package pages.android;

import core.utils.AndroidCore.AndroidDriverSetup;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.Page;

public class HomePage {

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
}
