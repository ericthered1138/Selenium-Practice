package E2E.poms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectListFormDemo {
    private WebDriver driver;

    public SelectListFormDemo(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //stupid popup
    @FindBy(css = "a[class=\"at-cv-button at-cv-lightbox-yesno at-cm-no-button\"]")
    public WebElement stupidPopUp;

    @FindBy(id = "select-demo")
    public WebElement dropdownButton;
    @FindBy(css = "p[class=\"selected-value\"]")
    public WebElement dayDisplay;
    @FindBy(id = "multi-select")
    public WebElement multiSelect;
    @FindBy(css = "button[value=\"Print First\"]")
    public WebElement printFirstButton;
    @FindBy(css = "p[class=\"getall-selected\"]")
    public WebElement getAllSelected;
}
