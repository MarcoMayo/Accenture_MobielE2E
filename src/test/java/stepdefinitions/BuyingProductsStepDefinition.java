package stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import tasks.AddProduct;
import tasks.Checkout;
import tasks.Login;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static userinterface.CheckoutCompletadoPage.LBL_CHECKOUT_COMPLETE;
import static userinterface.ProductPage.BTN_OPEN_SHOP_CART;
import static userinterface.ProductPage.PRODUCTS_DISPLAYED;
import static userinterface.CheckoutPage.PRODUCT_NAME;
import static userinterface.CheckoutPage.BTN_REMOVE;
import static userinterface.LoginPage.MESSAGE_ERROR;

import net.serenitybdd.screenplay.ensure.Ensure;

public class BuyingProductsStepDefinition {

    @Before
    public void prepareStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("that {word} signed-in SwagLabs app")
    public void thatJuanSignedInSwagLabsapp(String actor) {
        theActorCalled(actor).attemptsTo(Login.atSwagLabs("standard_user", "secret_sauce"));
    }

    @When("He puts in the cart the {string}")
    public void hePutsInTheCartThe(String nameProduct) {
        theActorInTheSpotlight().attemptsTo(AddProduct.toTheCart(nameProduct));
    }

    @And("He does the checkout of his purchase")
    public void checkoutPurchase() {
        theActorInTheSpotlight().attemptsTo(Checkout.shoppingCart());
    }

    @Then("He should see the message {string}")
    public void actorShouldSeeCheckout(String confirmationMessage) {
        theActorInTheSpotlight().attemptsTo(Ensure.that(LBL_CHECKOUT_COMPLETE).isDisplayed());
    }

    @Then("he can see the available products")
    public void heCanSeeTheAvailableProducts() {
        theActorInTheSpotlight().attemptsTo(Ensure.that(PRODUCTS_DISPLAYED).isDisplayed());
    }

    @When("that {word} try signed-in with error data")
    public void thatJuanTrySignedInWithErrorData(String actor) {
        theActorCalled(actor).attemptsTo(Login.atSwagLabs("standard_user", "secretsauce"));
    }

    @Then("he can see the message error")
    public void heCanSeeTheMessageError() {
        theActorInTheSpotlight().attemptsTo(Ensure.that(MESSAGE_ERROR).text().contains("Username and password do not match any user in this service."));
    }

    @Then("He should see the product in his shopping cart")
    public void heShouldSeeTheProductInHisShoppingCart() {
        theActorInTheSpotlight().attemptsTo(Click.on(
                BTN_OPEN_SHOP_CART),
                Ensure.that(PRODUCT_NAME).isDisplayed());
    }

    @When("He removes the {string} from his shopping cart")
    public void heRemovesTheFromHisShoppingCart(String arg0) {
        theActorInTheSpotlight().attemptsTo(
                Click.on(BTN_OPEN_SHOP_CART),
                Click.on(BTN_REMOVE));
    }

    @Then("His shopping cart should be empty")
    public void hisShoppingCartShouldBeEmpty() {
        theActorInTheSpotlight().attemptsTo(Ensure.that(BTN_REMOVE).isNotDisplayed());
    }

}