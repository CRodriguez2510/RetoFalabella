package co.com.falabella.tasks;

import co.com.falabella.interactions.QuantityRandom;
import static co.com.falabella.userInterface.AddProductCartUserInterface.Btn_AddProduct;
import static co.com.falabella.userInterface.AddProductCartUserInterface.Btn_GoToCart;
import co.com.falabella.userInterface.AddProductCartUserInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AddProductCartTask implements Task {

    public <T extends Actor> void performAs(T Customer){


        Customer.attemptsTo(QuantityRandom.Quantity(),
                Click.on(Btn_AddProduct));

        Customer.attemptsTo(Click.on(Btn_GoToCart));

        }

        public static AddProductCartTask productCart(){
            return instrumented(AddProductCartTask.class);
        }
}

