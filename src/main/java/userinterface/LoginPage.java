package userinterface;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {
    public static final Target TXT_USERNAME = Target.the("Username Input").located(AppiumBy.accessibilityId("test-Username"));
    public static final Target TXT_PASSWORD = Target.the("Password Input").located(AppiumBy.accessibilityId("test-Password"));
    public static final Target BTN_LOGIN = Target.the("Login Button").located(AppiumBy.accessibilityId("test-LOGIN"));
    public static final Target MESSAGE_ERROR = Target.the("Message error login")
            .locatedForAndroid(AppiumBy.xpath("//*[@content-desc='test-Error message']/*"))
            .locatedForIOS(AppiumBy.accessibilityId("Username and password do not match any user in this service."));
}
