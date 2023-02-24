package com.co.presupuesto.tasks;

import com.co.presupuesto.userinterfaces.MainScreenPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;


public class MainScreenTask implements Task {
    private String menuUno;
    private String menuDos;

    public MainScreenTask(String menuUno, String menuDos) {
        this.menuUno = menuUno;
        this.menuDos = menuDos;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.wasAbleTo(Click.on(MainScreenPage.TXT_PARAMETRIZACION.of(menuUno)),Click.on(MainScreenPage.TXT_LINEAMIENTOS.of(menuDos)));
    }
    public static MainScreenTask onThePage(String MenuUno, String MenuDos) {
        return Tasks.instrumented(MainScreenTask.class, MenuUno, MenuDos);
    }
}
