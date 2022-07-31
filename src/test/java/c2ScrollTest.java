import io.appium.java_client.ios.IOSDriver;

import java.net.MalformedURLException;
import java.util.HashMap;

public class c2ScrollTest extends BaseIOSTest{
    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        IOSDriver driver=DesiredCapabilities();
        //scroll swipe
        HashMap<String,Object>scrollObject=new HashMap<>();
        scrollObject.put("direction","down");
        scrollObject.put("name","Web View");
        driver.executeScript("mobile:scroll",scrollObject);
        driver.findElementByAccessibilityId("Web View").click();
        Thread.sleep(2000);
        driver.findElementByXPath("//XCUIElementTypeButton[@name=\"UIKitCatalog\"]").click();
        driver.findElementByAccessibilityId("Picker View").click();//pickers pick date turns
        driver.findElementByAccessibilityId("Red color component value").sendKeys("80");
        driver.findElementByAccessibilityId("Green color component value").sendKeys("220");
        driver.findElementByAccessibilityId("Blue color component value").sendKeys("105");
        System.out.println(driver.findElementByAccessibilityId("Blue color component value").getText());
    }
}
