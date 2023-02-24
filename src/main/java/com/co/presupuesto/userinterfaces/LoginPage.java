package com.co.presupuesto.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {
    public static final Target TXT_USUARIO = Target.the("Campo Usuario")
            .locatedBy("/html/body/div[3]/div/div/div/div/div/form/div[3]/div[1]/input");
    public static final Target TXT_CONTRASENIA = Target.the("Campo Contraseña")
            .locatedBy("//*[@id=\"password\"]");
    public static  final Target BTN_CONTINUAR =Target.the("Botón CONTINUAR")
            .locatedBy("//body/app-root[1]/div[1]/app-login[1]/div[1]/div[2]/button[1]");

    public static  final Target BTN_mensae =Target.the("Botón CONTINUAR")
            .locatedBy("//*[@id=\"api\"]/div[1]/h1");
    public static  final Target BTN_singin =Target.the("Botón CONTINUAR")
            .locatedBy("//*[@id=\"next\"]");




}
