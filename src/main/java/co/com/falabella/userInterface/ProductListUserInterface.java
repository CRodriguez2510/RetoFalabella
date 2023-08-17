package co.com.falabella.userInterface;

import net.serenitybdd.screenplay.targets.Target;

public class ProductListUserInterface {

    public static Target LBL_PRODUCT_LIST = Target.the("list of Products")
            .locatedBy("//a[@class='jsx-1576191951 section-body pod-link']");

    public static Target LBL_LIST_PRODUCT = Target.the("Product list")
            .locatedBy("//a[@class='jsx-1833870204 jsx-3831830274 pod-link']");
}
