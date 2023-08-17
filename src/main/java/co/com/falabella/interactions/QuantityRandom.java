package co.com.falabella.interactions;

import static co.com.falabella.userInterface.AddProductCartUserInterface.*;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.*;

import java.util.Random;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class QuantityRandom implements Interaction {


    @Override
    public <T extends Actor> void performAs(T Customer) {

        Random random= new Random();
        int indexRandom = random.nextInt(3) + 1;
        for (int i=2; i<=indexRandom; i++){
           Customer.attemptsTo(
                   Click.on(Btn_AddQuantity));
        }

        co.com.falabella.utils.EscrituraExcel.escrituraExcel(
                "src/test/resources/Data/Data.xlsx",
                String.valueOf(indexRandom),1,1);


        Customer.remember("NameProduct",
                Text.of(Name_Product));

        Customer.remember("QuantityProduct",
                indexRandom);
    }

    public static Performable Quantity(){
        return instrumented(QuantityRandom.class);
    }

}
