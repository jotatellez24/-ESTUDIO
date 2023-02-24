package com.co.presupuesto.questions;

import com.co.presupuesto.userinterfaces.MainScreenPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import javax.swing.*;

public class Answers implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(MainScreenPage.FLUJO_LINEAMIENTOS).viewedBy(actor).asString();

    }
    public static Answers compare(){;
        return new Answers();
    }

}
