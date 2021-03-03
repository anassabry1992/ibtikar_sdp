package ibtikar.SDP;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;

public class EditRoleTest extends TestBase2{
	
	protected String corpTxt = "";
	protected String roleTxt = "";
	protected String permissionTxt = "";
	
	@Test(priority = 1)
	public void testEditRole() {
		new TestBase2().baseStep();
		EditRolePage editRole = new EditRolePage(driver);
		editRole.editRoleMethod(roleTxt);
		assertEquals(editRole.corpInTable(), corpTxt);
		assertEquals(editRole.roleInTable(), roleTxt);
		assertEquals(editRole.permissionInTable(), permissionTxt);
	}
}