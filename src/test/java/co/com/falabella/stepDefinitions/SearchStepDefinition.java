package co.com.falabella.stepDefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class SearchStepDefinition {

    @Before
    public void setStatus(){
        setTheStage(new OnlineCast());
    }

    @Given("the user opens the web page and searches for a product in the search field")
    public void theUserOpensTheWebPageAndSearchesForAProductInTheSearchField() {
        theActorCalled("Customer").wasAbleTo(
                Open.url("https://www.falabella.com.co/")
        );

    }
    @When("the user selects a product randomly and adds it to the cart")
    public void theUserSelectsAProductRandomlyAndAddsItToTheCart() {

    }
    @Then("the user will see a message that their product is in the cart")
    public void theUserWillSeeAMessageThatTheirProductIsInTheCart() {

    }

}
