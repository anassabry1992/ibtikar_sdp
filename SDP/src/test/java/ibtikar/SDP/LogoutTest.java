package ibtikar.SDP;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;

public class LogoutTest extends TestBase2{
	
	private String expectUrl = "";
	
	@Test(priority = 1)
	public void testLogout() {
		new TestBase2().baseStep();
		LogoutPage logoutpage = new LogoutPage(driver);
		logoutpage.logoutMethod();
		assertEquals(driver.getCurrentUrl(), expectUrl);
	}
}