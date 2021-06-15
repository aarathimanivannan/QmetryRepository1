package qaf.example.tests;

import static com.qmetry.qaf.automation.step.CommonStep.click;
import static com.qmetry.qaf.automation.step.CommonStep.get;
import static com.qmetry.qaf.automation.step.CommonStep.sendKeys;
import static com.qmetry.qaf.automation.step.CommonStep.clear;
import java.util.Map;

import org.testng.annotations.Test;

import com.qmetry.qaf.automation.testng.dataprovider.QAFDataProvider;
import com.qmetry.qaf.automation.ui.WebDriverTestCase;
import com.qmetry.qaf.automation.util.Reporter;

import qaf.Logs.Log;

public class TC007_QLO_Removecart extends WebDriverTestCase  {
	@QAFDataProvider(dataFile = "resources/Testdata.xls")
	@Test(priority=0)
	 public void remove(Map <String, String> data) throws Exception {
		
		//getting the url
				get("/");
				getDriver().manage().window().maximize();
				Thread.sleep(2000);
				sendKeys(data.get("Location"),"Location");
				Thread.sleep(5000);
				click("Hotel");
				Thread.sleep(2000);
				click("HotelName");
				Thread.sleep(2000);
				click("Checkin");
				Thread.sleep(2000);
				click("DateselectIN");
				Thread.sleep(2000);
				//click("Checkout");
				click("DateselectOUT");
				Thread.sleep(2000);
				click("Searchnow");
				Thread.sleep(2000);
				click("ExBooknow");
				Thread.sleep(2000);
				click("Addtocart");
				Thread.sleep(2000);
				click("Cartbasket");
				Thread.sleep(2000);
				click("Removeproduct");
				Thread.sleep(3000);
				Reporter.logWithScreenShot("Removecart");
				Thread.sleep(5000);				
				Log.info("Product removed successfully");
				
				
	}
}