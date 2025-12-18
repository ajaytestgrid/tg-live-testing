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
public class Facebook {

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void login() {
        tg.openBrowser();
        tg.wait("ele_email1", ComparisonType.IS_VISIBLE, 1);
        tg.type("ele_email1", "test@gmail.com");
        tg.wait("ele_pass1", ComparisonType.IS_VISIBLE, 1);
        tg.type("ele_pass1", "123456789");
        tg.close();
    }
}
