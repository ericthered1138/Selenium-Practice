package E2E.poms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdultSwimIndex {
    private WebDriver driver;

    public AdultSwimIndex(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "/html/body/div[1]/div[2]/nav/ul/li[1]/a")
    public WebElement showsButton;
    @FindBy(xpath = "/html/body/div[1]/div[2]/div/section[2]/ul/li[7]/a")
    public WebElement aquaTeenHungerForceButton;
    @FindBy(xpath = "/html/body/div[1]/div[2]/main/div[3]/div[2]/div/div[2]/div/div[1]/div/a/div/div/h3/span[2]")
    public WebElement Episode8Button;
    @FindBy(xpath = "/html/body/div[1]/div[2]/div/form/input")
    public WebElement searchBar;
    @FindBy(xpath = "/html/body/div[1]/div[2]/div/form/button")
    public WebElement searchButton;
}
