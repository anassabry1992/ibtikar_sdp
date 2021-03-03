package ibtikar.SDP;

import org.testng.annotations.Test;

public class Logs_filterByActionTest extends TestBase2{
	
	@Test(priority = 1)
	public void testLogs_filterByAction() {
		new TestBase2().baseStep();
		Logs_filterByAction filterAction = new Logs_filterByAction(driver);
		filterAction.actionSelectMethod();
//		assertEquals(driver.getCurrentUrl(), expectUrl);
	}
}