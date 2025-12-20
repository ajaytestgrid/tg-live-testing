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
public class TestSuite1 {

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void login() {
        tg.openBrowser();
        tg.wait("ele_emailaddre921", ComparisonType.IS_VISIBLE, 1);
        tg.click("ele_emailaddre921", 1);
        tg.wait("ele_emailaddre921", ComparisonType.IS_VISIBLE, 2);
        tg.type("ele_emailaddre921", "test@gmail.com");
        tg.wait("ele_login553", ComparisonType.IS_VISIBLE, 3);
        tg.click("ele_login553", 1);
        tg.wait("ele_password181", ComparisonType.IS_VISIBLE);
        tg.click("ele_password181", 1);
        tg.wait("ele_password181", ComparisonType.IS_VISIBLE);
        tg.typeEncrypted("ele_password181", "COZRKJDzcWQ+sSXmPNXj3g==:MTIzNDU2Nzg5MTAxMTEyMQ==");
        tg.close();
    }
}
