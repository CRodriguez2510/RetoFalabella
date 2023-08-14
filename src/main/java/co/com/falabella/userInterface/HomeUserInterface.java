package co.com.falabella.userInterface;

import net.serenitybdd.screenplay.targets.Target;

public class HomeUserInterface {

    public static Target TXTSEARCH = Target.the("Texbox search")
            .locatedBy("//input[@id='testId-SearchBar-Input']");
}
