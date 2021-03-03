package ibtikar.SDP;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;

public class AttachNameTest extends TestBase2{
	
	protected String attachNameTxt = "";
	protected String msg = "";
	
	@Test(priority = 1)
	public void testAgeSettings() {
		new TestBase2().baseStep();
		AttachNamePage attachName = new AttachNamePage(driver);
		attachName.attachNameMethod(attachNameTxt);
		assertEquals(attachName.getAttachName(), attachNameTxt);
		assertEquals(attachName.getMessage(), msg);
	}
}