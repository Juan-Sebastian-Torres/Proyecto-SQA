package co.com.screenplay.project.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.screenplay.project.ui.HomeProductUI.INPUT_QUANTITY;
import static co.com.screenplay.project.ui.HomeUI.CATEGORY_PRODUCT;
import static co.com.screenplay.project.utils.Constants.TIME_SHORT;
import static co.com.screenplay.project.utils.Time.waitting;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class ChoseCategoryLove implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(WaitUntil.the(CATEGORY_PRODUCT, isEnabled()).forNoMoreThan(TIME_SHORT).seconds(), Click.on(CATEGORY_PRODUCT));
        waitting(TIME_SHORT);
        actor.attemptsTo(Scroll.to(INPUT_QUANTITY));
        actor.attemptsTo(WaitUntil.the(INPUT_QUANTITY, isEnabled()).forNoMoreThan(TIME_SHORT).seconds(), Enter.theValue("2").into(INPUT_QUANTITY));
        //actor.attemptsTo(WaitUntil.the(BTN_SUBMIT, isEnabled()).forNoMoreThan(TIME_SHORT).seconds(), Click.on(BTN_SUBMIT));
        waitting(TIME_SHORT);
    }

    public static ChoseCategoryLove choose(){
        return Tasks.instrumented(ChoseCategoryLove.class);
    }
}
