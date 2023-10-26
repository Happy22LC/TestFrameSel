import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FbSignInTest extends BaseClass{
    FbSignInPage sign;

    @BeforeMethod
    void openBrowser(){
        sign = PageFactory.initElements(BaseClass.driver, FbSignInPage.class);
        setup("https://facebook.com");
    }

    @Test
    void  testMessage(){
        String expected = "Facebook - log in or sign up";
        String actual = driver.getTitle();
        //String actual = sign.copyMessage();
        Assert.assertEquals(actual, expected);
    }

    @Test
    void testInputBox(){
        boolean expected = true;
        boolean actual = sign.inputBox();
        Assert.assertEquals(expected, actual);

    }
}
