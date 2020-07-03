package com.guru99.pages;

import com.guru99.commons.Driver;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Coordinates;
import org.openqa.selenium.interactions.Locatable;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.List;

public class BasePage extends Driver {

    public String BASE_URL =   "http://www.demo.guru99.com/V4/";

    public void launchUrl() {

        driver.navigate().to(BASE_URL);
    }

    /*#####################################################
	Uses - This method closes any browser open by selenium
	It is used to clean up afterwards
	#######################################################*/
    public static void closeBrowser() throws Exception
    {
        driver.manage().deleteAllCookies();
        driver.close();
        driver.quit();
    }

    /*#########################################################
    Uses - This method navigates to any url passed in.
    Note - url must have this format -> http://www.example.com
    It is called after LaunchBrowser() method has been called.
    ###########################################################*/
    public static void launchUrl(String url) throws Exception
    {
        driver.navigate().to(url);
    }

    /*#########################################################
    Uses - This method helps to hover over any element
    It takes in any WebElement of interest
    ###########################################################*/
    public static void HoverOver(WebElement element) throws Exception
    {
        Actions action = new Actions(driver);
        action.moveToElement(element).build().perform();

    }


	/*#########################################################
	Uses - This method helps you click on an Element
	###########################################################*/

    public static void javaScript (WebElement element){

        JavascriptExecutor executor = (JavascriptExecutor)driver;


        executor.executeScript("arguments[0].click();", element);


    }



	/*#########################################################
	Uses - This method helps to scroll an Element to view
	###########################################################*/

    public static void ScrollByPixel (){

        JavascriptExecutor executor = (JavascriptExecutor)driver;

        executor.executeScript("window.scrollBy(0,655)", "");

    }


	/*#########################################################
	Uses - This method helps to scroll an Element to view
	###########################################################*/

    public static void ScrollIntoView (WebElement element){

        JavascriptExecutor executor = (JavascriptExecutor)driver;


        executor.executeScript("arguments[0].scrollIntoView(true);", element);

        //executor.executeScript("window.scrollBy(0,3500)", "");

    }

	/*#########################################################
	Uses - This method helps to scroll an Element to view
	###########################################################*/

    public static void locateIntoView (WebElement element){

        Coordinates elementLocation = ((Locatable)element).getCoordinates();

        elementLocation.inViewPort();


    }

    /*#########################################################
    Uses - This method helps to hover over any element
    It takes in any WebElement of interest
    ###########################################################*/
    public static void ScrollUp() throws Exception
    {
        Actions action = new Actions(driver);

        // Scroll Up using Actions class

        action.keyDown(Keys.CONTROL).sendKeys(Keys.HOME).perform();
        //action.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
    }


    /*#########################################################
    Uses - This method helps to hover over any element
    It takes in any WebElement of interest
    ###########################################################*/
    public static void ScrollDown() throws Exception
    {
        Actions action = new Actions(driver);

        // Scroll down using Actions class

        action.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
    }


    /*##########################################################
    Uses - This method helps to click on an element of interest
    It takes in any WebElement of interest
    ############################################################*/
    public static void clickAnElement(WebElement element) throws Exception
    {
        element.click();
    }

    /*###############################################################
    Uses - This method helps to type given value into a field
    It takes in any WebElement of interest and the value to type in
    #################################################################*/
    public static void typeGivenValueInto(WebElement element, String text) throws Exception
    {
        element.clear();
        element.sendKeys(text);
    }

	/*###################################################################################################################
	Uses - This method verify result
	#####################################################################################################################*/

    public static void verifyResult(String resultText, String result)

    {


        Assert.assertTrue(resultText.contains(result));
    }

    /*###################################################################################################################
    Uses - This method helps to select element from a dropdown by specifying the index of the item needed to be selected
    It takes in the dropdown as a WebElement and the index as a number
    #####################################################################################################################*/
    public static void selectByIndex(WebElement element, int index) throws Exception
    {
        Select select = new Select(element);
        select.selectByIndex(index);
    }



    /*###################################################################################################################
    Uses - This method helps to select element from a dropdown by specifying the index of the item needed to be selected
    It takes in the dropdown as a WebElement and the index as a number
    #####################################################################################################################*/
    public static void selectByValue(WebElement element, String value) throws Exception
    {
        Select select = new Select(element);
        select.selectByValue(value);
    }

    /*###################################################################################################################
    Uses - This method helps to select element from a dropdown by specifying the Text of the item needed to be selected
    It takes in the dropdown as a WebElement and the Text as a String
    #####################################################################################################################*/
    public static void selectByText(WebElement element, String text) throws Exception
    {
        Select select = new Select(element);
        select.selectByVisibleText(text);
    }


    public static File takeScreenShot() throws Exception
    {
        return ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    }

