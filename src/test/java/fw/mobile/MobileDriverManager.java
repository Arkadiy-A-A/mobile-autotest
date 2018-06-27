package fw.mobile;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import lombok.Getter;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class MobileDriverManager {

    @Getter private static AndroidDriver driver;


    protected void prepareAndroidNative() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();

        // Максимальная продолжительность одного теста в минутах
        capabilities.setCapability("maxDuration", 30);
        // Не перезагружать состояние
        capabilities.setCapability(MobileCapabilityType.NO_RESET, "false");
        // Показывать тайминг запросов
        capabilities.setCapability(MobileCapabilityType.EVENT_TIMINGS, true);
        // Позволяет делать скрин
        capabilities.setCapability(MobileCapabilityType.TAKES_SCREENSHOT, "true");

        // Обязательные настройки
        // Устройство с портом
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator:5554");
        // Тестируемая платформа
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        // Пакет запуска
        capabilities.setCapability("appPackage", "my.android.calc");

        File appDir = new File("C:\\Users\\Arkadii_Allakhverdii\\IdeaProjects" +
                "\\mobile-autotests\\src\\main\\resources\\");
        File app = new File(appDir, "Mobi-Calculator.apk");

        capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());

        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
    }

}
