package com.guru99.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = {"src/test/java/com/guru99/features"},
        glue = {"com/guru99/hooks","com/guru99/stepDefinitions"},
        plugin = { "json:target/cucumber.json",
                "de.monochromata.cucumber.report.PrettyReports:target/pretty-cucumber",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        tags = {"@AcceptanceTest"}


)


public class AccountActivitiesTestRunner {
}
