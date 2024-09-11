package co.com.screenplay.project.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.screenplay.project.ui.HomeProductUI.*;
import static co.com.screenplay.project.ui.HomeUI.*;
import static co.com.screenplay.project.utils.Constants.TIME_SHORT;
import static co.com.screenplay.project.utils.Time.waitting;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class ChooseSecondProductTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.the(CATEGORY_PRODUCT, isEnabled()).forNoMoreThan(TIME_SHORT).seconds(), Click.on(CATEGORY_PRODUCT));
        actor.attemptsTo(WaitUntil.the(SECOND_PRODUCT, isEnabled()).forNoMoreThan(TIME_SHORT).seconds(), Click.on(SECOND_PRODUCT));
        actor.attemptsTo(WaitUntil.the(BTN_SUBMIT, isEnabled()).forNoMoreThan(TIME_SHORT).seconds(), Click.on(BTN_SUBMIT));
        waitting(TIME_SHORT);
    }

    public static ChooseSecondProductTask choose() {
        return Tasks.instrumented(ChooseSecondProductTask.class);
    }
}
