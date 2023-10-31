import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WindowPage extends BaseClass{

    @FindBy(id= "windowButton")
    WebElement newWindow;

    @FindBy(id="sampleHeading")
    WebElement title;
    void openWindow(){
        newWindow.click();
        switchWindow();
    }

    String CopyMessage(){
        return title.getText();
    }
}
