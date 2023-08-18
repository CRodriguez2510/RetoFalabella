package co.com.falabella.userInterface;

import net.serenitybdd.screenplay.targets.Target;

public class ValidationProductUserInterface {

    public static Target LBL_NameProduct = Target.the("Name Product Validation")
            .locatedBy("//a[@class='chakra-link css-qpfo7l']");
    //a[@class='chakra-link css-qpfo7l']

    public static Target LBL_QuantityProduct = Target.the("Quantity Product Validation")
            .locatedBy("//input[@class='chakra-input css-1k2vvg6']");

}
