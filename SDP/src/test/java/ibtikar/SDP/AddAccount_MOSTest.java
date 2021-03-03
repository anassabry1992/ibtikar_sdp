package ibtikar.SDP;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;

public class AddAccount_MOSTest extends TestBase2{
	
	protected String user_name = "";
	protected String ver = "";
	protected String full_name = "";
	protected String mobile_no = "";
	protected String email_add = "";
	protected String passwrd = "";
	protected String corpType = "";
	protected String corp = "";
	
	@Test(priority = 1)
	public void testAddAccount() {
		new TestBase2().baseStep();
		AddAccount_MOSPage addAccount_MOS = new AddAccount_MOSPage(driver);
		addAccount_MOS.addAccount_MOSMethod(user_name);
		assertEquals(addAccount_MOS.getFullName(), user_name);
		assertEquals(addAccount_MOS.getMobile(), mobile_no);
		assertEquals(addAccount_MOS.getEmail(), email_add);
		assertEquals(addAccount_MOS.getPassword(), passwrd);
		assertEquals(addAccount_MOS.getCorpType(), corpType);
		assertEquals(addAccount_MOS.getCorp(), corp);
		assertEquals(addAccount_MOS.usernameInTable(), user_name);
		assertEquals(addAccount_MOS.verInTable(), ver);
	}
}