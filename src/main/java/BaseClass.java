import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class BaseClass {

     public static WebDriver driver;
    void setup(String url)
    {
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        driver = new ChromeDriver();
        driver.get(url);
    }

    //for new window handle
    void switchWindow(){
        String currentWindow = driver.getWindowHandle();//for storing the current window
        Set<String> windows = driver.getWindowHandles();//for handel all windows

        for(String a : windows)
        {
            if(currentWindow != a)
            {
                driver.switchTo().window(a);
            }
        }

    }
//for closing the window
    void closeBrowser(){
        driver.quit();
    }
}
