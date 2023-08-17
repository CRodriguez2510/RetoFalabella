package co.com.falabella.questions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.falabella.userInterface.ValidationProductUserInterface.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class NameProductQuestion implements Question <Boolean> {

    @Override
    public Boolean answeredBy(Actor Customer) {

        WebElementFacade nameProductTxt = LBL_NameProduct.resolveFor(Customer);
        WaitUntil.the(LBL_NameProduct, isVisible()).forNoMoreThan(5).seconds();

        String productName = Customer.recall("NameProduct");
        String infoName = nameProductTxt.getText();

        if(!infoName.contains(productName)){
            return false;
        }

        return true;
    }

    public static Question<Boolean> from(){
        return new NameProductQuestion();
    }

}
