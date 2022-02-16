package E2E.steps;

import E2E.runner.TestRunner;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class DatePickerDemoSteps {
    @Given("The user is on the date picker site.")
    public void the_user_is_on_the_date_picker_site() {
        TestRunner.driver.get("https://demo.seleniumeasy.com/bootstrap-date-picker-demo.html");
    }

    @When("The user chooses a date.")
    public void the_user_chooses_a_date() {
        TestRunner.datePickerDemo.datePickerButton.click();
        TestRunner.datePickerDemo.datePickerSwitch1.click();
        TestRunner.datePickerDemo.datePickerSwitch2.click();
        TestRunner.datePickerDemo.datePickerSwitch3.click();
        TestRunner.driver.findElement(By.xpath("/html/body/div[3]/div[4]/table/tbody/tr/td/span[1]")).click();
        TestRunner.driver.findElement(By.xpath("/html/body/div[3]/div[3]/table/tbody/tr/td/span[3]")).click();
        TestRunner.driver.findElement(By.xpath("/html/body/div[3]/div[2]/table/tbody/tr/td/span[8]")).click();
        TestRunner.driver.findElement(By.xpath("/html/body/div[3]/div[1]/table/tbody/tr[2]/td[2]")).click();
    }

    @Then("The user can see the date chosen.")
    public void the_user_can_see_the_date_chosen() {
        TestRunner.explicitWait.until(ExpectedConditions.textToBePresentInElement(TestRunner.datePickerDemo.datePickerButton, "06/08/1991"));
        String date = TestRunner.datePickerDemo.datePickerButton.getText();
        Assert.assertEquals("06/08/1991", date);
    }
}
