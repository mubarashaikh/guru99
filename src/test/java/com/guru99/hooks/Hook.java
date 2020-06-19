package com.guru99.hooks;

import com.guru99.commons.Browsers;

import com.guru99.pages.BasePage;
import com.guru99.pages.HomePage;
import com.guru99.pages.ManagerHomePage;
import io.cucumber.java.Before;
import io.cucumber.java.After;
import io.cucumber.core.api.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;


import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class Hook  extends Browsers {

    public Scenario scenario;
//    HomePage homePage = PageFactory.initElements(driver, HomePage.class);
//    ManagerHomePage managerHomePage = PageFactory.initElements(driver, ManagerHomePage.class);

    @Before
    public void setUp(Scenario scenario) throws InterruptedException {
        this.scenario = scenario;
       launchBrowser("Chrome");
//        new BasePage().launchUrl();
//       managerHomePage = homePage.login("mngr26577","qAqYzug");
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
