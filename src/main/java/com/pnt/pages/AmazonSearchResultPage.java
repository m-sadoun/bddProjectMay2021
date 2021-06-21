package com.pnt.pages;

import com.pnt.base.TestBase;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class AmazonSearchResultPage extends TestBase {
    private Logger logger= Logger.getLogger(AmazonSearchResultPage.class);

    @FindBy(xpath = "//span[@class='a-color-state a-text-bold']")
    private WebElement searchedItem;

    public void validateSearchedItemIsDisplayed() {
        Assert.assertTrue(searchedItem.isDisplayed());
        logger.info("the java books resultdispalyed");
    }
}
