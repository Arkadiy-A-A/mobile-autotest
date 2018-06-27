package fw.mobile.steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import fw.mobile.MobileDriverManager;

import java.net.MalformedURLException;

public class Hooks {

    @Before
    public void prepareData() {
        try {
            MobileDriverManager.prepareAndroidNative();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    @After
    public void clearData() {
        MobileDriverManager.getDriver().quit();
    }
}
