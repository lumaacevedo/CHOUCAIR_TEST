package co.com.choucair.certification.proyecyoseleccion.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class ProyectoSeleccionLoginPage extends PageObject {
    public static final Target LOGIN_BUTTON = Target.the("button that shows us the form to Register")
            .located(By.xpath("/html/body/ui-view/unauthenticated-container/div/div/unauthenticated-header/div/div[3]/ul[2]/li[2]/a"));
    public static final Target FIRST_NAME = Target.the("Where do we write the first name")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/input"));
    public static final Target LAST_NAME = Target.the("Where do we write the last name")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[2]/input"));
    public static final Target EMAIL_ADRESS = Target.the("Where do we write the email adress")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[3]/input"));
    public static final Target Date_BIRTH = Target.the("Where do we write the date of birth")
            .located(By.xpath(" /html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[4]/div[2]/div"));
    public static final Target LANGUAGES_SPOKE = Target.the("Where do we write the languages your spoke")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[5]/div[2]/div[1]"));
    public static final Target NEXT_LOCATION_BUTTON = Target.the("button that shows us continue the form to Register")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[2]"));
    public static final Target CITY = Target.the("Where do we write the city where you life")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[1]"));
    public static final Target POSTAL_CODE = Target.the("Where do we write the postal code where you life")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[3]"));
    public static final Target COUNTRY = Target.the("Where do we write the country where you life")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/div[1]"));
    public static final Target NEXT_DEVICES_BUTTON = Target.the("button that shows us continue the form to Register")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[2]/div"));
    public static final Target YOUR_COMPUTER_DEVICE = Target.the("Where do we write the your computer reference")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[1]/div[1]/div[2]/div/div[1]"));
    public static final Target YOUR_VERSION = Target.the("Where do we write the your windows version")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[1]/div[2]/div[2]/div/div[1]"));
    public static final Target LANGUAGES_WINDOWS = Target.the("Where do we write the your windows languages")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[1]/div[3]/div[2]/div/div[1]"));
    public static final Target YOUR_MOVILE_DEVICE = Target.the("Where do we write the your movil device")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[1]/div[2]"));
    public static final Target YOUR_MOVILE_MODEL = Target.the("Where do we write the your movil model")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[2]/div[2]"));
    public static final Target MOVILE_OPERATION_SYSTEM = Target.the("Where do we write the your movil operation system")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[3]/div[2]"));
    public static final Target LAST_STEP_BUTTON = Target.the("button that shows us continue the form to Register")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[2]/div"));
    public static final Target CREATE_PASSWORD = Target.the("Where do we write the password")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[3]/div[1]"));
    public static final Target CONFIRM_PASSWORD = Target.the("Where do we write confirm the password")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[3]/div[2]"));
    public static final Target RECIVE_INFORMATION_BOX = Target.the("Where check box for additional information")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[4]/label/span"));
    public static final Target ACCEPT_T_G_BOX = Target.the("Where check box for accept terms of use")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));
    public static final Target ACCEPT_PRIVACY_BOX = Target.the("Where check box for accept privacy policy")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));
    public static final Target COMPLETE_SEPTUP_BUTTON = Target.the("button that shows us final the form to Register")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div"));
}
