package com.co.presupuesto.tasks;

import com.co.presupuesto.userinterfaces.LoginPage;
import com.co.presupuesto.userinterfaces.OpenUpPage;
import com.co.presupuesto.utils.Esperas;
import net.serenitybdd.core.environment.ConfiguredEnvironment;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;

import javax.swing.*;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class OpenWebDriver implements Task {
    OpenUpPage page;

    @Override

    public <T extends Actor> void performAs(T actor) {

        actor.wasAbleTo(Open.browserOn(page));

    }

    public static OpenWebDriver on(net.thucydides.core.pages.PageObject page) {
        return Tasks.instrumented(OpenWebDriver.class, page);
    }
}
