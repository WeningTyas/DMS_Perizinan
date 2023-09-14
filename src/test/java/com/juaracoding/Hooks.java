package com.juaracoding;

import com.juaracoding.utils.Constants;
import com.juaracoding.utils.TestCases;
import com.juaracoding.utils.Utils;
import com.juaracoding.drivers.DriverSingleton;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class Hooks {

    static WebDriver driver;
    static ExtentTest extentTest;
    static ExtentReports reports = new ExtentReports("target/extent-report.html");

    @Before
    public void setUp(){
        DriverSingleton.getInstance(Constants.BROWSER);
        driver = DriverSingleton.getDriver();
        TestCases[] test = TestCases.values();
        extentTest = reports.startTest(test[Utils.testCount].getTestCasesName());
        Utils.testCount++;
    }

    @AfterStep
    public void getResultStatus(Scenario scenario) throws IOException {
        if(scenario.isFailed()){
            String screenshotPath = Utils.getScreenshot(driver, scenario.getName());
            extentTest.log(LogStatus.FAIL, scenario.getName() + "\n"
                        + extentTest.addScreenCapture(screenshotPath));
        }
    }

    @AfterStep
    public void endTestCase(){
        reports.endTest(extentTest);
        reports.flush();
    }

    @AfterAll
    public static void finish(){
        DriverSingleton.delay(3);
        System.out.println("SELESAI GAN!!");
        DriverSingleton.closeObjectInstance();
    }
}
