package ibtikar.SDP;

import org.testng.annotations.Test;

public class Roles_filterByCorpTest extends TestBase2{
	
	@Test(priority = 1)
	public void testRoles_filterByCorp() {
		new TestBase2().baseStep();
		Roles_filterByCorp filterCorp = new Roles_filterByCorp(driver);
		filterCorp.corpSelectMethod();
//		assertEquals(driver.getCurrentUrl(), expectUrl);
	}
}