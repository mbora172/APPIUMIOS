import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import org.testng.Assert;

import java.net.MalformedURLException;

public class c3SliderTest extends BaseIOSTest {
    public static void main(String[] args) throws MalformedURLException {
        IOSDriver driver=DesiredCapabilities();
        driver.findElementByAccessibilityId("Sliders").click();
        IOSElement slider=(IOSElement) driver.findElementByXPath("//XCUIElementTypeSlider");
        slider.setValue("0%");
        slider.setValue("1%"); //0 0.90 1
        Assert.assertEquals("100%",slider.getAttribute("value"));

    }
}
