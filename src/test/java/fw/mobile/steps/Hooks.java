package fw.mobile.steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import fw.mobile.DriverSetup;

import java.net.MalformedURLException;

public class Hooks extends DriverSetup {

    @Before
    public void prepareData() {
        try {
            prepareAndroidNative();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    @After
    public void clearData() {

    }
}
