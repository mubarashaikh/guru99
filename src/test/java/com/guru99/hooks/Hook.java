package com.guru99.hooks;

import com.guru99.commons.Browsers;
import io.cucumber.java.Before;
import io.cucumber.java.After;


public class Hook  extends Browsers {

    @Before
    public void setup(){


        launchBrowser("Chrome");
    }

    @After
    public void tearDown(){
        closeBrowser();
    }

}
