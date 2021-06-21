package com.pnt.pages;


import com.pnt.base.TestBase;
import org.apache.log4j.Logger;
import org.junit.Assert;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class AmzonHomePage extends TestBase {
    private final Logger logger = Logger.getLogger(AmzonHomePage.class);
    @FindBy(id = "twotabsearchtextbox")
    private WebElement searchBox;
    @FindBy(id = "nav-search-submit-button")
    private WebElement searchBotton;



    public void validateUserCanSeeSearchBox() {
        Assert.assertTrue(searchBox.isDisplayed());

        logger.info("the Search boox is dispalyed");

    }

    public void typeJavaBooks(String data) {
        searchBox.sendKeys(data);
        logger.info("java books typed in ");
    }

    public void clickSearchButton() {
        searchBotton.click();
        logger.info("serch button clicked ");
    }

}
