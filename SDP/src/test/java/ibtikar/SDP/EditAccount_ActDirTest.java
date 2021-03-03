package ibtikar.SDP;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;

public class EditAccount_ActDirTest extends TestBase2{
	
	protected String corpType = "";
	protected String corp = "";
	protected String role = "";
	
	@Test(priority = 1)
	public void testEditAccount() {
		new TestBase2().baseStep();
		EditAccount_ActDirPage editAccount_ActDir = new EditAccount_ActDirPage(driver);
		editAccount_ActDir.editAccount_ActDirMethod();
		assertEquals(editAccount_ActDir.corpTypeInTable(), corpType);
		assertEquals(editAccount_ActDir.corpInTable(), corp);
		assertEquals(editAccount_ActDir.roleInTable(), role);
	}
}