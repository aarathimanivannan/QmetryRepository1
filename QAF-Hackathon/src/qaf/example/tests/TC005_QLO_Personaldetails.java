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

public class TC005_QLO_Personaldetails extends WebDriverTestCase  {

	public TC005_QLO_Personaldetails() {
		DOMConfigurator.configure("Logger\\Log4j.xml");
	}
	@QAFDataProvider(dataFile = "resources/Testdata.xls")
	@Test(priority=0)
	 public void Personal(Map <String, String> data) throws Exception {
		
		//getting the url
				get("/");
				getDriver().manage().window().maximize();
				click("SignIn");
				Thread.sleep(2000);
				clear("InputEmailID");
				 sendKeys(data.get("LoginEmail"), "InputEmailID");
				
				clear("InputPassword");
				sendKeys(data.get("Password"), "InputPassword");
				Thread.sleep(2000);
				click("Login");
				Thread.sleep(2000);
				click("Personaldetails");
				Thread.sleep(2000);
				clear("Fname");
				sendKeys(data.get("Fname"), "Fname");
				Thread.sleep(2000);
				sendKeys(String.valueOf(data.get("Dateborn")), "Dateborn");
				Thread.sleep(2000);
				sendKeys(data.get("Monthborn"), "Monthborn");
				Thread.sleep(2000);
				sendKeys(data.get("Password"), "CurrentPassword");
				Thread.sleep(2000);
				click("ModifySave");
				Thread.sleep(2000);
				click("Modifyuserinfo");
				Thread.sleep(2000);
				click("Modifylogout");
				Thread.sleep(2000);
				
				Log.info("Personal details updated successfully");
				}
}
