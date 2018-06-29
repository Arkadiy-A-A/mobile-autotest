package fw.mobile.hooks;

import cucumber.api.java.After;
import cucumber.api.java.Before;


import static fw.mobile.MobileDriverManager.getDriver;

/**
 * Класс нужен для того чтобы прописать все Бефоры и Афтеры которые будут запускаться до и после запуска тестов
 */
public class Hooks {

    @Before
    public void prepareData() {
        try {
            getDriver();
        } catch (Exception e) {
            System.out.println("Произошла ошибка в методе 'prepareData' - Before: " + e);
        }

    }

    @After(value = "~@InstalAndSettingsApp")
    public void clearData() {
        try {
            getDriver().closeApp();
        } catch (Exception e) {
            System.out.println("Произошла ошибка в методе 'clearData' - After: " + e);
        }
    }
}
