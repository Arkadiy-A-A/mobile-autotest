package fw.mobile;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class MobileDriverManager {

    private static AndroidDriver driver;
    private static DesiredCapabilities capabilities;
    public static WebDriverWait wait;

    /**
     * Конструктор по умолчанию
     */
    private MobileDriverManager() {

    }

    /**
     * Возвращаем проинициализированный драйвер
     * @return AndroidDriver
     */
    public static AndroidDriver getDriver() {
        return driver != null ? driver : prepareAndroidDriver();
    }


    /**
     * Обновление активити приложения
     */
    public static void appFocusUpdate(String textTitle) {
        try {
            getDriver().pressKey(new KeyEvent(AndroidKey.APP_SWITCH));
            Thread.sleep(15000);
            getDriver().findElement(By.xpath("//android.widget.TextView[@text='" + textTitle + "']")).click();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * Обновление активити приложения
     */
    public static void allAppClose() {
        try {
            getDriver().pressKey(new KeyEvent(AndroidKey.APP_SWITCH));
            Thread.sleep(10000);
            getDriver().findElement(By.xpath("android.widget.TextView[@text='ОЧИСТИТЬ ВСЁ']")).click();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * Нажатие на кнопку устройства
     *
     */
    public static void clickAndroidButtom(AndroidKey key) {
        try {
            getDriver().pressKey(new KeyEvent(key));
        } catch (Exception e) {
            System.out.println("Ошибка в методе 'clickAndroidButtom'. " + e);
        }
    }


    /**
     * Инициализаци андроид драйвера, установка нужных парметров
     * return AndroidDriver
     * @throws MalformedURLException
     */
    private static AndroidDriver prepareAndroidDriver() {
        try {
            DesiredCapabilities capabilities = new DesiredCapabilities();
            // Максимальная продолжительность одного теста в минутах
            capabilities.setCapability("maxDuration", 60);
            // Не перезагружать состояние
            capabilities.setCapability(MobileCapabilityType.NO_RESET, "true");
            // Показывать тайминг запросов
            capabilities.setCapability(MobileCapabilityType.EVENT_TIMINGS, true);
            // Позволяет делать скрин
            capabilities.setCapability(MobileCapabilityType.TAKES_SCREENSHOT, "true");
            // Простой после которой происходит разрыв сессии
            capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "300");

            // Обязательные настройки
            // Устройство с портом
            capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator:5554");
            // Тестируемая платформа
            capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
            // Пакет запуска
            capabilities.setCapability("appPackage", "io.crash.air");
            // Путь до самой apk бета
            File app = new File(".\\src\\main\\resources\\Beta by Crashlytics.apk");

            capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());

            driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
            wait = new WebDriverWait(driver, 5);

        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return driver;
    }




}
