package fw.mobile.pages;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InstallAndSettingAppPage extends BasePage {

    /** Заголовок сообщения в приложение Бета*/
    @FindBy(id = "io.crash.air:id/title")
    @Getter WebElement titleMessageInBeta;

    /** Текст сообщения в приложение Бета */
    @FindBy(id = "io.crash.air:id/content")
    @Getter WebElement messegeContentInBeta;

    /** Кнопка соглашения в приложение Бета 'ОK' */
    @FindBy(id = "io.crash.air:id/buttonDefaultPositive")
    @Getter WebElement btnOkInMessageBeta;

    /** Кнопка на диалоге с предупреждением о том что программа из внешнего источника */
    @FindBy(xpath = "//android.widget.Button[@text='ВНЕШНИЕ ИСТОЧНИКИ']")
    @Getter WebElement btnExternalSourceInPackageInstall;

    /** Переключатель разрешающий установку app Бету*/
    @FindBy(id = "android:id/switch_widget")
    @Getter WebElement switchAllowedInSettings;

    /** Кнопка 'УСТАНОВИТЬ' в установщике пакетов */
    @FindBy(id = "com.android.packageinstaller:id/ok_button")
    @Getter WebElement btnInstallInPackageInstall;

    /** Кнопка 'ОТКРЫТЬ' - в установщике пакетов, которая появляется после установка */
    @FindBy(id = "com.android.packageinstaller:id/launch_button")
    @Getter WebElement btnLaunchInPackageInstall;

    /** Кнопка 'NEXT' - в app Бета, которая появляется после открытия установленной Беты */
    @FindBy(id = "io.crash.air:id/details_rsvp_button")
    @Getter WebElement btnNextInBeta;

    /** Кнопка 'DOWNLOAD' - в app Бета, которая устанавливает приложение Альфа Банка*/
    @FindBy(id = "io.crash.air:id/app_action_button")
    @Getter WebElement btnDownloadInBeta;









//    /** Кнопка настроить */
//    @FindBy(id = "com.android.systemui:id/settings_button")
//    @Getter WebElement settingsButton;
//
//    /** Кнопка поиска настроек */
//    @FindBy(xpath = "//android.view.ViewGroup[@index='0']/android.widget.LinearLayout[@index='1']/android.widget.TextView")
//    @Getter WebElement searchSettingsButton;
//
//    /** Поле поиска настроек */
//    @FindBy(id = "android:id/search_src_text")
//    @Getter WebElement searchSettingField;
//
//    /** Название приложения в настройках разрешения установки внешних приложений */
//    @FindBy(id = "com.android.settings:id/app_detail_title")
//    @Getter WebElement nameAppInSettings;










}
