package com.juaracoding;

import com.juaracoding.pages.LoginAndLogoutPage;
import com.juaracoding.utils.Constants;
import com.juaracoding.drivers.DriverSingleton;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

// Kumpulan method untuk menjalankan aksi
public class TestLogin {
    static WebDriver driver;
    static ExtentTest extentTest;
    static LoginAndLogoutPage loginAndLogoutPage = new LoginAndLogoutPage();

    public TestLogin() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @Given("User Enter Valid Url DMS")
    public void user_enter_valid_url_dms() {
        driver.get(Constants.URL);
        extentTest.log(LogStatus.PASS, "User Enter Valid Url DMS");
    }

    @Then("User Get Text Title Login Page")
    public void user_get_text_title_login_page() {
        DriverSingleton.delay(5);
        Assert.assertEquals(loginAndLogoutPage.getTextLoginPage(), "DIKA | DOKUMEN");
        extentTest.log(LogStatus.PASS, "User Get Text Title Login Page");
    }

    @When("User Input Valid Username")
    public void user_input_valid_username() {
        loginAndLogoutPage.inputUsername(Constants.USERNAME);
        extentTest.log(LogStatus.PASS, "User Input Valid Username");
    }

    @And("User Input Valid Password")
    public void user_input_valid_password() {
        loginAndLogoutPage.inputPassword(Constants.PASSWORD);
        extentTest.log(LogStatus.PASS, "User Input Valid Password");
    }

    @And("User Click Button Login")
    public void user_click_button_login() {
        loginAndLogoutPage.clickButtonLogin();
        extentTest.log(LogStatus.PASS, "User Click Button Login");
    }

    @Then("User Get Text Logo DMS In Home page")
    public void user_get_text_logo_dms_in_dashboard() {
        Assert.assertEquals(loginAndLogoutPage.getTextLogoDMSDashboard(), "DMS");
        extentTest.log(LogStatus.PASS, "User Get Text Logo DMS In Home page");
    }

}
