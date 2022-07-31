import io.appium.java_client.ios.IOSDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class c1AppiumClickTEst extends BaseIOSTest{
    public static void main(String[] args) throws MalformedURLException {
        IOSDriver driver=DesiredCapabilities();
        driver.findElementByAccessibilityId("Alert Views").click();
        driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"Text Entry\"]").click();
        driver.findElementByXPath("//XCUIElementTypeCell").sendKeys("Hello");
        driver.findElementByAccessibilityId("OK").click();
        driver.findElementByAccessibilityId("Confirm / Cancel").click();
        System.out.println(driver.findElementByXPath("//*[contains(@name,'A message should')]").getText());
        driver.findElementByAccessibilityId("Confirm").click();
    }
    @Test
    public void tc(){}
}
