package co.com.falabella.tasks;

import co.com.falabella.utils.Data;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static co.com.falabella.userInterface.HomeUserInterface.SEARCH_TXT;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class HomeTask implements Task {

    @Override
    public <T extends Actor> void performAs(T Customer) {
        Customer.attemptsTo(
                Enter.theValue(Data.extractTo().get(0).get("Search"))
                        .into(SEARCH_TXT).thenHit(Keys.ENTER));
    }

    public static HomeTask intoProduct(){
        return  instrumented(HomeTask.class);
    }

}
