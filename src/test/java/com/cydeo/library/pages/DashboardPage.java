package com.cydeo.library.pages;

import com.cydeo.library.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {

    public DashboardPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }



}
