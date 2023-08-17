package co.com.falabella.tasks;

import co.com.falabella.interactions.ClickRandom;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ProductListTask implements Task {

    @Override
    public <T extends Actor> void performAs(T Customer) {
        Customer.attemptsTo(ClickRandom.RandomProduct());
    }

    public static ProductListTask listProducts(){
        return instrumented(ProductListTask.class);
    }
}
