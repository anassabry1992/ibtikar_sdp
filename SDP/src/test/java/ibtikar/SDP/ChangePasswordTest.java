package ibtikar.SDP;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;

public class ChangePasswordTest extends TestBase2{
	
	private String crntPass = "";
	private String newPass = "";
	private String cnfrmPass = "";
	private String expectMsg = "";
	
	@Test(priority = 1)
	public void testLogout() {
		new TestBase2().baseStep();
		ChangePasswordPage changePasswordpage = new ChangePasswordPage(driver);
		changePasswordpage.changePasswordMethod(crntPass, newPass, cnfrmPass);
		assertEquals(changePasswordpage.getMessage(), expectMsg);
	}
}