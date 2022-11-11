package co.com.choucair.certification.proyecyoseleccion.tasks;

import co.com.choucair.certification.proyecyoseleccion.userinterface.ProyectoSeleccionLoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import org.jetbrains.annotations.NotNull;

public class Login implements Task {
    private final ProyectoSeleccionLoginPage proyectoseleccionLoginPage;

    public Login(ProyectoSeleccionLoginPage proyectoseleccionLoginPage) {
        this.proyectoseleccionLoginPage = proyectoseleccionLoginPage;
    }

    public static Login onThePage() {
        return Tasks.instrumented(Login.class);
    }

    @Override
    public <T extends Actor> void performAs(@NotNull T actor){
        actor.attemptsTo(Open.browserOn((proyectoseleccionLoginPage)));

    }
}
