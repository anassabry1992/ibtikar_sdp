package ibtikar.SDP;

import org.testng.annotations.Test;

public class Logs_filterByKeywordTest extends TestBase2{
	
	protected String keyword = "";
	
	@Test(priority = 1)
	public void testLogs_filterByKeyword() {
		new TestBase2().baseStep();
		Logs_filterByKeyword filterKeyword = new Logs_filterByKeyword(driver);
		filterKeyword.keywordMethod(keyword);
//		assertEquals(driver.getCurrentUrl(), expectUrl);
	}
}