package qaf.example.tests;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;
import static com.qmetry.qaf.automation.step.CommonStep.click;
import static com.qmetry.qaf.automation.step.CommonStep.get;
import static com.qmetry.qaf.automation.step.CommonStep.sendKeys;
import static com.qmetry.qaf.automation.step.CommonStep.clear;
import java.util.Map;

import com.qmetry.qaf.automation.testng.dataprovider.QAFDataProvider;
import com.qmetry.qaf.automation.ui.WebDriverTestCase;



public class TC003_QLO_BookingHotelRoom extends WebDriverTestCase {
		
		// WebDriverTestCase Driver = new WebDriverTestCase();

		//@MetaData("{'Name': 'Aarathi' 'testCaseId':'TEST-00	1}")   
	public TC003_QLO_BookingHotelRoom() {
		DOMConfigurator.configure("Logger\\Log4j.xml");
	}
		@QAFDataProvider(dataFile = "resources/Testdata.xls")
		@Test(priority=0)
		 public void Bookingroom(Map <String, String> data) throws Exception {
			
			get("/");
			getDriver().manage().window().maximize();
			Thread.sleep(3000);
			click("click.menu");
			click("click.roomsmenu");
			click("click.booknowroom");
			Thread.sleep(2000);
			click("click.checkindateroom1");
			Thread.sleep(2000);
			click("click.checkoutdateroom");
			Thread.sleep(2000);
			click("click.checkoutdateroom1");
			Thread.sleep(2000);
			click("click.booknw");
			Thread.sleep(2000);
			click("click.proceedtocheckout");
			Thread.sleep(2000);
			click("click.proceed");
			Thread.sleep(2000);
			click("click.loginnow");
			Thread.sleep(2000);
			sendKeys(data.get("Email"),"input.loginemail");
			Thread.sleep(3000);
			sendKeys(data.get("Password"),"input.loginpass");
			click("click.loginsignin");
			Thread.sleep(3000);
			click("click.loginproceed");
			Thread.sleep(3000);
			click("click.checkbox");
			Thread.sleep(3000);
			click("click.paybankwire");
			Thread.sleep(2000);
			click("click.confirmorder");
			
			
		}
}
