package stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import tasks.AddProduct;
import tasks.Checkout;
import tasks.Login;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static userinterface.CheckoutCompletadoPage.LBL_CHECKOUT_COMPLETE;
import static userinterface.ProductPage.PRODUCTS_DISPLAYED;

import net.serenitybdd.screenplay.ensure.Ensure;


public class BuyingProductsStepDefinition {

    @Before
    public void prepareStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("that {word} signed-in SwagLabs app")
    public void actorWantsBuyShirts(String actor) {
        theActorCalled(actor).attemptsTo(Login.atSwagLabs());
    }

    @When("He puts in the cart the {string}")
    public void actorPutShirtCart(String nameProduct) {
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
}