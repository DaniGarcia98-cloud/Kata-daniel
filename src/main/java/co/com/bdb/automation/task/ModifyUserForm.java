package co.com.bdb.automation.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static co.com.bdb.automation.ui.Web_Page.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ModifyUserForm implements Task {
    private final String nuevoUsuario;
    private final String employeeName;

    public ModifyUserForm(String nuevoUsuario, String employeeName) {
        this.nuevoUsuario = nuevoUsuario;
        this.employeeName = employeeName;
    }

    public static ModifyUserForm withData(String nuevoUsuario, String employeeName) {
        return instrumented(ModifyUserForm.class, nuevoUsuario, employeeName);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        String modifiedUsername = "1" + nuevoUsuario + "1234";
        String newPassword = "098" + nuevoUsuario + "12345";

        actor.attemptsTo(

                Click.on(EDIT_BUTTON),
                Click.on(USER_ROLE_DROPDOWN),
                Click.on(OPTION_ENABLED),
                SelectFromOptions.byVisibleText("ESS").from(USE_ROLE_DROPDOWN),

               Enter.theValue(employeeName).into(EMPLOYEE_NAME_FIELD),
                Enter.theValue(modifiedUsername).into(USERNAME_FIELD));
//
//                Click.on(CHANGE_PASSWORD_CHECKBOX),
//                Enter.theValue(newPassword).into(PASSWORD_FIELD),
//                Enter.theValue(newPassword).into(CONFIRM_PASSWORD_FIELD),
//
//                Click.on(SAVE_BUTTON_MODIFY)

    }
}
