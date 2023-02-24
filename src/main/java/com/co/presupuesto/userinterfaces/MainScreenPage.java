package com.co.presupuesto.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class MainScreenPage {

    public static final Target TXT_PARAMETRIZACION = Target.the("Campo Usuario")
            .locatedBy("//span[contains(text(),'{0}')]");
    public static final Target TXT_LINEAMIENTOS = Target.the("Campo Usuario")
            .locatedBy("//span[contains(text(),'{0}')]");
    public static final Target FLUJO_LINEAMIENTOS = Target.the("Campo Usuario")
            .locatedBy("//h2[contains(text(),'Lineamientos')]");


}
