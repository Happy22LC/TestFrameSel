import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomeTest extends BaseClass{

    HomePage home;
    String expectedUrl = "https://www.hobbylobby.com/Fall-Essentials";

    @BeforeMethod
    void openBrowser(){
        setup("https://www.hobbylobby.com/");
        home = PageFactory.initElements(BaseClass.driver, HomePage.class);
    }
    @Test
    void clickAdd(){
        home.checkEvent();
    }

//This test failed, actual and expected is not equal
    //expected also coming the main website home url
    @Test
    void checkUrl(){
        String actualUrl = home.checkEvent();
        Assert.assertEquals(actualUrl, expectedUrl);
    }

}

// Created project with selenium
        // 1. maven repository
        // 2. http-client
        // 3. testNG

// We need 3 separate classes.
        // Base class -Setup Chrome browser.
        // Page class - Store web-element and perform actions.
        // Test class - Where we build connection with previous classes and create test.
