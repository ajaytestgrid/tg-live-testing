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
public class amazon {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void amazon() {
		tg.openBrowser();
		tg.wait("ele_RevampyourhomeinstyleCushioncoversbedsheet", ComparisonType.IS_VISIBLE);
		tg.click("ele_searchamaz439", 1);
		tg.type("ele_searchamaz439", "tshat");
		tg.click("ele_tshirtmen279", 1);
		tg.click("ele_xl522", 1);
		tg.click("ele_p36rangesl496", 1);
		tg.click("ele_go221", 1);
		tg.click("ele_httpsmmedi578", 1);
		tg.click("ele_httpsmmedi288", 1);
		tg.close();
	}
}