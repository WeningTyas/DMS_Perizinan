package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginAndLogoutPage {
    private WebDriver driver; // atribut kelas LoginPage

    public LoginAndLogoutPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }
    // Locator @FindBy
    @FindBy(xpath = "//input[@id='username']")
    WebElement usernameField;
    @FindBy(xpath = "//input[@id='password']")
    WebElement passwordField;
    @FindBy(xpath = "//button[@type='submit']")
    WebElement btnLogin;
    @FindBy(xpath = "//b[normalize-space()='DIKA | DOKUMEN']")
    WebElement txtLoginPage;
    @FindBy(xpath = "//span[@class='logo-lg']//b[contains(text(),'DMS')]")
    WebElement txtLogoDMSDashboard;
    @FindBy(xpath = "//span[normalize-space()='Logout']")
    WebElement sideBarMenuLogout;

    // Custom Method
    public void inputUsername(String username){
        usernameField.sendKeys(username);
    }
    public void inputPassword(String password){
        passwordField.sendKeys(password);
    }
    public void clickButtonLogin(){
        btnLogin.click();
    }
    public String getTextLoginPage(){
        return txtLoginPage.getText();
    }
    public String getTextLogoDMSDashboard(){
        return txtLogoDMSDashboard.getText();
    }
    public String getUsernameFieldRequired(){
        return usernameField.getAttribute("required");
    }
    public String getPasswordFieldRequired(){
        return passwordField.getAttribute("required");
    }
    public void clickSideBarLogout() {
        sideBarMenuLogout.click();
    }
}
