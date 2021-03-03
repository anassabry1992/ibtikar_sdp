package ibtikar.SDP;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.BeforeTest;

public class ForgetPasswordTest extends TestBase{
	
	private String url = "";
	private String email_add = "";
	private String expectMsg = "";
	
	@BeforeTest
	public void openBrowser() {
		openMyBrowser(url);
	}
	
	public void testForgetPassword(String username, String password){
		ForgetPasswordPage forgetPasswordpage = new ForgetPasswordPage(driver);
		forgetPasswordpage.forgetPasswordMethod(email_add);
		assertEquals(forgetPasswordpage.getMessage(), expectMsg);
		assertEquals(driver.getCurrentUrl(), url);
//		System.out.println("Username: "+username);
//		System.out.println("Password: "+password);
	}
}