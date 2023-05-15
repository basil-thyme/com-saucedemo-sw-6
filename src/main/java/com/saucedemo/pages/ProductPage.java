package com.saucedemo.pages;

import com.saucedemo.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ProductPage extends Utility {
    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    public ProductPage() {
        PageFactory.initElements(driver, this);

    }

    @CacheLookup
    @FindBys(@FindBy(className = "inventory_item_label"))
    List<WebElement> productsList;

    public int countProductOnList() {
        log.info("Getting the number of displayed products : " + productsList.toString());
        return productsList.size();
    }

}
