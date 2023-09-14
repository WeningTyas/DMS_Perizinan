package com.juaracoding;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {
                "src/main/resources/features/01Login.feature",
                "src/main/resources/features/10Perizinan.feature",
                "src/main/resources/features/11Logout.feature"},
        glue = "com.juaracoding",
        plugin = {"pretty", "html:target/cucumber-report.html",
                            "json:target/cucumber.json"}
)

public class RunnerTest extends AbstractTestNGCucumberTests {
}


/*KALAU MAU RUN BUKA FILE INI!*/

/*Kalau mau lihat file hasilnya:
* - di folder target
* - buka extent report
* - klik kanan > Show in Explorer
* - klik 2x file yg dimaksud*/
