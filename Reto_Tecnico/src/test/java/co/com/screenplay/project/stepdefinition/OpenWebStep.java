package co.com.screenplay.project.stepdefinition;

import co.com.screenplay.project.tasks.ChooseFirstProductTask;
import co.com.screenplay.project.tasks.ChooseSecondProductTask;
import co.com.screenplay.project.tasks.ProductsSlectedTask;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.questions.page.TheWebPage;
import org.hamcrest.Matchers;

import static co.com.screenplay.project.utils.Constants.ACTOR;
import static co.com.screenplay.project.utils.Constants.TITLE;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class OpenWebStep {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }


    @When("seleccionar el primer producto")
    public void selectTheFirstProduct() {
        OnStage.theActorCalled(ACTOR).attemptsTo(ChooseFirstProductTask.choose());
    }

    @And("seleccionar el segundo producto")
    public void selectTheSecondProduct() {
        OnStage.theActorCalled(ACTOR).attemptsTo(ChooseSecondProductTask.choose());
    }

    @Then("visualizara el carrito de compras")
    public void willDisplayTheShoppingCart() {
        OnStage.theActorCalled(ACTOR).attemptsTo(ProductsSlectedTask.choose());
        theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(TheWebPage.title(), Matchers.containsString(TITLE)
                )
        );
    }
}
