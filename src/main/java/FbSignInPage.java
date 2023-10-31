import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FbSignInPage extends BaseClass{
    @FindBy(css = "._8eso")
    WebElement message;

    //checking the input box is visible or not
    @FindBy(xpath = "//input[@class=\"inputtext _55r1 _6luy\"]")
    WebElement input;

     boolean box(){
        return input.isDisplayed();
    }


//    String copyMessage(){
//        return message.getText();
//    }
}
