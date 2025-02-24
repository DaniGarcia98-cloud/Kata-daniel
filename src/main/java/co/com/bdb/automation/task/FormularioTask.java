package co.com.bdb.automation.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.Map;

import static co.com.bdb.automation.ui.Web_Page.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;


public class FormularioTask implements Task {

    private final Map<String, String> data;

    public FormularioTask(Map<String, String> data){ this.data = data; }

    @Override
    public <T extends Actor> void performAs (T actor){
        actor.attemptsTo(
                Enter.keyValues(data.get("Usuario")).into(Usuario),
                Enter.keyValues(data.get("Contraseña")).into(Contraseña)


//                Click.on(downTyCButtom)

        );
    }
    public static FormularioTask formulario(Map<String, String> data){
        return instrumented(FormularioTask.class,data);
    }
}