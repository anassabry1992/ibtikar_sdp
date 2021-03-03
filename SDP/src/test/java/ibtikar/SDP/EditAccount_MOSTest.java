package ibtikar.SDP;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;

public class EditAccount_MOSTest extends TestBase2{
	
	protected String role = "";
	
	@Test(priority = 1)
	public void testEditAccount() {
		new TestBase2().baseStep();
		EditAccount_MOSPage editAccount_MOS = new EditAccount_MOSPage(driver);
		editAccount_MOS.editAccount_MOSMethod();
		assertEquals(editAccount_MOS.roleInTable(), role);
	}
}