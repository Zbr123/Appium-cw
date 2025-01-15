package step_defination.Android;

import static com.codeborne.selenide.Selenide.*;

import com.codeborne.selenide.Condition;
import core.utils.AndroidCore.AndroidDriverSetup;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.testng.Assert;
import pages.Page;

import java.util.List;
import java.util.Map;

public class HomeSteps extends Page {
    @Given("User is on home screen")
    public void UserIsOnHomePageTitleTestingApp() {
        Assert.assertTrue(getHomePage().getTitle().isDisplayed());
    }

    @Then("User should see home screen")
    public void UsershouldseeHomePageTitleTestingApp() {
        Assert.assertTrue(getHomePage().getTitle().isDisplayed());
    }

    @And("User taps on Email field")
    public void UserTapsonEmailField() {
        Assert.assertTrue(getHomePage().getEmailfield().isDisplayed());
        getHomePage().getEmailfield().click();
    }

    @And("User enters {string} in email field")
    public void UserEntersonEmailField(String text) {
        Assert.assertTrue(getHomePage().getEmailfield().isDisplayed());
        getHomePage().getEmailfield().click();  // Click on the email field
        getHomePage().getEmailfield().sendKeys(text);  // Enter the provided text
    }

    @And("User taps on Password field")
    public void UserTapsonPasswordField() {
        Assert.assertTrue(getHomePage().getPasswordfield().isDisplayed());
        getHomePage().getPasswordfield().click();
    }

    @And("User enters {string} in password field")
    public void UserEntersonPasswordField(String text) {
        Assert.assertTrue(getHomePage().getPasswordfield().isDisplayed());
        getHomePage().getPasswordfield().click();  // Click on the email field
        getHomePage().getPasswordfield().sendKeys(text);  // Enter the provided text
    }

    @And("User taps on Signin button")
    public void UserClicksOnSigninBtn() {
        Assert.assertTrue(getHomePage().Signin_btn().isDisplayed());
        getHomePage().Signin_btn().click();
        getHomePage().Signin_btn().click();
    }

    @Then("User should see Select Environment screen")
    public void UserseeEnvScreen() {
        Assert.assertTrue(getHomePage().Env_screen().isDisplayed());
    }

    @When("User taps on Production")
    public void tapsonproduction() {
        Assert.assertTrue(getHomePage().production_btn().isDisplayed());
        getHomePage().production_btn().click();  // Click on the email field
    }

    @And("User taps on Save button")
    public void tapsonsavebtn() {
        Assert.assertTrue(getHomePage().save_btn().isDisplayed());
        getHomePage().save_btn().click();  // Click on the email field
    }

    @Then("User should see welcome screen")
    public void UserIsOnWelcomeScreen() {
        Assert.assertTrue(getHomePage().getWelcomeTitle().isDisplayed());
    }

    @And("User taps on continue button")
    public void UserClicksOnContinueBtn() {
        Assert.assertTrue(getHomePage().Continue_btn().isDisplayed());
        getHomePage().Continue_btn().click();
    }

    @And("User taps on next button")
    public void UserClicksOnnextBtn() {
        Assert.assertTrue(getHomePage().Next_btn().isDisplayed());
        getHomePage().Next_btn().click();
    }

    @Then("User should see Wellness Dashboard")
    public void UserIsOnWellnessDashboard() {
        Assert.assertTrue(getHomePage().Wellness_dashboard().isDisplayed());
    }

    @And("^\\[Home Page\\] Verify the Version Code (.*)$")
    public void verifyTheCode(String versionCode) {
        Assert.assertEquals(getHomePage().getVersionCode().getText(), versionCode, "Verify Version Code");
    }

    @When("User taps on menu button")
    public void UserClicksOnMenuBtn() {
        Assert.assertTrue(getHomePage().Menu_btn().isDisplayed());
        getHomePage().Menu_btn().click();
    }

