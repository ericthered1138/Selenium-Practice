package E2E.steps;

import E2E.runner.TestRunner;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;

public class DragAndDropDemoSteps {

    @Given("The user is on the drag and drop page.")
    public void the_user_is_on_the_drag_and_drop_page() {
        TestRunner.driver.get("https://demo.seleniumeasy.com/drag-and-drop-demo.html");
    }

    @When("The user drags an object.")
    public void the_user_drags_an_object() {
        Actions actions = new Actions(TestRunner.driver);
        actions.dragAndDrop(TestRunner.dragAndDropDemo.draggable, TestRunner.dragAndDropDemo.dropzone).build().perform();
    }

    @Then("The object is in the end area.")
    public void the_object_is_in_the_end_area() {
        List<WebElement> dragged = TestRunner.dragAndDropDemo.droppedList.findElements(By.tagName("span"));
        String draggedText = dragged.get(0).getText();
        Assert.assertEquals("Draggable 1", draggedText);
    }
}
