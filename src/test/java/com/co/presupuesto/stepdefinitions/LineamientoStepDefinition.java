package com.co.presupuesto.stepdefinitions;

import com.co.presupuesto.questions.Answers;
import com.co.presupuesto.tasks.LineamientoTask;
import com.co.presupuesto.tasks.MainScreenTask;

import cucumber.api.java.es.*;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.Matchers;

import java.util.Map;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class LineamientoStepDefinition {


    @Dado("^Ingresa a la lista desplegable de (.*) y (.*)$")
    public void ingresaALaListaDesplegableDeParametrizacionYLineamientos(String menuUno, String menuDos) throws Exception {
        theActorInTheSpotlight().attemptsTo(MainScreenTask.onThePage(menuUno, menuDos));
    }


    @Cuando("^Ingreso a Lineamientos deseo ver el flujo de (.*)$")
    public void ingresoALineamientosDeseoVerElFlujoDeLineamientos(String mensajeFLujo) throws Exception {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answers.compare(), Matchers.is(mensajeFLujo)));
    }

    @Entonces("^Le doy click a crear lineamiento e ingreso los datos$")
    public void leDoyClickACrearLineamientoEIngresoLosDatos(Map<String, String> mapCaracteristicas) throws Exception {
        theActorInTheSpotlight().wasAbleTo(LineamientoTask.onThePage(
                mapCaracteristicas.get("Nombre"),
                mapCaracteristicas.get("Descripcion"),
                mapCaracteristicas.get("TipoLineamiento"),
                mapCaracteristicas.get("ValorLineamiento"),
                mapCaracteristicas.get("TipoDeAfectacion"),
                mapCaracteristicas.get("Estado"),
                mapCaracteristicas.get("FechaInicio"),
                mapCaracteristicas.get("FechaFin"),
                mapCaracteristicas.get("FechaLimite")
        ));
    }

    @Entonces("^Valido que se haya creado correctamente$")
    public void validoQueSeHayaCreadoCorrectamente() throws Exception {

    }

}
