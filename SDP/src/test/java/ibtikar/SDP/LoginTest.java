package ibtikar.SDP;

import static org.testng.Assert.assertEquals;
import java.io.IOException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import TestData.ExcelSheetReader;

public class LoginTest extends TestBase{
	
	private int indexData = 0;
	private String url = "https://sports-portal.ibtik.net/";
	private String expectMsg = "هذا الحقل مطلوب";
//	private String homeUrl = "";
	
	@DataProvider(name="Data")
	public Object[][] getTestData() throws IOException{
		return new ExcelSheetReader().getExcelData(indexData);
	}
	
	@BeforeTest
	public void openBrowser() {
		openMyBrowser(url);
	}
	
	@Test(priority = 1)
	public void testEmptyLogin(){
		LoginPage loginpage = new LoginPage(driver);
		loginpage.emptyLoginMethod();
		assertEquals(loginpage.getMessage(), expectMsg);
	}
	
	@Test(dataProvider = "Data", priority = 2)
	public void testLogin(String username, String password){
		LoginPage loginpage = new LoginPage(driver);
		loginpage.loginMethod(username, password);
//		assertEquals(loginpage.getMessage(), expectMsg);
	}
}