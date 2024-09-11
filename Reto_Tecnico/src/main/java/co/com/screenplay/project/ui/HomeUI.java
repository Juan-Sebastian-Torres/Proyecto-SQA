package co.com.screenplay.project.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomeUI extends PageObject {

    public static final Target CATEGORY_PRODUCT = Target.the("Category product").located(By.xpath("/html/body/div[2]/header/div[2]/div/div/div[2]/nav/div/ul/li[3]/a"));
    public static final Target FIRST_PRODUCT = Target.the("First product").located(By.xpath("/html/body/div[2]/div[6]/section[2]/div/div[1]/div/div/div[2]/div/div[1]/div"));
    public static final Target SECOND_PRODUCT = Target.the("Second product").located(By.xpath("/html/body/div[2]/div[6]/section[2]/div/div[1]/div/div/div[2]/div/div[4]/div"));
    public static final Target MINI_CART = Target.the("Mini cart").located(By.xpath("/html/body/div[2]/header/div[2]/div/div/div[3]/div/div[1]/div[1]/div/div/a"));
    public static final Target GO_CART = Target.the("GO cart").located(By.xpath("/html/body/div[2]/header/div[2]/div/div/div[3]/div/div[1]/div[1]/div/div/a"));
}
