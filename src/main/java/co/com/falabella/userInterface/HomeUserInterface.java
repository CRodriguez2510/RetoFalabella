package co.com.falabella.userInterface;

import net.serenitybdd.screenplay.targets.Target;

public class HomeUserInterface {

    public static Target SEARCH_TXT = Target.the("Texbox search")
            .locatedBy("//input[@id='testId-SearchBar-Input']");
}
