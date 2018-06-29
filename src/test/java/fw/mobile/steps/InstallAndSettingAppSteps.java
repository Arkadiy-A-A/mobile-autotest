package fw.mobile.steps;

import cucumber.api.java.ru.Если;
import cucumber.api.java.ru.И;
import cucumber.api.java.ru.То;
import cucumber.api.java.ru.Тогда;
import fw.mobile.pages.InstallAndSettingAppPage;
import io.appium.java_client.android.nativekey.AndroidKey;
import org.junit.Assert;

import static fw.mobile.MobileDriverManager.*;

public class InstallAndSettingAppSteps {

    InstallAndSettingAppPage page = new InstallAndSettingAppPage();

    @Если("^приложения Beta запущено$")
    public void приложенияBetaЗапущено() throws Throwable{
        Thread.sleep(5000);
        boolean flag1 = "Install Update".equals(page.getTitleMessageInBeta().getText());
        boolean flag2 = "A new version of Beta by Crashlytics is available. Tap OK to download and install it."
                .equals(page.getMessegeContentInBeta().getText());

        Assert.assertTrue("Ошибка несоответсвует ожидаемой.\n" +
                "Фактическая ошибка: " + page.getMessegeContentInBeta().getText() + "\n", flag1 && flag2);
        page.getBtnOkInMessageBeta().click();
        Thread.sleep(15000);
        page.getBtnExternalSourceInPackageInstall().click();
        Thread.sleep(5000);
        page.getSwitchAllowedInSettings().click();
        clickAndroidButtom(AndroidKey.BACK);
        Thread.sleep(5000);
        page.getBtnInstallInPackageInstall().click();
        Thread.sleep(30000);
        page.getBtnLaunchInPackageInstall().click();
        Thread.sleep(5000);
        page.getBtnNextInBeta().click();
        Thread.sleep(10000);
        page.getBtnDownloadInBeta().click();
        Thread.sleep(215000);
        page.getBtnInstallInPackageInstall().click();
        Thread.sleep(60000);
        page.getBtnLaunchInPackageInstall().click();
        Thread.sleep(5000);
    }

    @То("^Установить приложение Альфа-Банк$")
    public void установитьПриложениеАльфаБанк() throws Throwable {
//        System.out.println("Начало установки приложения.");
//        System.out.println("Кликаем по кнопки ок, чтобы закрыть сообщение и продолжить");
//        page.getButtonOkBeta().click();
//        allAppClose();
//
//        System.out.println("Кликаем по кнопки 'ВНЕШНИЕ ИСТОЧНИКИ', чтобы настроить разрешение на устонавку");
//        Thread.sleep(5000);
//        page.getButtonExternalSource().click();
//        Thread.sleep(5000);
//        appFocusUpdate("Установщик пакетов");
//        Assert.assertTrue("Ошибка несоответсвует ожидаемой.\n" +
//                        "Фактическая название: '" + page.getMessegeContent().getText() + "'\n", "Beta".equals(page.getNameAppInSettings().getText()));
//        page.getSwitchAllowed().isSelected();
//
//        appFocusUpdate("Установщик пакетов");

    }

    @И("^Проверить установку приложения Альфа-Банк Казахстан$")
    public void проверитьУстановкуПриложенияАльфаБанкКазахстан() throws Throwable {

    }

    @Тогда("^Закрыть все приложения$")
    public void закрытьВсеПриложения() throws Throwable {

    }

    @И("^открыть приложение Альфа-Банка Казахстан$")
    public void открытьПриложениеАльфаБанкаКазахстан() throws Throwable {

    }
}
