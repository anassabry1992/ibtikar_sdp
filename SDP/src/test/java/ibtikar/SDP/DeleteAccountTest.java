package ibtikar.SDP;

import org.testng.annotations.Test;

public class DeleteAccountTest extends TestBase2{
	
	protected String corpTxt = "";
	protected String roleTxt = "";
	protected String permissionTxt = "";
	
	@Test(priority = 1)
	public void testDeleteRole() {
		new TestBase2().baseStep();
		DeleteAccountPage delAccount = new DeleteAccountPage(driver);
		delAccount.delAccountMethod();
	}
}