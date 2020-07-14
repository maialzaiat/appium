package org.example;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class calculatorTest {
    static AppiumDriver <MobileElement> driver;
    public static void main (String[] args)
    {
        try {
            openCalculator();
        } catch (Exception e) {
            System.out.println( e.getCause());
            e.getMessage();
            e.printStackTrace();
        }
    }
    public static void openCalculator() throws Exception {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("deviceName","HUAWEI nova 3i");
        cap.setCapability("udid","2JN7N19212003357");
        cap.setCapability("platformName","Android");
        cap.setCapability("platformVersion","9");
        cap.setCapability("appPackage","com.android.calculator2");
        cap.setCapability("appActivity","com.android.calculator2.Calculator");
        cap.setCapability("appActivity","com.android.calculator2.CalculatorSecurity");
        URL url= new URL ("http://127.0.0.1:4723/wd/hub");
        driver = new AppiumDriver<MobileElement>(url,cap);
        System.out.println("Application started...");


    }

}

