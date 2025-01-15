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
}