package com.pnt.stepdefintion;

import com.pnt.base.TestBase;
import com.pnt.pages.AmazonSearchResultPage;
import com.pnt.pages.AmzonHomePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.PageFactory;


public class AmazonSearch  extends TestBase{
    private AmzonHomePage amzonHomePage;
    private AmazonSearchResultPage amazonSearchResultPage;

     public void pages(){
         amzonHomePage =PageFactory.initElements(driver,AmzonHomePage.class);
         amazonSearchResultPage= PageFactory.initElements(driver,AmazonSearchResultPage.class);
     }

    @Given("^user opens the browser and navigate$")
    public void user_opens_the_browser_and_navigate()  {
        TestBase.setupDriver();
        driver.get("https://www.amazon.com");

           }


    @When("^user can see search bar$")
    public void user_can_see_search_bar() {
        pages();
        amzonHomePage.validateUserCanSeeSearchBox();
    }
    @Then("^user types (.*)In search bar$")
    public void user_types_java_BooksIn_search_bar(String name) {
         pages();
        amzonHomePage.typeJavaBooks(name);
    }

    @Then("^user can click on search button$")
    public void user_can_click_on_search_button()  {
         pages();
      amzonHomePage.clickSearchButton();
    }

    @Then("^user can see search result of java$")
    public void user_can_see_search_result_of_java()  {
         pages();

        amazonSearchResultPage.validateSearchedItemIsDisplayed();
    }

    @Then("^user close the browser$")
    public void user_close_the_browser() {
        driver.quit();
    }

}
