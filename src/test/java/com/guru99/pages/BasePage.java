package com.guru99.pages;

import com.guru99.commons.Driver;

public class BasePage extends Driver {

    public String BASE_URL =   "http://www.demo.guru99.com/V4/";

    public void launchUrl() {

        driver.navigate().to(BASE_URL);
    }

}
