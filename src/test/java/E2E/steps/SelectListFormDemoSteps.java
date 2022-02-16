package E2E.steps;

import E2E.runner.TestRunner;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

public class SelectListFormDemoSteps {

    @Given("The user is on the select drop down list page.")
    public void the_user_is_on_the_select_drop_down_list_page() {
        TestRunner.driver.get("https://demo.seleniumeasy.com/basic-select-dropdown-demo.html");
    }


    @When("The user selects an item from the dropdown list.")
    public void the_user_selects_an_item_from_the_dropdown_list() {
        Select select = new Select(TestRunner.selectListFormDemo.dropdownButton);
        select.selectByVisibleText("Tuesday");
    }

    @Then("The day selected is there.")
    public void the_day_selected_is_there() {
        String dateString = TestRunner.selectListFormDemo.dayDisplay.getText();
        Assert.assertEquals("Day selected :- Tuesday", dateString);

    }

    @When("The user selects a place.")
    public void the_user_selects_a_place() {
        Select select = new Select(TestRunner.selectListFormDemo.multiSelect);
        select.selectByValue("Texas");
    }

    @When("The user clicks the first selected button.")
    public void the_user_clicks_the_first_selected_button() {
        TestRunner.selectListFormDemo.printFirstButton.click();
    }

    @Then("The place selected is there.")
    public void the_place_selected_is_there() {
        String getAllSelected = TestRunner.selectListFormDemo.getAllSelected.getText();
        Assert.assertEquals("First selected option is : Texas", getAllSelected);
    }
}
