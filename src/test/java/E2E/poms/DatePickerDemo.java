package E2E.poms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DatePickerDemo {
    private WebDriver driver;

    public DatePickerDemo(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "input[placeholder=\"dd/mm/yyyy\"]")
    public WebElement datePickerButton;
    @FindBy(css = "div[class=\"datepicker-days\"]")
    public WebElement datePicker;
    @FindBy(xpath = "/html/body/div[3]/div[1]/table/thead/tr[2]/th[2]")
    public WebElement datePickerSwitch1;
    @FindBy(xpath = "/html/body/div[3]/div[2]/table/thead/tr[2]/th[2]")
    public WebElement datePickerSwitch2;
    @FindBy(xpath = "/html/body/div[3]/div[3]/table/thead/tr[2]/th[2]")
    public WebElement datePickerSwitch3;
}