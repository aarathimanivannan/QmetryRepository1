package qaf.example.tests;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;
import static com.qmetry.qaf.automation.step.CommonStep.click;
import static com.qmetry.qaf.automation.step.CommonStep.get;
import static com.qmetry.qaf.automation.step.CommonStep.sendKeys;

import java.util.Map;

import org.testng.annotations.Test;

import com.qmetry.qaf.automation.data.MetaData;
import com.qmetry.qaf.automation.testng.dataprovider.QAFDataProvider;
import com.qmetry.qaf.automation.ui.WebDriverTestCase;

import qaf.Logs.Log;



//@MetaData("{'Story': 'Mobile Application' 'module':'m1', 'storyId':'PRJ-111'}")
public class TC001_QLO_Register extends WebDriverTestCase{
	
	// WebDriverTestCase Driver = new WebDriverTestCase();

	//@MetaData("{'Name': 'Aarathi' 'testCaseId':'TEST-00	1}")   
	
	public TC001_QLO_Register() {
		DOMConfigurator.configure("Logger\\Log4j.xml");
	}
		
	@QAFDataProvider(dataFile = "resources/Testdata.xls")
	@Test
	 public void Register(Map <String, String> data) throws Exception {
	
	
		//getting the url
		get("/");
		getDriver().manage().window().maximize();
		Thread.sleep(3000);
		click("SignIn");
		Thread.sleep(2000);
		sendKeys(data.get("Email"), "emailaddress");
		Thread.sleep(2000);
		click("createaccount");
		Thread.sleep(2000);
		sendKeys(data.get("Firstname"), "Firstname");
		Thread.sleep(2000);
		sendKeys(data.get("Lastname"), "Lastname");
		Thread.sleep(2000);
	    sendKeys(data.get("Password"), "CreatePassword");
	    Thread.sleep(2000);
	    sendKeys(String.valueOf(data.get("day")), "Day");
	    sendKeys(data.get("month"), "Month");
	    sendKeys(String.valueOf(data.get("year")), "Year");
	    Thread.sleep(2000);

	   click("//*[@id=\"submitAccount\"]/span/i");
	   
	   Log.info("AccountCreatedSuccessfully");
	    //Thread.sleep(2000);
	    //click("button.submit");
		
		
	}
	
}
