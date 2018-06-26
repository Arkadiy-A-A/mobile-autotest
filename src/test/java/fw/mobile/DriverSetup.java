package fw.mobile;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class DriverSetup {

    protected AndroidDriver driver;

    protected void prepareAndroidNative() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("deviceName", "Nexus-5X-Oreo-8.0");
        capabilities.setCapability("platfomName", "Android");

        File appDir = new File("C:\\Users\\Arkadii_Allakhverdii\\IdeaProjects" +
                "\\mobile-autotests\\src\\main\\resources");
        File app = new File(appDir, "Mobi-Calculator.apk");

        capabilities.setCapability("apk", app.getAbsolutePath());

        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
    }
}
