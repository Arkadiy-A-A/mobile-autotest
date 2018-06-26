package fw.mobile.steps;

import fw.mobile.DriverSetup;
import org.junit.After;
import org.junit.Before;

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
