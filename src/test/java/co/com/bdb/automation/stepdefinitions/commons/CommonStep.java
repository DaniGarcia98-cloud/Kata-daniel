package co.com.bdb.automation.stepdefinitions.commons;

import co.com.bdb.automation.questions.CommonQuestions;
import co.com.bdb.automation.task.FillUserForm;
import co.com.bdb.automation.task.FormularioTask;
import co.com.bdb.automation.task.ModifyUserForm;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import io.cucumber.java.gl.Dado;
import jdk.javadoc.internal.doclets.formats.html.markup.Text;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.By;

import static co.com.bdb.automation.task.ModifyUserForm.withData;
import static co.com.bdb.automation.ui.Web_Page.Login;

import java.util.List;
import java.util.Map;

import static co.com.bdb.automation.stepdefinitions.commons.Actors.COMMON_ACTOR;
import static co.com.bdb.automation.ui.Web_Page.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static org.hamcrest.CoreMatchers.containsString;


public class CommonStep {
    private static final String Kata = "pages.Kata";


    @Dado("que el usuario ingrese a la pagina de orange")
    public void queElUsuarioIngreseALaPaginaDeorange() {
        COMMON_ACTOR.attemptsTo(
                Open.browserOn().thePageNamed(Kata));


    }

    @Cuando("complete el formulario con la siguiente informacion,luego da clic boton login")
    public void completeElFormularioConLaSiguienteInformacion(List<Map<String, String>> dataMapList) {
        Map<String, String> parameters = dataMapList.get(0);
        COMMON_ACTOR.attemptsTo(FormularioTask.formulario(parameters));
    }

    @Entonces("visualizara el mensaje de error")
    public void daraClicEnElBotonLogin() throws InterruptedException {
        COMMON_ACTOR.attemptsTo(
                Click.on(Login));
        Ensure.that(Invalid_crediantls).value().isEqualTo("Invalid crediantials");
        Thread.sleep(5000);

    }

    @Entonces("ingresara un nuevo usuario {string}, {string}, {string}, {string}")
    public void ingresaraUnNuevoUsuario(String employeeName, String nuevoUsuario, String clave, String confirmarClave) throws InterruptedException {
        COMMON_ACTOR.attemptsTo(
                FillUserForm.withData(employeeName, nuevoUsuario, clave, confirmarClave));

        Ensure.that(ASSERT_USUARIO_CREADO).value().isEqualTo("1Daniel123");


        Thread.sleep(5000);
    }

    @Entonces("vera el mensaje que el campo es requerido")
    public void veraElMensajeQueElCampoEsRequerido() throws InterruptedException {
        COMMON_ACTOR.attemptsTo(
                Click.on(Login));
        Ensure.that(Required_message).value().isEqualTo("Required");
        Thread.sleep(5000);

    }

    @Entonces("vera el mensaje que los campos son requeridos")
    public void veraElMensajeQueLosCamposSonRequeridos() {
        COMMON_ACTOR.attemptsTo(
                Click.on(Login));
        Ensure.that(Empty_field_user).value().isEqualTo("Required");
        Ensure.that(Empty_field_password).value().isEqualTo("Required");

    }

    @Entonces("buscara el usuario y lo actualizara")
    public void buscaraElUsuarioYLoActualizara() {
        COMMON_ACTOR.attemptsTo(
                Click.on(Login));


    }

    @Cuando("realice login")
    public void realicelogin(List<Map<String, String>> dataMapList) {
        Map<String, String> parameters = dataMapList.get(0);
        COMMON_ACTOR.attemptsTo(FormularioTask.formulario(parameters));
        Click.on(Login);

    }

    @Y("modificara el usuario {string}, {string}")
    public void
    modificaraElUsuario(String employeeName, String nuevoUsuario) {
        COMMON_ACTOR.attemptsTo(
                withData(employeeName, nuevoUsuario)
        );
    }

    @Y("busque el usuario {string}, {string}")
    public void busqueElUsuario(String employeeName, String nuevoUsuario) throws InterruptedException {
        COMMON_ACTOR.attemptsTo(
                Click.on(Login),
                Click.on(ADMIN_MENU),
                Enter.theValue(nuevoUsuario).into(SEARCH_USER_FIELD));

        Thread.sleep(5000);
    }

    @Entonces("modificara los datos del usuario {string}, {string}")
    public void modificaraLosDatosDelUsuario(String nuevoUsuario, String employeeName) {
        COMMON_ACTOR.attemptsTo(
                withData(nuevoUsuario, employeeName));
        Ensure.that(ASSERT_USUARIO_CREADO).value().isEqualTo("1Daniel123");
        ;


    }

    @Entonces("eliminara el usuario")
    public void eliminaraElUsuario() throws InterruptedException {
        COMMON_ACTOR.attemptsTo(
                Click.on(SEARCH_USER_FIELD),
                Click.on(ELIMINAR_BUTTON));

Thread.sleep(5000);
    }
}



















