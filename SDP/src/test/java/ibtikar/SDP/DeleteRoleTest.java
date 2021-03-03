package ibtikar.SDP;

import org.testng.annotations.Test;

public class DeleteRoleTest extends TestBase2{
	
	protected String corpTxt = "";
	protected String roleTxt = "";
	protected String permissionTxt = "";
	
	@Test(priority = 1)
	public void testDeleteRole() {
		new TestBase2().baseStep();
		DeleteRolePage delRole = new DeleteRolePage(driver);
		delRole.delRoleMethod();
	}
}