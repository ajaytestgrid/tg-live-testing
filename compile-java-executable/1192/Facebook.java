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
import static io.testgrid.enums.KeyboardKeys.*;
import org.openqa.selenium.support.ui.Select;
import java.net.*;
import java.util.*;
import java.io.*;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.RemoteWebDriver;

@Listeners(TestListener.class)
public class Facebook {

    public static String var_TGString = "Testgrid";

    public static int var_TGint = 0;

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void login() {
        tg.openBrowser();
        tg.wait("ele_email1", ComparisonType.IS_VISIBLE, 1);
        tg.type("ele_email1", "#TGITVAR.Email");
        tg.wait("ele_pass1", ComparisonType.IS_VISIBLE, 1);
        tg.type("ele_pass1", "#TGITVAR.Password");
        tg.testFunction("TgLogin");
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void logintgit01() {
        tg.openBrowser();
        tg.wait("ele_email1", ComparisonType.IS_VISIBLE, 1);
        tg.type("ele_email1", "test@gmail.com");
        tg.wait("ele_pass1", ComparisonType.IS_VISIBLE, 1);
        tg.type("ele_pass1", "Test@123");
        tg.testFunction("TgLogin");
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void logintgit02() {
        tg.openBrowser();
        tg.wait("ele_email1", ComparisonType.IS_VISIBLE, 1);
        tg.type("ele_email1", "dev@gmail.com");
        tg.wait("ele_pass1", ComparisonType.IS_VISIBLE, 1);
        tg.type("ele_pass1", "Dev@123");
        tg.testFunction("TgLogin");
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void logintgit03() {
        tg.openBrowser();
        tg.wait("ele_email1", ComparisonType.IS_VISIBLE, 1);
        tg.type("ele_email1", "q1@gmail.com");
        tg.wait("ele_pass1", ComparisonType.IS_VISIBLE, 1);
        tg.type("ele_pass1", "q1@123");
        tg.testFunction("TgLogin");
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void logintgit04() {
        tg.openBrowser();
        tg.wait("ele_email1", ComparisonType.IS_VISIBLE, 1);
        tg.type("ele_email1", "a1@gmail.com");
        tg.wait("ele_pass1", ComparisonType.IS_VISIBLE, 1);
        tg.type("ele_pass1", "a1@123");
        tg.testFunction("TgLogin");
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void logintgit05() {
        tg.openBrowser();
        tg.wait("ele_email1", ComparisonType.IS_VISIBLE, 1);
        tg.type("ele_email1", "t1@gmail.com");
        tg.wait("ele_pass1", ComparisonType.IS_VISIBLE, 1);
        tg.type("ele_pass1", "t1@123");
        tg.testFunction("TgLogin");
        tg.close();
    }

    public static void tglogin() {
        tg.wait("ele_email1", ComparisonType.IS_VISIBLE, 1);
    }
}
