package com.pnt.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LandingPage {
    private Logger logger = Logger.getLogger(LandingPage.class);
    @FindBy(xpath = "//input[@id='email']")
    private WebElement userEmail;

    @FindBy(xpath = "//input[@id='pass']")
    private WebElement userPassWord;

    @FindBy(xpath = "//button[contains(@id,'u')]")
    private WebElement loginButton;

    public void typeUserEmail(String email) {
        userEmail.sendKeys(email);
        logger.info("The "+email+" typed");
    }

    public void typePassword(String password) {
        userPassWord.sendKeys(password);
        logger.info("The "+password+" typed");
    }

    public void clickLoginButton() {
        loginButton.click();
        logger.info("The Button clicked");
    }


}
