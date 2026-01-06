import io.testgrid.listeners.TestListener;
import io.testgrid.listeners.RetryFailedTestCases;
import io.testgrid.tg;
import org.testng.annotations.*;
import app.getxray.xray.testng.annotations.XrayTest;
import io.testgrid.enums.ComparisonType;
import org.json.JSONObject;
import org.testng.annotations.Test;

@Listeners(TestListener.class);
public class tg01 {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void tg01() {
		tg.openBrowser();
		tg.close();
	}
}