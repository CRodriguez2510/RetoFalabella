package co.com.falabella.stepDefinitions;

import co.com.falabella.questions.QuantityProductQuestion;
import co.com.falabella.questions.NameProductQuestion;
import co.com.falabella.tasks.AddProductCartTask;
import co.com.falabella.tasks.HomeTask;
import co.com.falabella.tasks.ProductListTask;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class SearchStepDefinition {
    @Managed
    WebDriver driver;

    Actor Customer = Actor.named("Customer");

    @Before
    public void setupActor() {
        Customer.can(BrowseTheWeb.with(driver));
    }

    @Given("the user opens the web page and searches for a product in the search field")
    public void theUserOpensTheWebPageAndSearchesForAProductInTheSearchField() {
        Customer.attemptsTo(
                Open.url("https://www.falabella.com.co/"),
                HomeTask.intoProduct());
    }
    @When("the user selects a product randomly and adds it to the cart")
    public void theUserSelectsAProductRandomlyAndAddsItToTheCart() {
        Customer.attemptsTo(
                ProductListTask.listProducts(),
                AddProductCartTask.productCart());

    }
    @Then("the user will see a message that their product is in the cart")
    public void theUserWillSeeAMessageThatTheirProductIsInTheCart() {
        Customer.should(
                seeThat(NameProductQuestion.from(), Matchers.equalTo(true)));
        //Customer.should(
               // seeThat(QuantityProductQuestion.from(), Matchers.equalTo(true)));
    }

}
