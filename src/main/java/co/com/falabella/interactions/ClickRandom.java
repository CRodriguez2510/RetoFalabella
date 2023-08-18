package co.com.falabella.interactions;


import net.serenitybdd.core.pages.WebElementFacade;
import static co.com.falabella.utils.EscrituraExcel.escrituraExcel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;

import java.util.List;
import java.util.Random;

import static co.com.falabella.userInterface.ProductListUserInterface.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;


public class ClickRandom implements Interaction {
    private WebElementFacade element;

    public <T extends Actor> void performAs(T Customer) {
        List<WebElementFacade> listProducts = LBL_PRODUCT_LIST.resolveAllFor(Customer);

            Random random= new Random();
            int indexRandom= random.nextInt(listProducts.size());
            element=listProducts.get(indexRandom);

            co.com.falabella.utils.EscrituraExcel.escrituraExcel(
                    "src/test/resources/Data/Data.xlsx",
                    listProducts.get(indexRandom).getText(),1,2);

            listProducts.get(indexRandom).click();
    }

    public static Performable RandomProduct(){
        return instrumented(ClickRandom.class);
    }
}
