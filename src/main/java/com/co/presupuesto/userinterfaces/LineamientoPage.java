package com.co.presupuesto.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class LineamientoPage {
    public static final Target BUTTON_CREARLINEAMIENTO = Target.the("CREA LINEAMIENTO")
            .locatedBy("//span[contains(text(),'Crear Lineamiento')]");

    public static final Target INPUT_NOMBREDELINEAMIENTO = Target.the("NOMBRE LINEAMIENTO")
            .locatedBy("//input[@id='name']");

    public static final Target INPUT_DESCRIPCIONDELINEAMIENTO = Target.the("INPUT DESCRIPCION")
            .locatedBy("//input[@id='description']");

    public static final Target CHECK_TIPODELINEAMIENTO = Target.the("CHECK TIPO LINEAMIENTO")
            .locatedBy("//span[contains(text(),'Tipo de lineamiento')]");

    public static final Target LISTA_TIPODELINEAMIENTO = Target.the("LISTA TIPO DE LINEAMIENTO")
            .locatedBy("//span[contains(text(),'{0}')]");

    public static final Target INPUT_VALORDELINEAMIENTO = Target.the("INPUT VALOR DEL LINEAMIENTO")
            .locatedBy("//input[@id='amount']");

    public static final Target CHECK_TIPOAFECTACION = Target.the("CREA LINEAMIENTO")
            .locatedBy("//span[contains(text(),'Tipo de afectacion')]");

    public static final Target LISTA_TIPOAFECTACION = Target.the("CREA LINEAMIENTO")
            .locatedBy("//span[contains(text(),'{0}')]");

    public static final Target CHECK_ESTADO = Target.the("ESTADO")
            .locatedBy("//span[contains(text(),'Estado')]");

    public static final Target LISTA_ESTADO = Target.the("LISTA LINEAMIENTO")
            .locatedBy("//span[contains(text(),'{0}')]");

    public static final Target LISTA_FECHAINICIO = Target.the("CREA LINEAMIENTO")
            .locatedBy("//input[@id='init_date']");

    public static final Target INPUT_FECHAFIN = Target.the("CREA LINEAMIENTO")
            .locatedBy("//input[@id='end_date']");
    public static final Target INPUT_FECHALIMITE = Target.the("CREA LINEAMIENTO")
            .locatedBy("//input[@id='limit_date']");

    public static final Target BUTTON_GUARDAR = Target.the("BUTTON GUARDAR")
            .locatedBy("//span[contains(text(),'Guardar')]");



}
