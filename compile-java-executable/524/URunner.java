import io.testgrid.listeners.TestListener;
import io.testgrid.listeners.RetryFailedTestCases;
import io.testgrid.tg;
import org.testng.annotations.*;
import app.getxray.xray.testng.annotations.XrayTest;
import io.testgrid.enums.ComparisonType;
import org.json.JSONObject;
import io.testgrid.enums.Direction;
import io.testgrid.enums.Size;
import io.testgrid.enums.Buttons;
import static io.testgrid.baseClass.driver;
import org.openqa.selenium.*;
import io.testgrid.enums.Alert;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;

@Listeners(TestListener.class)
public class URunner {

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void tdpurunner() {
        tg.openDevice();
        tg.wait("ele_tileviewiconImageView1766430405322", ComparisonType.IS_VISIBLE);
        tg.click("ele_tileviewiconImageView1766430405322", 1);
        tg.wait("ele_FrameLayout1766430410503", ComparisonType.IS_VISIBLE);
        tg.click("ele_FrameLayout1766430410503", 1);
        tg.wait("ele_EditText1766430431133", ComparisonType.IS_VISIBLE);
        tg.click("ele_EditText1766430431133", 1);
        tg.wait("ele_EditText1766430431133", ComparisonType.IS_VISIBLE);
        tg.type("ele_EditText1766430431133", "123456789", true);
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void testcopy() {
        tg.openDevice();
        tg.wait("ele_tileviewiconImageView1766430405322", ComparisonType.IS_VISIBLE);
        tg.click("ele_tileviewiconImageView1766430405322", 1);
        tg.wait("ele_FrameLayout1766430410503", ComparisonType.IS_VISIBLE);
        tg.click("ele_FrameLayout1766430410503", 1);
        tg.wait("ele_EditText1766430431133", ComparisonType.IS_VISIBLE);
        tg.click("ele_EditText1766430431133", 1);
        tg.wait("ele_EditText1766430431133", ComparisonType.IS_VISIBLE);
        tg.type("ele_EditText1766430431133", "123456789", true);
        tg.close();
    }
}
