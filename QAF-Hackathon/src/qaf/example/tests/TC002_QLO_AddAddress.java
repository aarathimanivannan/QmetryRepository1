package qaf.example.tests;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;
import static com.qmetry.qaf.automation.step.CommonStep.click;
import static com.qmetry.qaf.automation.step.CommonStep.get;
import static com.qmetry.qaf.automation.step.CommonStep.sendKeys;
import static com.qmetry.qaf.automation.step.CommonStep.clear;

import java.util.Map;

import org.testng.annotations.Test;

import com.qmetry.qaf.automation.testng.dataprovider.QAFDataProvider;
import com.qmetry.qaf.automation.ui.WebDriverTestCase;

import qaf.Logs.Log;

public class TC002_QLO_AddAddress extends WebDriverTestCase {
	
	// WebDriverTestCase Driver = new WebDriverTestCase();

	//@MetaData("{'Name': 'Aarathi' 'testCaseId':'TEST-00	1}")  
	public TC002_QLO_AddAddress() {
		DOMConfigurator.configure("Logger\\Log4j.xml");
	}
		
	@QAFDataProvider(dataFile = "resources/Testdata.xls")
	@Test
	 public void Address(Map <String, String> data) throws Exception {
		
		//getting the url
		get("/");
		getDriver().manage().window().maximize();
		Thread.sleep(3000);
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
		click("Addmyfirstadd");
		Thread.sleep(2000);
		sendKeys(data.get("Company"), "Company");
		Thread.sleep(2000);
		sendKeys(data.get("AddressLine1"), "AddressLine1");
		sendKeys(data.get("City"), "City");
		Thread.sleep(2000);
		sendKeys(data.get("State"), "State");
		Thread.sleep(2000);
		sendKeys(String.valueOf(data.get("ZIPcode")), "Zipcode");
		Thread.sleep(2000);
		sendKeys(String.valueOf(data.get("Home")), "Homenumber");
		Thread.sleep(2000);
		sendKeys(String.valueOf(data.get("Mobile")), "Mobilenumber");
		Thread.sleep(2000);
		sendKeys(data.get("AdditionalInfo"), "AdditionalInfo");
		Thread.sleep(2000);
		sendKeys(data.get("AssignTitle"), "AssignTitle");
		Thread.sleep(2000);
		click("Save");
		Thread.sleep(3000);
		click("AddressUserInfo");
		Thread.sleep(2000);
		click("AddressLogout");
		Thread.sleep(2000);
		
		Log.info("AddressAddedSuccessfully");
		}
	}
