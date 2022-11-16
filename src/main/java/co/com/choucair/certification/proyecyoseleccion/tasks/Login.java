package co.com.choucair.certification.proyecyoseleccion.tasks;


import co.com.choucair.certification.proyecyoseleccion.userinterface.ProyectoSeleccionLoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import org.jetbrains.annotations.NotNull;

public class Login implements Task {
    public static Login onThePage() {
        return Tasks.instrumented(Login.class);
    }

    @Override
    public <T extends Actor> void performAs(@NotNull T actor){
        actor.attemptsTo(Click.on(ProyectoSeleccionLoginPage.LOGIN_BUTTON)
        );
    }
}
