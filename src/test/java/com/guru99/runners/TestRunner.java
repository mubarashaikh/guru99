package com.guru99.runners;



import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import java.io.File;


@RunWith(Cucumber.class)
@CucumberOptions(

        features = {"src/test/java/com/guru99/features"},
        glue = {"com/guru99/hooks","com/guru99/stepDefinitions"},
        plugin = { "json:target/cucumber.json","pretty","html:target/htmlReport/report.html",
                "de.monochromata.cucumber.report.PrettyReports:target/pretty-cucumber",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
        }

)
public class TestRunner {

//        //Writing the Extent Reports:
//        //Add a method writeExtentReport()
//        @AfterClass
//        public static void setUp() {
//
//
////                Reporter.loadXMLConfig(new File("/bankguru99/Configuration/extent-config.xml"));
////                Reporter.setSystemInfo("User Name", System.getProperty("user.name"));
////                Reporter.setSystemInfo("Time Zone", System.getProperty("user.timezone"));
////                Reporter.setSystemInfo("Machine", "Windows 10" + "64 Bit");
////                Reporter.setSystemInfo("Selenium", "3.7.0");
////                Reporter.setSystemInfo("Maven", "3.5.2");
////                Reporter.setSystemInfo("Java Version", "1.8.0_151");
//        }


}
