package fw.mobile;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileBrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class DriverSetup {

    protected AndroidDriver driver;

    protected void prepareAndroidNative() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("deviceName", "emulator-5554");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("browserName", MobileBrowserType.CHROME);

        File appDir = new File("C:\\Users\\Arkadii_Allakhverdii\\IdeaProjects" +
                "\\mobile-autotests\\src\\main\\resources\\");
        File app = new File(appDir, "Mobi-Calculator.apk");

        capabilities.setCapability("apk", app.getAbsolutePath());

        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
    }
}
