package co.com.choucair.certification.proyecyoseleccion.questions;

import co.com.choucair.certification.proyecyoseleccion.userinterface.ProyectoSeleccionAccountRegistration;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;


public class Answer implements Question<Boolean> {
    private String question;
    public Answer(String question){
        this.question = question;
    }
    public static Answer toThe(String question) {
        return new Answer(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String completeRegister= Text.of(ProyectoSeleccionAccountRegistration.CONFIRM_PASSWORD).viewedBy(actor).asString();
        if (question.equals(completeRegister)){
            result = true;
        }else {
            result = false;
        }
        return null;
    }
}
