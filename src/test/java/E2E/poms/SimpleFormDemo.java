package E2E.poms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SimpleFormDemo {
    private WebDriver driver;

    public SimpleFormDemo(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //stupid popup
    @FindBy(css = "a[class=\"at-cv-button at-cv-lightbox-yesno at-cm-no-button\"]")
    public WebElement stupidPopUp;

    @FindBy(id = "user-message")
    public WebElement singleInputField;
    @FindBy(css = "button[onclick = \"showInput();\"]")
    public WebElement singleInputButton;
    @FindBy(id = "display")
    public WebElement singleInputOutput;

    @FindBy(id = "sum1")
    public WebElement twoInputFieldOne;
    @FindBy(id = "sum2")
    public WebElement twoInputFieldTwo;
    @FindBy(css = "button[onclick = \"return total()\"]")
    public WebElement twoInputButton;
    @FindBy(id = "displayvalue")
    public WebElement twoInputOutput;
}
