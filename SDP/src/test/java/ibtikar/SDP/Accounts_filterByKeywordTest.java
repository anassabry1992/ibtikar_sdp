package ibtikar.SDP;

import org.testng.annotations.Test;

public class Accounts_filterByKeywordTest extends TestBase2{
	
	protected String keyword = "";
	
	@Test(priority = 1)
	public void testAccounts_filterByKeyword() {
		new TestBase2().baseStep();
		Accounts_filterByKeyword filterKeyword = new Accounts_filterByKeyword(driver);
		filterKeyword.keywordMethod(keyword);
//		assertEquals(driver.getCurrentUrl(), expectUrl);
	}
}