    @And("User taps on Signout button")
    public void UserClicksOnSignoutBtn() {
        Assert.assertTrue(getHomePage().Signout_btn().isDisplayed());
        getHomePage().Signout_btn().click();
    }
//
//    @And("^\\[Home Page\\] Verify the Version Name (.*)$")
//    public void verifyTheName(String versionName) {
//        Assert.assertEquals(getHomePage().getVersionName().getText(), versionName, "Verify Version Name");
//        getHomePage().getVersionName().isDisplayed();
//    }
//
//    @When("\\[Home Page\\] User tap on Button (.*)$")
//    public void homePageUserTapOnButtonXxx(int button) {
//        getHomePage().getButton(button).click();
//    }
//
//    @Then("[Home Page] Verify the Immediate Update button is visible")
//    public void homePageVerifyTheImmediateUpdateButtonIsVisible() {
//        getHomePage().getImmediateButton().isDisplayed();
//    }
//
//    @When("[Home Page] User tap on Immediate Update Button")
//    public void homePageUserTapOnImmediateUpdateButton() {
//        getHomePage().getImmediateButton().click();
//    }

//    @Then("[Home Page] Verify the three button options")
//    public void updatePageVerifyTheThreeButtonOptions(DataTable dataTable) {
//        List<Map<String, String>> rows = dataTable.asMaps(String.class, String.class);
//        for (Map<String, String> itemData : rows) {
//            if (itemData.containsKey("Button1")) {
//                $(getHomePage().getButton(1)).shouldHave(Condition.exactText(itemData.get("Button1")));
//            }
//            if (itemData.containsKey("Button2")) {
//                $(getHomePage().getButton(2)).shouldHave(Condition.exactText(itemData.get("Button2")));
//            }
//            if (itemData.containsKey("Button3")) {
//                $(getHomePage().getButton(3)).shouldHave(Condition.exactText(itemData.get("Button3")));
//            }
//        }
//    }

//    @Then("\\[Home Page\\] Verify that Result (.*) is displayed$")
//    public void homePageVerifyThatResul1IsVisible(String number) {
//        Assert.assertEquals(getHomePage().getResult().getText(), "RESULT " + number, "Verify Result with Number");
//        getHomePage().backButton();
//    }
//
//    @When("[Home Page] User tap on Flexible Update Button")
//    public void homePageUserTapOnFlexibleUpdateButton() {
//        getHomePage().getFlexibleButton().click();
//    }
//
//    @Then("[Home Page] Verify the Flexible Update button is visible")
//    public void homePageVerifyTheFlexibleUpdateButtonIsVisible() {
//        getHomePage().getFlexibleButton().isDisplayed();
//    }

    @Then("[Home Page] Verify that The App title is displayed on home page")
    public void homePageVerifyThatTheAppTitleIsDisplayedOnHomePage() {
        Assert.assertEquals(getHomePage().getTitleDemoApp().getText(), "The Apvp", "Verify Result");
    }

    @When("^I tap on (.*) tab$")
    public void iTapOnXxxTab(String name) {
        getHomePage().getTabNameDemoApp(name).click();
    }

    @And("I press back button")
    public void iPressBackButton() {
        getHomePage().backButton();
    }

    @When("^I type (.*) in text field on echo box screen$")
    public void iTypeXxxInTextFieldOnEchoBoxScreen(String text) {
        getHomePage().getTextFieldDemoApp().sendKeys(text);
    }

    @When("I tap on save button")
    public void iTapOnSaveButton() {
        getHomePage().getSaveButtonDemoApp().click();
    }

    @Then("^I should see (.*) echoed text on echo box screen$")
    public void iShouldSeeXxxEchoedTextOnEchoBoxScreen(String echo) {
        Assert.assertEquals(getHomePage().getEchoedTextDemoApp(echo).getText(), echo, "Verify Result");
    }

    @When("^I tap on (.*) option$")
    public void iTapOnXxxOption(String option) {
        getHomePage().getOptionDemoApp(option).click();
    }

    @When("^I scroll to (.*) accessibility id$")
    public void iScrollToXxxAccessibilityId(String id) {
        getHomePage().scrollToElementWithAccessibilityId(id);

    }

    @And("I accept popup")
    public void iAcceptPopup() {
        Alert alert = AndroidDriverSetup.getAndroidDriver().switchTo().alert();
        alert.accept();
    }

    @And("I dismiss popup")
    public void iDismissPopup() {
        Alert alert = AndroidDriverSetup.getAndroidDriver().switchTo().alert();
        alert.dismiss();
    }

    @Then("^I should see popup$")
    public void iShouldSeePopup() {
        try {
            // Attempt to switch to the alert
            Alert alert = AndroidDriverSetup.getAndroidDriver().switchTo().alert();
            // If successful, we assume the popup is displayed
            System.out.println("Popup is displayed with message: " + alert.getText());
        } catch (NoAlertPresentException e) {
            // If an exception is caught, it means no popup is present
            throw new AssertionError("Expected a popup, but none was displayed.");
        }
    }

    @And("^I wait (\\d+) seconds$")
    public void iWaitSeconds(int seconds) {
        try {
            // Convert seconds to milliseconds and wait
            Thread.sleep(seconds * 1000L);
            System.out.println("Waited " + seconds + " seconds.");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.err.println("Wait was interrupted.");
        }
    }
}