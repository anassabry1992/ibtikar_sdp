package ibtikar.SDP;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;

public class AddAccount_ActDirTest extends TestBase2{
	
	protected String user_name = "";
	protected String ver = "";
	protected String full_name = "";
	protected String mobile_no = "";
	protected String email_add = "";
	protected String passwrd = "";
	
	@Test(priority = 1)
	public void testAddAccount() {
		new TestBase2().baseStep();
		AddAccount_ActDirPage addAccount_ActDir = new AddAccount_ActDirPage(driver);
		addAccount_ActDir.addAccount_ActDirMethod(user_name);
		assertEquals(addAccount_ActDir.getFullName(), user_name);
		assertEquals(addAccount_ActDir.getMobile(), mobile_no);
		assertEquals(addAccount_ActDir.getEmail(), email_add);
		assertEquals(addAccount_ActDir.getPassword(), passwrd);
		assertEquals(addAccount_ActDir.usernameInTable(), user_name);
		assertEquals(addAccount_ActDir.verInTable(), ver);
	}
}