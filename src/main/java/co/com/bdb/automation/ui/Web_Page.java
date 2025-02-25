package co.com.bdb.automation.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.ui.Button;
import net.thucydides.core.webdriver.shadow.ByShadow;

import static net.serenitybdd.screenplay.targets.BaseTarget.the;

public class Web_Page {
    private Web_Page() {}


    public static final Target Usuario = Target.the("campo Usuer")
            .locatedBy("(//input[@placeholder='Username'])[1]");
   public static final Target Contraseña = Target.the("campo Password")
           .locatedBy("//input[@placeholder='Password']");
 public static final Target Login = Target.the("button login")
         .located(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
    public static final Target ADMIN_MENU = Target.the("admin")
            .located(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a"));
    public static final Target ADD_USER_BUTTON = Target.the("campo add")
            .located(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[1]/button/i"));

    public static final Target USER_ROLE_DROPDOWN = Target.the("User Role dropdown")
            .located(By.xpath("(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[1]"));
    public static final Target OPTION_ADMIN  = Target.the("Select Admin")
            .located(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[1]/div/div[2]/div/div[2]/div[2]"));
    public static final Target EMPLOYEE_NAME_FIELD = Target.the("User EMPLOYEE_NAME_FIELD")
            .located(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/div/div[2]/div/div/input"));
    public static final Target USERNAME_FIELD = Target.the(" User Name")
            .located(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[4]/div/div[2]/input"));

    public static final Target STATUS_DROPDOWN = Target.the("Dropdown de Status")
            .located(By.xpath("(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[2]"));
    public static final Target OPTION_ENABLED = Target.the("Option Enabled en Status")
            .located(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[3]/div/div[2]/div/div[2]/div[2]"));
    public static final Target OPTION_DISABLED = Target.the("Option Enabled en Status")
            .located(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[3]/div/div[2]/div/div[2]/div[2]"));
    public static final Target PASSWORD_FIELD = Target.the("Campo Password usuario")
            .located(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div/div[2]/input"));
    public static final Target Clic_BUTTOM= Target.the("Clic button")
            .located(By.xpath("//div[@role='option' and span[text()='" + "ESS" + "']]"));
    public static final Target CONFIRM_PASSWORD_FIELD = Target.the("Campo Confirm Password")
            .located(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div[2]/input"));
    public static final Target SAVE_BUTTON = Target.the("Botón Save")
            .located(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]"));
   public static final Target SELECT_BUTTON = Target.the("Botón Selecionar")
           .located(By.cssSelector("div.oxd-autocomplete-dropdown.--positon-bottom"));
    public static final Target SEARCH_USER_FIELD = Target.the("Campo de búsqueda en Admin")
            .located(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/input"));


    public static final Target EDIT_BUTTON = Target.the("Botón de edición del usuario")
            .located(By.xpath("(//button[@type='button'])[8]"));
    public static final Target CHANGE_PASSWORD_CHECKBOX = Target.the("Checkbox para cambiar contraseña")
            .located(By.xpath("(//i[@class='oxd-icon bi-check oxd-checkbox-input-icon'])[1]"));
    public static final Target SAVE_BUTTON_MODIFY = Target.the("Botón Guardar en edición")
            .located(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]"));
    public static final Target ASSERT_USUARIO_CREADO = Target.the("Botón Guardar en edición")
            .located(By.xpath("//*[contains(text(),'1Daniel123')]"
                    ));
    public static final Target Invalid_crediantls = Target.the( "Assert  log in")
            .locatedBy("(//p[@class='oxd-text oxd-text--p oxd-alert-content-text'])[1]");
    public static final Target Required_message = Target.the("Mensaje requerido")
            .locatedBy("(//span[@class='oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group__message'])[1]");
    public static final Target Empty_field_user = Target.the( "Assert log in empty field user")
            .locatedBy("(//span[@class='oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group__message'][normalize-space()='Required'])[1]");
    public static final Target Empty_field_password = Target.the( "Assert log in empty field password")
            .locatedBy("(//span[@class='oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group__message'][normalize-space()='Required'])[2]");

}

