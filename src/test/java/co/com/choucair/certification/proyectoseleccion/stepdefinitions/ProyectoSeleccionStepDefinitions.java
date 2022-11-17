package co.com.choucair.certification.proyectoseleccion.stepdefinitions;

import co.com.choucair.certification.proyecyoseleccion.model.ProyectoSeleccionData;
import co.com.choucair.certification.proyecyoseleccion.questions.Answer;
import co.com.choucair.certification.proyecyoseleccion.tasks.AccountRegistration;
import co.com.choucair.certification.proyecyoseleccion.tasks.Login;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import co.com.choucair.certification.proyecyoseleccion.tasks.OpenUp;

import java.util.List;


public class ProyectoSeleccionStepDefinitions {
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^that Luisa wants to register$")
    public void thatLuisaWantsToRegister() {
        OnStage.theActorCalled("Luisa").wasAbleTo(OpenUp.thePage(), (Login.onThePage()));

    }
    @When("^He proceeds to click on the registration option \\(JOIN TODAY\\)$")
    public void heProceedsToClickOnTheRegistrationOptionJOINTODAY(List<ProyectoSeleccionData> ProyectoSeleccionData) throws Exception {
        OnStage.theActorCalled("Luisa").attemptsTo(OpenUp.thePage(),AccountRegistration.
                onThePage(ProyectoSeleccionData.get(0).getStrFirstName(),ProyectoSeleccionData.get(0).getStrLastName(),
                        ProyectoSeleccionData.get(0).getStrEmailAdress(),ProyectoSeleccionData.get(0).getStrLanguageSpoke(),
                        ProyectoSeleccionData.get(0).getStrCity(),ProyectoSeleccionData.get(0).getStrPotalCode(),
                        ProyectoSeleccionData.get(0).getStrPassword(), ProyectoSeleccionData.get(0).getStrConfirmPassword()));
    }
    @Then("^He fills out the form in order to create a new Username\\.$")
    public void heFillsOutTheFormInOrderToCreateANewUsername(List<ProyectoSeleccionData> ProyectoSeleccionData) throws Exception{
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(ProyectoSeleccionData.get(0).getStrConfirmPassword())));

    }
}
