package qaf.example.tests;

import static com.qmetry.qaf.automation.step.CommonStep.click;
import static com.qmetry.qaf.automation.step.CommonStep.get;
import static com.qmetry.qaf.automation.step.CommonStep.sendKeys;
import static com.qmetry.qaf.automation.step.CommonStep.clear;
import java.util.Map;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.qmetry.qaf.automation.testng.dataprovider.QAFDataProvider;
import com.qmetry.qaf.automation.ui.WebDriverTestCase;
import com.qmetry.qaf.automation.util.Reporter;

import qaf.Logs.Log;

public class TC004_QLO_OrderCancel extends WebDriverTestCase  {
	
	public TC004_QLO_OrderCancel() {
		DOMConfigurator.configure("Logger\\Log4j.xml");
	}
	@QAFDataProvider(dataFile = "resources/Testdata.xls")
	@Test(priority=0)
	 public void Ordercancel(Map <String, String> data) throws Exception {
		
		//getting the url
				get("/");
				getDriver().manage().window().maximize();
				click("SignIn");
				Thread.sleep(2000);
				clear("InputEmailID");
				 sendKeys(data.get("LoginEmail"), "InputEmailID");
				Thread.sleep(2000);
				clear("InputPassword");
				sendKeys(data.get("Password"), "InputPassword");
				Thread.sleep(2000);
				click("Login");
				Thread.sleep(2000);
				click("Orderhistory");
				Thread.sleep(2000);
				//click("Itemlist");
				Thread.sleep(2000);
				click("Details");
				Thread.sleep(3000);
				Reporter.logWithScreenShot("Cancelorder");
				Thread.sleep(4000);
				click("Cancelorder");
				Thread.sleep(2000);
				click("Room1cancel");
				Thread.sleep(2000);
				click("CancelSubmit");
				Thread.sleep(3000);
				sendKeys(data.get("Popup"), "Popup");
				Thread.sleep(3000);
				click("Enter");
		
			Thread.sleep(2000);
			Log.info("Order Cancelled");

		}
}