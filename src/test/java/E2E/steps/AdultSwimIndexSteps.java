package E2E.steps;

import E2E.runner.TestRunner;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.ArrayList;

public class AdultSwimIndexSteps {

    @Given("The user is on adult swim.")
    public void the_user_is_on_adult_swim() {
        TestRunner.driver.get("https://www.adultswim.com/");
    }

    //Scenario: As a user, I want to make sure that I am on adult swim, so that I can laugh
    @Then("The user is definitely on adult swim.")
    public void the_user_is_definitely_on_adult_swim() {
        String pageTitle = TestRunner.driver.getTitle();
        Assert.assertEquals("Adult Swim", pageTitle);
    }


    //Scenario: As a user, I want to click on the shows link to be redirected to the shows page
    @When("The user clicks on the shows button.")
    public void the_user_clicks_on_the_shows_button() {
        TestRunner.adultSwimIndex.showsButton.click();
    }

    @Then("The user is redirected to the shows page.")
    public void the_user_is_redirected_to_the_shows_page() {
        String pageTitle = TestRunner.driver.getTitle();
        Assert.assertEquals("Adult Swim Shows", pageTitle);
    }


    //Scenario: As a user, I want to watch an episode of Aqua Teen Hungerforce
    @When("The user clicks on the Aqua Teen Hunger Force button.")
    public void the_user_clicks_on_the_aqua_teen_hunger_force_button() {
        WebElement button = TestRunner.adultSwimIndex.aquaTeenHungerForceButton;
        Actions actions = new Actions(TestRunner.driver);
        actions.moveToElement(button);
        button.click();
    }

    @When("The user clicks on the episode eight button.")
    public void the_user_clicks_on_the_episode_button() {
        TestRunner.adultSwimIndex.Episode8Button.click();
    }

    @Then("The user is on the episode eight page.")
    public void the_user_is_on_the_episode_page() {
        TestRunner.explicitWait.until(ExpectedConditions.titleIs("Revenge of the Mooninites - S1 EP8 - Aqua Teen Hunger Force"));
        String pageTitle = TestRunner.driver.getTitle();
        Assert.assertEquals("Revenge of the Mooninites - S1 EP8 - Aqua Teen Hunger Force", pageTitle);
    }

    @When("The user inputs a {string} into the search bar.")
    public void the_user_inputs_a_into_the_search_bar(String string) {
        TestRunner.adultSwimIndex.searchButton.click(); // Have to click the search button first.
        TestRunner.explicitWait.until(ExpectedConditions.visibilityOf(TestRunner.adultSwimIndex.searchBar));
        TestRunner.adultSwimIndex.searchBar.sendKeys(string);
    }

    @When("The user clicks on the search button.")
    public void the_user_clicks_on_the_search_button() {
        TestRunner.adultSwimIndex.searchButton.click();
    }

    @Then("The user is redirected to search results.")
    public void the_user_is_redirected_to_search_results() {
        TestRunner.explicitWait.until(ExpectedConditions.titleIs("Search for things - Adult Swim"));
        String pageTitle = TestRunner.driver.getTitle();
        Assert.assertEquals("Search for things - Adult Swim", pageTitle);
    }

    @When("The user clicks on the {string} in the search results.")
    public void the_user_clicks_on_the_in_the_search_results(String string) {
        TestRunner.driver.findElement(By.xpath(string)).click();
    }

    @Then("The user is on the {string} page.")
    public void the_user_is_on_the_page_on_the(String string) {
        ArrayList<String> browserTabs = new ArrayList<>(TestRunner.driver.getWindowHandles());
        TestRunner.driver.switchTo().window(browserTabs.get(1));
        String pageTitle = TestRunner.driver.getTitle();
        Assert.assertEquals(string, pageTitle);
        TestRunner.driver.close();
        TestRunner.driver.switchTo().window(browserTabs.get(0));
    }

}
