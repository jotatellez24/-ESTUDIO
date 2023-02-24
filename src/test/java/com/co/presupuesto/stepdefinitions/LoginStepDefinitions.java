package com.co.presupuesto.stepdefinitions;

import com.co.presupuesto.questions.Answers;
import com.co.presupuesto.tasks.LoginUserTask;
import com.co.presupuesto.tasks.OpenWebDriver;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.pages.PageObject;
import org.hamcrest.Matchers;


import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;

public class LoginStepDefinitions {
    private PageObject page;

    @Before
    public void setUp() {
        setTheStage(new OnlineCast());
    }

    @Given("^el usuario accede a la pagina$")
    public void elUsuarioAccedeALaPagina() throws Exception {
        OnStage.theActorCalled("Jesus").wasAbleTo(OpenWebDriver.on(page));
    }

    @When("^el usuario ingresa su usuario (.*) y contraseña (.*)$")
    public void elUsuarioIngresaSuUsuarioYContraseña(String strUser, String strPassword) throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(LoginUserTask.onThePage(strUser, strPassword));

    }

    @Then("^el usuario deberia ver el nombre del usuario en pantalla de inicio$")
    public void elUsuarioDeberiaVerElNombreDelUsuarioEnPantallaDeInicio() throws Exception {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answers.compare(), Matchers.is("aj.cotesbarrozo@tcs.com")));
    }


}