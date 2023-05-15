package com.saucedemo.steps;

import com.saucedemo.pages.ProductPage;
import cucumber.api.java.en.And;
import org.testng.Assert;

public class ProductSteps {

    @And("^I should be able to verify that six products are displayed on page$")
    public void iShouldBeAbleToVerifyThatSixProductsAreDisplayedOnPage() {
        Assert.assertEquals( String.valueOf(new ProductPage().countProductOnList()), "6", "Six products are not dispalyed on page");
    }
}
