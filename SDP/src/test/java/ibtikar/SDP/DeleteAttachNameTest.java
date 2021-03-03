package ibtikar.SDP;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;

public class DeleteAttachNameTest extends TestBase2{
	
	protected String attachNameTxt = "";
	
	@Test(priority = 1)
	public void testAgeSettings() {
		new TestBase2().baseStep();
		DeleteAttachNamePage deleteAttachName = new DeleteAttachNamePage(driver);
		deleteAttachName.deleteAttachNameMethod();
		assertEquals(deleteAttachName.getAttachName(), attachNameTxt);
	}
}