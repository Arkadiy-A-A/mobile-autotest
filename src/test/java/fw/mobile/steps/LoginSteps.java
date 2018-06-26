package fw.mobile.steps;

import cucumber.api.PendingException;
import cucumber.api.java.ru.Дано;
import cucumber.api.java.ru.Когда;
import cucumber.api.java.ru.То;
import cucumber.api.java.ru.Тогда;
import fw.mobile.DriverSetup;

public class LoginSteps extends DriverSetup {

    @Дано("^Настроеное и запущеное приложение$")
    public void настроеноеИЗапущеноеПриложение() throws Throwable {
        driver.
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
