package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.BasicPage;

public class BasicPageDef {
    BasicPage basicPage = new BasicPage();

    @When("Click {string} button")
    public void clickButton(String name) {
        basicPage.clickButton(name);
    }

    @And("Click {string} button span")
    public void clickButtonSpan(String arg0) {
        basicPage.clickButtonSpan(arg0);
    }

    @Then("Notification with {string} is visible")
    public void contentWithVisible(String arg0) {
        basicPage.contentIsVisible(arg0);
    }
}
