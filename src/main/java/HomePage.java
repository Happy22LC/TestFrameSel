import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BaseClass{
    //@FindBy(id="nav-logo-sprites")
    @FindBy(xpath="//a[@data-testid=\"notification-bar-textlink\"]")

    WebElement event;

    String checkEvent(){
        event.click();
        String newUrl = driver.getCurrentUrl();
        return newUrl;
    }
}
