package fw.mobile.pages;


import fw.mobile.MobileDriverManager;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    protected BasePage() {
        PageFactory.initElements(MobileDriverManager.getDriver(), this);
    }

}
