package co.com.choucair.certification.proyecyoseleccion.tasks;


import co.com.choucair.certification.proyecyoseleccion.userinterface.ProyectoSeleccionAccountRegistration;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class AccountRegistration implements Task {
    public static AccountRegistration onThePage(){
        return Tasks.instrumented(AccountRegistration.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(Enter.theValue("IngresaTuNombre").into(ProyectoSeleccionAccountRegistration.FIRST_NAME),
                Enter.theValue("IngresaTuApellido").into(ProyectoSeleccionAccountRegistration.LAST_NAME),
                Enter.theValue("IngresaTuCorreo").into(ProyectoSeleccionAccountRegistration.EMAIL_ADRESS),
                Click.on(ProyectoSeleccionAccountRegistration.DATE_BIRTH_MOUNTH),
                Click.on(ProyectoSeleccionAccountRegistration.DATE_BIRTH_DAY),
                Click.on(ProyectoSeleccionAccountRegistration.DATE_BIRTH_YEAR),
                Enter.theValue("IdiomaQueHablas").into(ProyectoSeleccionAccountRegistration.LANGUAGES_SPOKE),
                Click.on(ProyectoSeleccionAccountRegistration.NEXT_LOCATION_BUTTON),
                Enter.theValue("IngreseLaCiudad").into(ProyectoSeleccionAccountRegistration.CITY),
                Enter.theValue("IngreseCodPostal").into(ProyectoSeleccionAccountRegistration.POSTAL_CODE),
                Click.on(ProyectoSeleccionAccountRegistration.COUNTRY_SELECT),
                Click.on(ProyectoSeleccionAccountRegistration.NEXT_DEVICES_BUTTON),
                Click.on(ProyectoSeleccionAccountRegistration.YOUR_COMPUTER_DEVICE),
                Click.on(ProyectoSeleccionAccountRegistration.YOUR_COMPUTER_VERSION),
                Click.on(ProyectoSeleccionAccountRegistration.LANGUAGES_WINDOWS),
                Click.on(ProyectoSeleccionAccountRegistration.YOUR_MOVILE_DEVICE),
                Click.on(ProyectoSeleccionAccountRegistration.YOUR_MOVILE_MODEL),
                Click.on(ProyectoSeleccionAccountRegistration.MOVILE_OPERATION_SYSTEM),
                Click.on(ProyectoSeleccionAccountRegistration.COMPLETE_SEPTUP_BUTTON),
                Enter.theValue("IngresaContrasenha").into(ProyectoSeleccionAccountRegistration.CREATE_PASSWORD),
                Enter.theValue("ConfirmarContrasenha").into(ProyectoSeleccionAccountRegistration.CONFIRM_PASSWORD),
                Click.on(ProyectoSeleccionAccountRegistration.RECIVE_INFORMATION_BOX),
                Click.on(ProyectoSeleccionAccountRegistration.ACCEPT_T_G_BOX),
                Click.on(ProyectoSeleccionAccountRegistration.ACCEPT_PRIVACY_BOX),
                Click.on(ProyectoSeleccionAccountRegistration.COMPLETE_SEPTUP_BUTTON)
        );
    }
}
