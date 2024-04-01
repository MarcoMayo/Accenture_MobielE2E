package tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import utils.Scroll;

import static userinterface.ProductPage.BTN_ADD_CART;


public class AddProduct implements Task{

    private String nameProduct;

    public AddProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Scroll.down(BTN_ADD_CART(nameProduct)));
        actor.attemptsTo(Click.on(BTN_ADD_CART(nameProduct)));
    }

    public static AddProduct toTheCart(String nameProduct){
        return Tasks.instrumented(AddProduct.class, nameProduct);
    }
}
