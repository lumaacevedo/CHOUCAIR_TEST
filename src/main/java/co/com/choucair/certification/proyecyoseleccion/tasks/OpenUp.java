package co.com.choucair.certification.proyecyoseleccion.tasks;

import co.com.choucair.certification.proyecyoseleccion.userinterface.ProyectoSeleccionPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import org.jetbrains.annotations.NotNull;

public class OpenUp implements Task {
    private final ProyectoSeleccionPage proyectoseleccionPage;

    public OpenUp(ProyectoSeleccionPage proyectoseleccionPage) {
        this.proyectoseleccionPage = proyectoseleccionPage;
    }
    public static Performable thePage() {
        return Tasks.instrumented(OpenUp.class);
    }
    @Override
    public <T extends Actor> void performAs(@NotNull T actor) {
        actor.attemptsTo(Open.browserOn((proyectoseleccionPage)));
    }
}
