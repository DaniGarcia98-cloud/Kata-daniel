package co.com.bdb.automation.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.ui.Button;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.Map;

import static co.com.bdb.automation.ui.Web_Page.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class FormularioTask implements Task {

    private final Map<String, String> data;

    public FormularioTask(Map<String, String> data){ this.data = data; }

    @Override
    public <T extends Actor> void performAs (T actor){
        actor.attemptsTo(
                Enter.keyValues(data.get("Specific")).into(Specific),
               Enter.keyValues(data.get("Celular")).into(Celular),
               Enter.keyValues(data.get("Cedula")).into(Cedula),
               Enter.keyValues(data.get("Email")).into(Email),
                Click.on(Ingresar)

        );
    }
    public static FormularioTask formulario(Map<String, String> data){
        return instrumented(FormularioTask.class,data);
    }
}