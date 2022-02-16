package E2E.steps;

import E2E.runner.TestRunner;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SimpleFormDemoSteps {
    @Given("The user is on the simple form demo site.")
    public void the_user_is_on_the_simple_form_demo_site() {
        TestRunner.driver.get("https://demo.seleniumeasy.com/basic-first-form-demo.html");

    }

    @When("The user enters a message into the Enter Message Field.")
    public void the_user_enters_a_message_into_the_enter_message_field() {
        //for dealing with the stupid popup
        TestRunner.explicitWait.until(ExpectedConditions.visibilityOf(TestRunner.simpleFormDemo.stupidPopUp));
        TestRunner.simpleFormDemo.stupidPopUp.click();

        TestRunner.simpleFormDemo.singleInputField.sendKeys("This is a message.");
    }

    @When("The user clicks the show message button.")
    public void the_user_clicks_the_show_message_button() {
        TestRunner.simpleFormDemo.singleInputButton.click();
    }

    @Then("The user can see the message appear in the your message output.")
    public void the_user_can_see_the_message_appear_in_the_your_message_output() {
        String returnedText = TestRunner.simpleFormDemo.singleInputOutput.getText();
        Assert.assertEquals("This is a message.", returnedText);
    }

    @When("The user enters a number into the a input box.")
    public void the_user_enters_a_number_into_the_a_input_box() {
        TestRunner.simpleFormDemo.twoInputFieldOne.sendKeys("5");
    }

    @When("The user enters a number into the b input box.")
    public void the_user_enters_a_number_into_the_b_input_box() {
        TestRunner.simpleFormDemo.twoInputFieldTwo.sendKeys("37");
    }

    @When("The user clicks the get total button.")
    public void the_user_clicks_the_get_total_button() {
        TestRunner.simpleFormDemo.twoInputButton.click();
    }

    @Then("The total appears in the result area.")
    public void the_total_appears_in_the_result_area() {
        String result = TestRunner.simpleFormDemo.twoInputOutput.getText();
        Assert.assertEquals("42", result);
    }
}
