package com.guru99.pages;

import com.guru99.commons.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BasePage extends Driver {

    public String BASE_URL =   "http://www.demo.guru99.com/V4/"; // Variable used in launchUrl method

    // Object used in selection of data from ListBox Control
    public Select select;

    // Create an object of Actions class, used dragAndDrop method
    public Actions actions;

    // To launch URL method
    public void launchUrl() {

        driver.navigate().to(BASE_URL);
    }

    //***Method***** select a text data from ListBox
    public void selectByText(WebElement element, String text){
        select = new Select(element);
        select.selectByVisibleText(text);
    }

    // ***Method*** Selecting a value from ListBox control
    public void selectByValue(WebElement element, String value){
        select = new Select(element);
        select.selectByValue(value);
    }

    // ****Method*** selecting a data value from List box control list by index
    public  void selectByIndex(WebElement element, int index){
        select = new Select(element);
        select.selectByIndex(index);
    }

    //  ****Method****  Handling a contorl bar using actions class
    public void  dragAndDrop (WebElement element, int startP, int endP){
        actions = new Actions(driver); // creating a new instance of actions object
       actions.dragAndDropBy(element, startP, endP).build().perform();
    }


    // ***Method****   Handling of ScrollBar on page or element to view the elements
    // or view the text
    public static void  scrollByPixel(WebElement element){
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("window.scrollBy(000, 000)","" ); // here in
        // window.scrollBy(give integer value for horizontal pixels, and integer value for vertical pixels)
    }
}
