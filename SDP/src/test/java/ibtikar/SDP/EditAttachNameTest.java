package ibtikar.SDP;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;

public class EditAttachNameTest extends TestBase2{
	
	protected String attachNameTxt = "";
	protected String msg = "";
	
	@Test(priority = 1)
	public void testAgeSettings() {
		new TestBase2().baseStep();
		EditAttachNamePage editAttachName = new EditAttachNamePage(driver);
		editAttachName.editAttachNameMethod(attachNameTxt);
		assertEquals(editAttachName.getAttachName(), attachNameTxt);
		assertEquals(editAttachName.getMessage(), msg);
	}
}