import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.ios.IOSTouchAction;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.TapOptions;
import org.testng.Assert;

import java.net.MalformedURLException;
import java.time.Duration;

import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;

public class c4LongTap extends BaseIOSTest {
    public static void main(String[] args) throws MalformedURLException {
        IOSDriver driver=DesiredCapabilities();
        MobileElement element=(MobileElement) driver.findElementByName("Long tap");
        IOSTouchAction action=new IOSTouchAction(driver);
        action.longPress(longPressOptions().withElement(element(element))
                .withDuration(Duration.ofSeconds(2))).release().perform();
        MobileElement tap=(MobileElement) driver.findElementByXPath("//XCUIElementTypeSwitch[1]");
        action.tap(tapOptions().withElement(element(tap))).perform();//tappp


    }
}
