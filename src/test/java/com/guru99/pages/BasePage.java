package com.guru99.pages;

import com.guru99.commons.Driver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class BasePage extends Driver {

    public String BASE_URL =   "http://www.demo.guru99.com/V4/";

    public void launchUrl() {

        driver.navigate().to(BASE_URL);
    }

    /*##########################################################################
	Uses - This method helps us to take screen shots of failed tests
	############################################################################*/

    public static File takeScreenShot() throws Exception
    {
        return ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    }
    /*##########################################################################
       Uses - This method helps us to save screen shots of failed tests
    ############################################################################*/
    public static void saveScreenshot() throws Exception
    {
        String dateNow = new SimpleDateFormat("ddMMyy").format(new GregorianCalendar().getTime());
        String timeNow = new SimpleDateFormat("hhmmss").format(new GregorianCalendar().getTime());

        String fileName = String.format(".\\Screenshots\\%s\\screenshot_%s", dateNow, timeNow);

        File screenshot = takeScreenShot();

        FileUtils.copyFile(screenshot, new File(fileName));

    }


}
