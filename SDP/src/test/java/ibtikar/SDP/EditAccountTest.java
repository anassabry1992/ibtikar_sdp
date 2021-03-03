package ibtikar.SDP;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;

public class EditAccountTest extends TestBase2{
	
	protected String full_name = "";
	protected String mobile_no = "";
	protected String email_add = "";
	protected String corpType = "";
	protected String corp = "";
	protected String role = "";
	
	@Test(priority = 1)
	public void testEditAccount() {
		new TestBase2().baseStep();
		EditAccountPage editAccount = new EditAccountPage(driver);
		editAccount.editAccountMethod(full_name, mobile_no, email_add);
		assertEquals(editAccount.fullNameInTable(), full_name);
		assertEquals(editAccount.corpTypeInTable(), corpType);
		assertEquals(editAccount.corpInTable(), corp);
		assertEquals(editAccount.roleInTable(), role);
	}
}