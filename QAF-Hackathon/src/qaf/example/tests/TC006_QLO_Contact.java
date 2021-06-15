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

import qaf.Logs.Log;

public class TC006_QLO_Contact extends WebDriverTestCase  {
	
	public TC006_QLO_Contact() {
		DOMConfigurator.configure("Logger\\Log4j.xml");
	}
	
	@QAFDataProvider(dataFile = "resources/Testdata.xls")
	@Test(priority=0)
	 public void Contact(Map <String, String> data) throws Exception {
		
		//getting the url
				get("/");
				getDriver().manage().window().maximize();
				click("Menu");
				Thread.sleep(2000);
				click("Contact");
				Thread.sleep(2000);
				click("Subject");
				Thread.sleep(2000);
				click("Custservice");
				//sendKeys(data.get("Subject"), "Customerservice");
				Thread.sleep(2000);
				sendKeys(data.get("Email"), "ValidEmail");
				Thread.sleep(2000);
				sendKeys(data.get("Query"), "Query");
				Thread.sleep(2000);
				click("Sendmessage");
				Thread.sleep(2000);
				Log.info("Contact details updated successfully");
	}
}
