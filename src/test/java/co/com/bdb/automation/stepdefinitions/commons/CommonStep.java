package co.com.bdb.automation.stepdefinitions.commons;

import co.com.bdb.automation.questions.CommonQuestions;
import co.com.bdb.automation.task.FormularioTask;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import io.cucumber.java.gl.Dado;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.SetCheckbox;

import java.util.List;
import java.util.Map;

import static co.com.bdb.automation.stepdefinitions.commons.Actors.COMMON_ACTOR;
import static co.com.bdb.automation.ui.Web_Page.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;


public class CommonStep {
    private static final String DEMO6 = "pages.Demo6";




    @Entonces("verificara doble click {string}")
    public void verificaraDobleClick(String dobleClick) {
        COMMON_ACTOR.should(seeThat(CommonQuestions.textEquals(dobleClick, Assert_DoubleClick)));
    }

    @Y("la asercion click derecho {string}")
    public void laAsercionClickDerecho(String clickDerecho) {
        COMMON_ACTOR.should(seeThat(CommonQuestions.textEquals(clickDerecho, Assert_RightClick)));
    }



    @Dado("que el usuario ingrese al formularioTicket")
    public void queElUsuarioIngreseAlFormularioTicket() {
        COMMON_ACTOR.attemptsTo(
                Open.browserOn().thePageNamed(DEMO6));

    }
    @Cuando("Complete el formulario con la siguiente informacion")
    public void completeElFormularioConLaSiguienteInformacion(List<Map<String, String>> dataMapList) {
        Map<String, String> parameters = dataMapList.get(0);
        COMMON_ACTOR.attemptsTo(FormularioTask.formulario(parameters));
    }
}




