package co.com.choucair.certification.proyectoseleccion.stepdefinitions;

import co.com.choucair.certification.proyecyoseleccion.tasks.Login;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import co.com.choucair.certification.proyecyoseleccion.tasks.OpenUp;

public class ProyectoSeleccionStepDefinitions {
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }
    @Given("^that Luisa wants to register$")
    public void thatLuisaWantsToRegister() {
        OnStage.theActorCalled("Luisa").wasAbleTo(OpenUp.thePage(), Login.onThePage());

    }
    @When("^He proceeds to click on the registration option \\(JOIN TODAY\\)$")
    public void heProceedsToClickOnTheRegistrationOptionJOINTODAY() {
        // Write code here that turns the phrase above into concrete actions

    }
    @Then("^He fills out the form in order to create a new Username\\.$")
    public void heFillsOutTheFormInOrderToCreateANewUsername() {
        // Write code here that turns the phrase above into concrete actions

    }
}