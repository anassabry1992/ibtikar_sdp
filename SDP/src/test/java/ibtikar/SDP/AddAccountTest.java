package ibtikar.SDP;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;

public class AddAccountTest extends TestBase2{
	
	protected String user_name = "";
	protected String full_name = "";
	protected String mobile_no = "";
	protected String email_add = "";
	protected String passwrd = "";
	
	@Test(priority = 1)
	public void testAddAccount() {
		new TestBase2().baseStep();
		AddAccountPage addAccount = new AddAccountPage(driver);
		addAccount.addAccountMethod(user_name, full_name, mobile_no, email_add, passwrd);
		assertEquals(addAccount.userNameInTable(), user_name);
	}
}