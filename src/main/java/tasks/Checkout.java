package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SendKeys;
import utils.Scroll;

import static userinterface.CheckoutPage.*;

import static userinterface.ProductPage.BTN_OPEN_SHOP_CART;

public class Checkout implements Task{


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_OPEN_SHOP_CART),
                Scroll.down(BTN_CHECKOUT),
                Click.on(BTN_CHECKOUT),
                Enter.theValue("Juan").into(TXT_NAME),
                Enter.theValue("Fernandez").into(TXT_LAST_NAME),
                SendKeys.of("050005").into(TXT_POST_CODE),
                Scroll.down(BTN_CONTINUE),
                Click.on(BTN_CONTINUE),
                Scroll.down(BTN_FINISH),
                Click.on(BTN_FINISH)
        );
    }
    public static Checkout shoppingCart(){
        return Tasks.instrumented(Checkout.class);
    }
}
