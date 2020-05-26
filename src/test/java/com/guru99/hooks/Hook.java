package com.guru99.hooks;

import com.guru99.commons.Browsers;

import io.cucumber.java.Before;
import io.cucumber.java.After;
import io.cucumber.core.api.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class Hook  extends Browsers {

    public Scenario scenario;

    @Before
    public void setUp(Scenario scenario)
    {
        this.scenario = scenario;
        launchBrowser("Chrome");
    }

    @After
    public void tearDown()
    {
//        String dateNow = new SimpleDateFormat("dd/MM/yyyy")
//                .format(new GregorianCalendar().getTime());
//        String timeNow = new SimpleDateFormat("HH:mm:ss")
//                .format(new GregorianCalendar().getTime());
//
//        // the problem is here it will not take a formatted string
//        //String filename = String.format("./Screenshots/%s/screenshot_%s/png", dateNow, timeNow);
//
//        if(scenario.isFailed())
//        {
//            try{
//                byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
//                scenario.embed(screenshot, "image/png" );
//
//            } catch (Exception e)
//            {
//                e.printStackTrace();
//            }
//        }


        System.out.println("AFTER SITE");

        try {

            if(scenario.isFailed()) {
                scenario.write("this is my failure message");
                TakesScreenshot ts = ((TakesScreenshot) driver);
                byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);

                scenario.embed(screenshot, "image/png");
            }
        }
        catch(Exception e) {

            e.printStackTrace();
        }

        closeBrowser();
    }

}
