package ibtikar.SDP;

import org.testng.annotations.Test;

public class Accounts_filterByCorpTest extends TestBase2{
	
	@Test(priority = 1)
	public void testAccounts_filterByCorp() {
		new TestBase2().baseStep();
		Accounts_filterByCorp filterCorp = new Accounts_filterByCorp(driver);
		filterCorp.corpSelectMethod();
//		assertEquals(driver.getCurrentUrl(), expectUrl);
	}
}