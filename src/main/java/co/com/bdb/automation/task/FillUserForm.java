package co.com.bdb.automation.task;

import lombok.SneakyThrows;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static co.com.bdb.automation.ui.Web_Page.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class FillUserForm implements Task {
    private final String employeeName;
    private final String nuevoUsuario;
    private final String clave;
    private final String confirmarClave;

    public FillUserForm(String employeeName, String nuevoUsuario, String clave, String confirmarClave) {
        this.employeeName = employeeName;
        this.nuevoUsuario = nuevoUsuario;
        this.clave = clave;
        this.confirmarClave = confirmarClave;
    }

    public static FillUserForm withData(String employeeName, String nuevoUsuario, String clave, String confirmarClave) {
        return instrumented(FillUserForm.class, employeeName, nuevoUsuario, clave, confirmarClave);
    }

    @SneakyThrows
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(Login),
                Click.on(ADMIN_MENU),
                Click.on(ADD_USER_BUTTON),

                WaitUntil.the(USER_ROLE_DROPDOWN, isVisible()).forNoMoreThan(5).seconds(),
                Click.on(USER_ROLE_DROPDOWN),
                Click.on(OPTION_ADMIN),

                Enter.theValue(employeeName).into(EMPLOYEE_NAME_FIELD));

        try {
            Thread.sleep(5000); // 🔹 Pausa de 5 segundos (no recomendado)
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // 🔹 Manejo adecuado de la excepción
        }
                actor.attemptsTo(

               Click.on(SELECT_BUTTON),
                Enter.theValue(nuevoUsuario).into(USERNAME_FIELD),

              Click.on(STATUS_DROPDOWN),
               Click.on(OPTION_ENABLED),

                Enter.theValue(clave).into(PASSWORD_FIELD),
               Enter.theValue(confirmarClave).into(CONFIRM_PASSWORD_FIELD),

                Click.on(SAVE_BUTTON));


    }}