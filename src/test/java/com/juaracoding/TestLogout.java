package com.juaracoding;

import com.juaracoding.pages.LoginAndLogoutPage;
import com.juaracoding.drivers.DriverSingleton;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestLogout {
    static WebDriver driver;
    static ExtentTest extentTest;
    static LoginAndLogoutPage loginAndLogoutPage = new LoginAndLogoutPage();

    public TestLogout() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }
    @When("User Click Button Logout")
    public void user_click_button_logout() {
        loginAndLogoutPage.clickSideBarLogout();
        extentTest.log(LogStatus.PASS, "User Click Button Logout");
    }
    @Then("User Get Text Title In Login Page")
    public void user_get_text_title_in_login_page() {
        DriverSingleton.delay(5);
        Assert.assertEquals(loginAndLogoutPage.getTextLoginPage(), "DIKA | DOKUMEN");
        extentTest.log(LogStatus.PASS, "User Get Text Title Login Page");
    }
}
