package com.saucedemo.pages;

import com.saucedemo.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage extends Utility {

    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    public LoginPage(){
        PageFactory.initElements(driver, this);

    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='user-name']")
    WebElement usernameField;

    @CacheLookup
    @FindBy(xpath = "//input[@id='password']")
    WebElement passwordField;

    @CacheLookup
    @FindBy(xpath = "//input[@id='login-button']")
    WebElement loginButton;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Products')]")
    WebElement productTitleText;

    public void enterUserName(String userName) {
        log.info("Enter username " + userName + " to username field " + usernameField.toString());
        sendTextToElement(usernameField, userName);
    }

    public void enterPassword(String password) {
        log.info("Enter password " + password + " to password field " + passwordField.toString());
        sendTextToElement(passwordField, password);
    }

    public void clickOnLoginButton() {
        log.info("Clicking on login button");
        clickOnElement(loginButton);
    }

    public String getTextFromProductTitle() {
        log.info("Getting text from : " + productTitleText.toString());
        return getTextFromElement(productTitleText);

    }


}
