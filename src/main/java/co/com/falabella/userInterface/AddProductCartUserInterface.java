package co.com.falabella.userInterface;

import net.serenitybdd.screenplay.targets.Target;

public class AddProductCartUserInterface {


    public static Target Btn_AddQuantity = Target.the("button add quantity")
            .locatedBy("//button[@id='quantity-selector-increment-btn']");
    public static Target Data_Quantity = Target.the("Quantity data")
            .locatedBy("//input[@id='quantity-selector-increment-input']");
    public static Target Name_Product = Target.the("Name of Product")
            .locatedBy("//h1[@class='jsx-1680787435 product-name fa--product-name false']");
    public static Target Btn_AddProduct = Target.the("Add to cart button")
            .locatedBy("//button[@id='add-to-cart-button']");

    public static Target Btn_GoToCart = Target.the("button to go to cart")
            .locatedBy("//a[@id='linkButton']");
}
