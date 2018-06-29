package fw.mobile.steps;

import cucumber.api.java.ru.Дано;
import cucumber.api.java.ru.Когда;
import cucumber.api.java.ru.То;
import cucumber.api.java.ru.Тогда;
import fw.mobile.pages.LoginPage;

import static fw.mobile.MobileDriverManager.appFocusUpdate;
import static fw.mobile.MobileDriverManager.getDriver;

public class LoginSteps {

    LoginPage page = new LoginPage();

    @Дано("^Настроеное и запущеное приложение$")
    public void настроеноеИЗапущеноеПриложение() throws Throwable {
        getDriver().openNotifications();
        Thread.sleep(50000);
        page.getButtonAccept().click();
        appFocusUpdate("15151");
        page.getButtonAccept().click();
        appFocusUpdate("511");
        page.getButtonAccept().click();
        appFocusUpdate("1561");
        page.getButtonNine().click();
    }

    @Когда("^Когда пользователь вводит верный \"([^\"]*)\" и \"([^\"]*)\"$")
    public void когдаПользовательВводитВерныйИ(String arg1, String arg2) throws Throwable {

    }

    @Когда("^нажимает кнопкупку войти$")
    public void нажимаетКнопкупкуВойти() throws Throwable {

    }

    @То("^получаем смс подтверждение$")
    public void получаемСмсПодтверждение() throws Throwable {

    }

    @То("^вводим коректное смс подтверждение$")
    public void вводимКоректноеСмсПодтверждение() throws Throwable {

    }

    @Тогда("^проверяем вход в приложение$")
    public void проверяемВходВПриложение() throws Throwable {

    }

}
