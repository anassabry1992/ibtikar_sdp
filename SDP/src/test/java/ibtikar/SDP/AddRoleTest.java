package ibtikar.SDP;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;

public class AddRoleTest extends TestBase2{
	
	protected String roleTxt = "";
	
	@Test(priority = 1)
	public void testAddRole() {
		new TestBase2().baseStep();
		AddRolePage addRole = new AddRolePage(driver);
		addRole.addRoleMethod(roleTxt);
		assertEquals(addRole.roleInTable(), roleTxt);
	}
}