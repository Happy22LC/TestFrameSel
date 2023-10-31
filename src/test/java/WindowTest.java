import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WindowTest extends BaseClass{
    WindowPage window;
    @BeforeMethod
    void openBrowser(){
        window = PageFactory.initElements(BaseClass.driver, WindowPage.class);
        setup("https://demoqa.com/browser-windows");
    }

    @AfterMethod
    void quitBrowser(){
        closeBrowser();
    }

    @Test
    void testWindow()
    {
        window.openWindow();
        String actualMessage = window.CopyMessage();
        Assert.assertEquals(actualMessage ,"This is a sample page");
    }


}
