package co.com.bdb.automation.ui;


import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.webdriver.shadow.ByShadow;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;

import static net.serenitybdd.screenplay.targets.BaseTarget.the;

public class Web_Page {
    private Web_Page() {}


    public static final Target Specific = Target.the("campo Celular")
            .located(ByShadow.cssSelector("#uuid","body > app-root > app-main-page > div > div > bdb-ml-xcenter-login-form", "#bdb-ml-xcenter-login-form > div:nth-child(2) > bdb-at-input"));

    public static final Target Celular = Target.the("campo Celular")
            .located(ByShadow.cssSelector("#cell-phone","body > app-root > app-main-page > div > div > bdb-ml-xcenter-login-form", "#bdb-ml-xcenter-login-form > div:nth-child(3) > bdb-at-input"));
    public static final Target Cedula = Target.the("campo Cedula")
            .located(ByShadow.cssSelector("#identity-number","body > app-root > app-main-page > div > div > bdb-ml-xcenter-login-form", "#bdb-ml-xcenter-login-form > div:nth-child(4) > bdb-at-input"));
   //document.querySelector("body > app-root > app-main-page > div > div > bdb-ml-xcenter-login-form").shadowRoot.querySelector("#bdb-ml-xcenter-login-form > div.bdb-ml-xcenter-login-form__button > button")
    public static final Target Email = Target.the("campo Cedula")
            .located(ByShadow.cssSelector("#email","body > app-root > app-main-page > div > div > bdb-ml-xcenter-login-form", "#bdb-ml-xcenter-login-form > div:nth-child(5) > bdb-at-input"));

    public static final Target Ingresar = Target.the("campo Cedula")
            .located(ByShadow.cssSelector("#bdb-ml-xcenter-login-form > div.bdb-ml-xcenter-login-form__button > button","body > app-root > app-main-page > div > div > bdb-ml-xcenter-login-form"));




    public static final Target Assert_Payment = Target.the("Assert_Payment")
            .locatedBy("//font[normalize-space()='$40.00']");

    public static final Target Login = Target.the("Log in")
            .locatedBy("(//button[normalize-space()='Iniciar sesión'])[1]").containingText("Iniciar sesión");

    public static final Target Create_New_Account = the("Crear cuenta nueva")
            .locatedBy("(//a[normalize-space()='Crear cuenta nueva'])[1]");

    public static final Target Assert_Registro = Target.the("Assert_Registro")
            .locatedBy("(//div[@class='mbs _52lq fsl fwb fcb'])[1]");

    public static final Target CheckBoxOff = Target.the("Apaggar Checkbox")
            .locatedBy("\"(//*[name()='svg'][@class='rct-icon rct-icon-uncheck'])[1]\"");
    public static final Target Assert_CheckBox = Target.the("Assert Checkbox")
            .locatedBy("(//span[normalize-space()='You have selected :'])[1]");
    public static final Target Assert_Flight = Target.the("Assert flight")
            .locatedBy("//tbody/tr[@valign='top']/td/p[@align='left']/font[@face='Arial, Helvetica, sans-serif']/b/font[1]");
    public static final Target Assert_Addres = Target.the("Assert Addres")
            .locatedBy("(//p[@id='currentAddress'])[1]");

    public static final Target Assert_DoubleClick = Target.the("Assert DoubleClick")
            .locatedBy("(//p[@id='doubleClickMessage'])[1]");
    public static final Target Assert_RightClick = Target.the("Assert RightClick")
            .locatedBy("(//p[@id='rightClickMessage'])[1]");


}

