package fw.mobile.dialogs;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CalendarDialog {
    @FindBy(xpath = "//android.widget.FrameLayout[@index='0']/android.widget.RelativeLayout[@index='0']/android.widget.RelativeLayout[@index='1']/android.widget.TextView[@index='1']")
    @Getter private WebElement selectFromeDate;

    @FindBy(id = "com.bifit.mobile:id/search_to_picker")
    @Getter private WebElement selectToDate;

    @FindBy(id = "android:id/prev")
    @Getter private WebElement previousDate;

    @FindBy(id = "android:id/next")
    @Getter private WebElement nextDate;

    @FindBy(className = "android.view.View")
    @Getter List<WebElement> daysMonth;

}
