import java.lang.*;
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
import org.testng.annotations.Test;

@Listeners(TestListener.class);
public class ts001 {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void ts001() {
		tg.openBrowser();
		tg.wait("ele_resources600", ComparisonType.IS_VISIBLE);
		tg_String var_ABC = "#TGITVAR.Password";
		var_ABC = (String) tg.testFunction("TF01", new Object[]{var_ABC, "ABC", "ABC", "ABC", "ABC", "ABC", "ABC", "ABC", "ABC", "ABC", "ABC", "ABC", "ABC", "ABC", "ABC", "ABC", "ABC", "ABC", "ABC", "ABC"});
		var_ABC = (String) tg.testFunction("TF02", new Object[]{"ABCD", var_ABC, var_ABC});
		tg.click("ele_plugins601", 1);
		tg.close();
	}
}