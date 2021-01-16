package co.com.choucair.certification.reto.tasks;

import co.com.choucair.certification.reto.userinterface.LoadFormPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Load implements Task {

    public static Load theForm() {
        return Tasks.instrumented(Load.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(LoadFormPage.LOAD_BUTTON));
    }
}
