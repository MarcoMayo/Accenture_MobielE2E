package userinterface;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;

public class ProductPage {
    public static final Target PRODUCTS_DISPLAYED= Target.the("Products displayed").located(AppiumBy.accessibilityId("test-PRODUCTS"));
    public static final Target BTN_OPEN_SHOP_CART= Target.the("Button Cart").located(AppiumBy.accessibilityId("test-Cart"));
    public static Target BTN_ADD_CART(String nameProduct) {
        return Target.the("Product cart")
                .locatedForAndroid(AppiumBy.xpath(String.format("//*[@text='%s']/following-sibling::*[@content-desc='test-ADD TO CART']", nameProduct)))
                .locatedForIOS(AppiumBy.xpath("(//XCUIElementTypeOther[@name='test-ADD TO CART'])[1]"));
    }
}
