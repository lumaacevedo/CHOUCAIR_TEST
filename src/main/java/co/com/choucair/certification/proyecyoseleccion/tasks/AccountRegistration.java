package co.com.choucair.certification.proyecyoseleccion.tasks;


import co.com.choucair.certification.proyecyoseleccion.userinterface.ProyectoSeleccionAccountRegistration;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.jetbrains.annotations.NotNull;

public class AccountRegistration implements Task {
    private String strFirstName;
    private String strLastName;
    private String strEmailAdress;
    private String strLanguageSpoke;
    private String strCity;
    private String strPotalCode;
    private String strPassword;
    private String strConfirmPassword;
    public AccountRegistration(String strFirstName, String strLastName, String strEmailAdress, String strLanguageSpoke,
                               String strCity, String strPotalCode, String strPassword, String strConfirmPassword) {
        this.strFirstName = strFirstName;
        this.strLastName = strLastName;
        this.strEmailAdress = strEmailAdress;
        this.strLanguageSpoke = strLanguageSpoke;
        this.strCity = strCity;
        this.strPotalCode = strPotalCode;
        this.strPassword = strPassword;
        this.strConfirmPassword = strConfirmPassword;
    }
    public static AccountRegistration onThePage(String strFirstName, String strLastName, String strEmailAdress,
                                                String strLanguageSpoke, String strCity, String strPotalCode,
                                                String strPassword, String strConfirmPassword){
        return Tasks.instrumented(AccountRegistration.class,strFirstName,strLastName,strEmailAdress,strLanguageSpoke,
                strCity,strPotalCode,strPassword,strConfirmPassword);
    }
    @Override
    public <T extends Actor> void performAs(@NotNull T actor){
        actor.attemptsTo(Enter.theValue(strFirstName).into(ProyectoSeleccionAccountRegistration.FIRST_NAME),
                Enter.theValue(strLastName).into(ProyectoSeleccionAccountRegistration.LAST_NAME),
                Enter.theValue(strEmailAdress).into(ProyectoSeleccionAccountRegistration.EMAIL_ADRESS),
                Click.on(ProyectoSeleccionAccountRegistration.DATE_BIRTH_MOUNTH),
                Click.on(ProyectoSeleccionAccountRegistration.DATE_BIRTH_DAY),
                Click.on(ProyectoSeleccionAccountRegistration.DATE_BIRTH_YEAR),
                Enter.theValue(strLanguageSpoke).into(ProyectoSeleccionAccountRegistration.LANGUAGES_SPOKE),
                Click.on(ProyectoSeleccionAccountRegistration.NEXT_LOCATION_BUTTON),
                Enter.theValue(strCity).into(ProyectoSeleccionAccountRegistration.CITY),
                Enter.theValue(strPotalCode).into(ProyectoSeleccionAccountRegistration.POSTAL_CODE),
                Click.on(ProyectoSeleccionAccountRegistration.COUNTRY_SELECT),
                Click.on(ProyectoSeleccionAccountRegistration.NEXT_DEVICES_BUTTON),
                Click.on(ProyectoSeleccionAccountRegistration.YOUR_COMPUTER_DEVICE),
                Click.on(ProyectoSeleccionAccountRegistration.YOUR_COMPUTER_VERSION),
                Click.on(ProyectoSeleccionAccountRegistration.LANGUAGES_WINDOWS),
                Click.on(ProyectoSeleccionAccountRegistration.YOUR_MOVILE_DEVICE),
                Click.on(ProyectoSeleccionAccountRegistration.YOUR_MOVILE_MODEL),
                Click.on(ProyectoSeleccionAccountRegistration.MOVILE_OPERATION_SYSTEM),
                Click.on(ProyectoSeleccionAccountRegistration.COMPLETE_SEPTUP_BUTTON),
                Enter.theValue(strPassword).into(ProyectoSeleccionAccountRegistration.CREATE_PASSWORD),
                Enter.theValue(strConfirmPassword).into(ProyectoSeleccionAccountRegistration.CONFIRM_PASSWORD),
                Click.on(ProyectoSeleccionAccountRegistration.RECIVE_INFORMATION_BOX),
                Click.on(ProyectoSeleccionAccountRegistration.ACCEPT_T_G_BOX),
                Click.on(ProyectoSeleccionAccountRegistration.ACCEPT_PRIVACY_BOX),
                Click.on(ProyectoSeleccionAccountRegistration.COMPLETE_SEPTUP_BUTTON)
        );
    }
}
