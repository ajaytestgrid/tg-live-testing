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
import static io.testgrid.enums.KeyboardKeys.*;
import org.openqa.selenium.support.ui.Select;
import java.net.*;
import java.util.*;
import java.io.*;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.RemoteWebDriver;

@Listeners(TestListener.class)
public class DemoTest {

    public static String var_TGString = "Testgrid";

    public static int var_TGint = 0;

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void shopsy() {
        tg.openBrowser();
        tg.wait("ele_httpwwww3o191", ComparisonType.IS_VISIBLE, 1);
        tg.click("ele_httpwwww3o191", 1);
        tg.wait("ele_imageplace254", ComparisonType.IS_VISIBLE, 1);
        tg.click("ele_imageplace254", 1);
        tg.wait("ele_imageplace420", ComparisonType.IS_VISIBLE, 1);
        tg.click("ele_imageplace420", 1);
        tg.wait("ele_imageplace550", ComparisonType.IS_VISIBLE, 1);
        tg.click("ele_imageplace550", 1);
        tg.wait("ele_imageplace586", ComparisonType.IS_VISIBLE, 1);
        tg.click("ele_imageplace586", 1);
        tg.wait("ele_m864", ComparisonType.IS_VISIBLE, 1);
        tg.click("ele_m864", 1);
        tg.wait("ele_l591", ComparisonType.IS_VISIBLE, 1);
        tg.click("ele_l591", 1);
        tg.wait("ele_readmore572", ComparisonType.IS_VISIBLE, 1);
        tg.click("ele_readmore572", 1);
        tg.wait("ele_addtocart634", ComparisonType.IS_VISIBLE, 1);
        tg.click("ele_addtocart634", 1);
        tg.wait("ele_qty697", ComparisonType.IS_VISIBLE, 1);
        tg.click("ele_qty697", 1);
        tg.wait("ele_div044", ComparisonType.IS_VISIBLE, 1);
        tg.click("ele_div044", 1);
        tg.wait("ele_placeorder800", ComparisonType.IS_VISIBLE, 1);
        tg.click("ele_placeorder800", 1);
        tg.switchToFrame("ele_iframe035");
        tg.wait("ele_welcomeent947", ComparisonType.IS_VISIBLE, 1);
        tg.switchToDefaultContent();
        tg.click("ele_welcomeent947", 1);
        tg.wait("ele_logingetac117", ComparisonType.IS_VISIBLE, 1);
        tg.click("ele_logingetac117", 1);
        tg.wait("ele_qty358", ComparisonType.IS_VISIBLE, 1);
        tg.click("ele_qty358", 1);
        tg.wait("ele_div929", ComparisonType.IS_VISIBLE, 1);
        tg.click("ele_div929", 1);
        tg.close();
    }
}
