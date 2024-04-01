package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static userinterface.LoginPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class Login implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(TXT_USERNAME,isEnabled()).forNoMoreThan(5).seconds(),
                Enter.theValue("standard_user").into(TXT_USERNAME),
                Enter.theValue("secret_sauce").into(TXT_PASSWORD),
                Click.on(BTN_LOGIN)
        );
    }

    public static Login atSwagLabs(){
        return Tasks.instrumented(Login.class);
    }
}


