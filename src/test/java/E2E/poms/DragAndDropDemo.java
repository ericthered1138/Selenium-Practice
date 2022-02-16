package E2E.poms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DragAndDropDemo {
    private WebDriver driver;

    public DragAndDropDemo(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "todrag")
    public WebElement toDrag;
    @FindBy(css = "span[draggable=\"true\"]")
    public WebElement draggable;
    @FindBy(css = "div[dropzone=\"move\"]")
    public WebElement dropzone;
    @FindBy(id = "droppedlist")
    public WebElement droppedList;
}
