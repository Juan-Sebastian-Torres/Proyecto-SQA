package co.com.screenplay.project.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomeProductUI extends PageObject {

    public static final Target BTN_SUBMIT = Target.the("First product").located(By.className("single_add_to_cart_button"));
    public static final Target INPUT_QUANTITY = Target.the("Input quantity").located(By.xpath("/html/body/div[2]/main/div[2]/div/div[2]/form/input[1]"));
}
