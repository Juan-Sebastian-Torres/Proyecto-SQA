package co.com.screenplay.project.stepdefinition.hook;

import co.com.screenplay.project.hook.OpenWeb;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class Hook {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("{string} abre la pagina web de prueba")
    public void userOpenTheTestWebPage(String actor) {
        OnStage.theActorCalled(actor).attemptsTo(
                OpenWeb.broserURL()
        );

    }

}
