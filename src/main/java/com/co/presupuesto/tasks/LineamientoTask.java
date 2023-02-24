package com.co.presupuesto.tasks;

import com.co.presupuesto.userinterfaces.LineamientoPage;
import com.co.presupuesto.utils.Esperas;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class LineamientoTask implements Task {

    private String Nombre;
    private String Descripcion;
    private String TipoLineamiento;
    private String ValorLineamiento;
    private String TipoDeAfectacion;
    private String Estado;
    private String FechaInicio;
    private String FechaFin;
    private String FechaLimite;

    public LineamientoTask(String nombre, String descripcion, String tipoLineamiento, String valorLineamiento, String tipoDeAfectacion, String estado, String fechaInicio, String fechaFin, String fechaLimite) {
        Nombre = nombre;
        Descripcion = descripcion;
        TipoLineamiento = tipoLineamiento;
        ValorLineamiento = valorLineamiento;
        TipoDeAfectacion = tipoDeAfectacion;
        Estado = estado;
        FechaInicio = fechaInicio;
        FechaFin = fechaFin;
        FechaLimite = fechaLimite;
    }


    @Override

    public <T extends Actor> void performAs(T actor) {
        Esperas.esperarHasta(2,"segundos");
        actor.wasAbleTo(
                Click.on(LineamientoPage.BUTTON_CREARLINEAMIENTO),
                Enter.theValue(Nombre).into(LineamientoPage.INPUT_NOMBREDELINEAMIENTO),
                Enter.theValue(Descripcion).into(LineamientoPage.INPUT_DESCRIPCIONDELINEAMIENTO),
                Click.on(LineamientoPage.CHECK_TIPODELINEAMIENTO),
                Click.on(LineamientoPage.LISTA_TIPODELINEAMIENTO.of(TipoLineamiento)),
                Enter.theValue(ValorLineamiento).into(LineamientoPage.INPUT_VALORDELINEAMIENTO),
                Click.on(LineamientoPage.CHECK_TIPOAFECTACION),
                Click.on(LineamientoPage.LISTA_TIPOAFECTACION.of(TipoDeAfectacion)),
                Click.on(LineamientoPage.CHECK_ESTADO),
                Click.on(LineamientoPage.LISTA_ESTADO.of(Estado)),
                Enter.theValue(FechaInicio).into(LineamientoPage.LISTA_FECHAINICIO),
                Enter.theValue(FechaFin).into(LineamientoPage.INPUT_FECHAFIN),
                Enter.theValue(FechaLimite).into(LineamientoPage.INPUT_FECHALIMITE),
                Click.on(LineamientoPage.BUTTON_GUARDAR)
        );
        Esperas.esperarHasta(5,"segundos");

    }

    public static LineamientoTask onThePage(String Nombre, String Descripcion, String TipoLineamiento,
                                            String ValorLineamiento, String TipoDeAfectacion,
                                            String Estado, String FechaInicio, String FechaFin, String FechaLimite) {
        return Tasks.instrumented(LineamientoTask.class, Nombre, Descripcion,
                TipoLineamiento, ValorLineamiento, TipoDeAfectacion, Estado, FechaInicio, FechaFin, FechaLimite);
    }
}
