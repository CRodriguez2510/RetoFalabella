package co.com.falabella.questions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.falabella.userInterface.ValidationProductUserInterface.*;

public class QuantityProductQuestion implements Question <Boolean> {

    @Override
    public Boolean answeredBy(Actor Customer) {

        WebElementFacade QuantityProductTxt = LBL_QuantityProduct.resolveFor(Customer);

        WebElementFacade QuantityListProduct = LBL_QuantityListProduct.resolveFor(Customer);


        int productQuantity = Customer.recall("QuantityProduct");

        if (QuantityProductTxt.isPresent()) {
            int infoQuantity = Integer.parseInt(QuantityProductTxt.getText());
            return infoQuantity == productQuantity;
        } else if (QuantityListProduct.isPresent()) {
            int infoQuantity = Integer.parseInt(QuantityListProduct.getText());
            return infoQuantity == productQuantity;
        }

        return false;
    }

    public static Question<Boolean> from(){
        return new QuantityProductQuestion();
    }
}
