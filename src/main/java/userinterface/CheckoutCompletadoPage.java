package userinterface;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;

public class CheckoutCompletadoPage {
    public static final Target LBL_CHECKOUT_COMPLETE = Target.the("Title Checkout Complete").located(AppiumBy.accessibilityId("test-CHECKOUT: COMPLETE!"));
}