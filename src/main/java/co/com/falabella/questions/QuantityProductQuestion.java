package co.com.falabella.questions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.falabella.userInterface.ValidationProductUserInterface.*;

public class QuantityProductQuestion implements Question <Boolean> {

    @Override
    public Boolean answeredBy(Actor Customer) {

        WebElementFacade QuantityProductTxt = LBL_QuantityProduct.resolveFor(Customer);

        int productQuantity = Customer.recall("QuantityProduct");
        int infoQuantity = Integer.parseInt(QuantityProductTxt.getValue());

        if((productQuantity == infoQuantity)){
            return true;
        }

        return false;
    }

    public static Question<Boolean> from(){
        return new QuantityProductQuestion();
    }
}
