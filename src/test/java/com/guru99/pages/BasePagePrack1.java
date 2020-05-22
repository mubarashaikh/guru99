package com.guru99.pages;

import com.guru99.commons.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BasePagePrack1 extends Driver {

    public String BASE_URL = "enter the web Address"; // variable used in launchUrl method
    public Select select;                              // Object used in select of data value on ListBox
    public Actions actions;                            // Actions class object used in dragAndDrop method


    // To launch the URL
    public void  launchUrl (){
        driver.navigate().to(BASE_URL);
    }

    // To select the text value from list box
    public void selectByText(WebElement element, String text){
        select = new Select(element);
        select.selectByVisibleText(text);
    }

    // To select a value from ListBox
    public void selectByValue(WebElement element, String value){
        select = new Select(element);
        select.selectByValue(value);
    }

    //  To select a text data/ value from ListBox
    public void selectByIndex(WebElement element, int index){
        select = new Select(element);
        select.selectByIndex(index);
    }

    // To handle bar control
    public void dragAndDrop (WebElement element, int startP, int endP){
        actions = new Actions(driver);
        actions.dragAndDropBy(element, startP, endP).build().perform();
    }

    // To handle scrollBar on a page or in a control to view the element (its java Script method )

    public static void scrollByPixel() {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("window.scrollBy(000, 2000)", ""); // here in
        // window.scrollBy(give integer value for horizontal pixels, and integer value for vertical pixels)
    }



}