    public static void saveScreenshot() throws Exception
    {
        String dateNow = new SimpleDateFormat("ddMMyy").format(new GregorianCalendar().getTime());
        String timeNow = new SimpleDateFormat("hhmmss").format(new GregorianCalendar().getTime());

        String fileName = String.format(".\\Screenshots\\%s\\screenshot_%s", dateNow, timeNow);

        File screenshot = takeScreenShot();

        FileUtils.copyFile(screenshot, new File(fileName));

    }

    /*##########################################################################
    Uses - This method helps to find element by specifying the Id of the element
    It takes in the Id as a string
    ############################################################################*/
    public static WebElement getElementById(String id) throws Exception
    {
        By locator = By.id(id);
        return getElement(locator);


    }

	/*##########################################################################
	Uses - This method helps to find element by specifying the link of the element
	It takes in the link text as a string
	############################################################################*/

    public static WebElement getElementByLinkText(String linkText) throws Exception
    {
        By locator = By.linkText(linkText);
        return getElement(locator);


    }

	/*##########################################################################
	Uses - This method helps to find element by specifying the tagName of the element
	It takes in the tagName as a string
	############################################################################*/

    public static WebElement getElementBytagName(String tagName) throws Exception
    {
        By locator = By.tagName(tagName);
        return getElement(locator);


    }


    /*###################################################################################
    Uses - This method helps to find List of elements by specifying the Id of the element
    It takes in the Id as a string
    #####################################################################################*/
    public static List<WebElement> getElementsById(String id) throws Exception
    {
        By locator = By.id(id);
        return getElements(locator);
    }

    /*##################################################################################
    Uses - This method helps to find element by specifying the classname of the element
    It takes in the className as a string
    ####################################################################################*/
    public static WebElement getElementByClassName(String className) throws Exception
    {
        By locator = By.className(className);
        return getElement(locator);
    }

    /*###################################################################################
    Uses - This method helps to find elements by specifying the className of the element
    It takes in the className as a string
    #####################################################################################*/
    public static List<WebElement> getElementsByClassName(String className) throws Exception
    {
        By locator = By.className(className);
        return getElements(locator);
    }

    /*##############################################################################################
    Uses - This method helps to find element by specifying the cssSelector identifier of the element
    It takes in the cssSelector identifier as a string
    ################################################################################################*/
    public static WebElement getElementByCssSelector(String cssSelector) throws Exception
    {
        By locator = By.cssSelector(cssSelector);
        return getElement(locator);
    }

    /*###############################################################################################
    Uses - This method helps to find elements by specifying the cssSelector identifier of the element
    It takes in the cssSelector identifier as a string
    #################################################################################################*/
    public static List<WebElement> getElementsByCssSelector(String cssSelector) throws Exception
    {
        By locator = By.cssSelector(cssSelector);
        return getElements(locator);
    }

    /*##########################################################################################
    Uses - This method helps to find element by specifying the XPath identifier of the element
    It takes in the XPath identifier as a string
    ############################################################################################*/
    public static WebElement getElementByXPath(String xpath) throws Exception
    {
        By locator = By.xpath(xpath);
        return getElement(locator);
    }

    /*##########################################################################################
    Uses - This method helps to find elements by specifying the XPath identifier of the element
    It takes in the XPath identifier as a string
    ############################################################################################*/
    public static List<WebElement> getElementsByXPath(String xpath) throws Exception
    {
        By locator = By.xpath(xpath);
        return getElements(locator);
    }

    /*#############################################################################
    Uses - This method helps to find element by specifying the name of the element
    It takes in the name as a string
    ###############################################################################*/
    public static WebElement getElementByName(String name) throws Exception
    {
        By locator = By.name(name);
        return getElement(locator);
    }

    /*#############################################################################
    Uses - This method helps to find element by specifying the name of the element
    It takes in the name as a string
    ###############################################################################*/
    public static List<WebElement> getElementsByName(String name) throws Exception
    {
        By locator = By.name(name);
        return getElements(locator);
    }

    private static WebElement getElement(By locator) throws Exception
    {
        WebElement element = null;
        int tryCount = 0;

        while (element == null)
        {
            try
            {
                element = driver.findElement(locator);
            }
            catch(Exception e)
            {
                if(tryCount == 3)
                {
                    saveScreenshot();

                    throw e;
                }

                Thread.sleep(2000);
                tryCount++;
            }
        }
        System.out.println(element.toString() + " is now retrieved");
        return element;
    }

    private static List<WebElement> getElements(By locator) throws Exception
    {
        List<WebElement> element = null;
        int tryCount = 0;

        while (element == null)
        {
            try
            {
                element = driver.findElements(locator);
            }
            catch(Exception e)
            {
                if(tryCount == 3)
                {
                    saveScreenshot();
                    throw e;
                }

                Thread.sleep(2000);
                tryCount++;
            }
        }
        System.out.println(element.toString() + " is now retrieved");
        return element;
    }
}




