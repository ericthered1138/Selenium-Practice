package E2E.runner;

import E2E.poms.*;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.time.Duration;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:features/DragAndDropDemo.feature", glue = "E2E.steps", plugin = {"pretty",
        "html:src/test/java/resources/reports/html-reports.html"})

public class TestRunner {

    public static WebDriver driver;
    public static WebDriverWait explicitWait;

    // POMs
    public static AdultSwimIndex adultSwimIndex;
    public static SimpleFormDemo simpleFormDemo;
    public static SelectListFormDemo selectListFormDemo;
    public static DatePickerDemo datePickerDemo;
    public static DragAndDropDemo dragAndDropDemo;

    @BeforeClass
    public static void setup() {
        File file = new File("src/test/resources/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        // POMs
        adultSwimIndex = new AdultSwimIndex(driver);
        simpleFormDemo = new SimpleFormDemo(driver);
        selectListFormDemo = new SelectListFormDemo(driver);
        datePickerDemo = new DatePickerDemo(driver);
        dragAndDropDemo = new DragAndDropDemo(driver);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        explicitWait = new WebDriverWait(driver, Duration.ofSeconds(2));
        System.out.println("Set up complete!");
    }

    @AfterClass
    public static void teardown() {
        driver.quit();
        System.out.println("teardown complete!");

    }

}