package ibtikar.SDP;

import org.testng.annotations.Test;

public class UsermanualTest extends TestBase2{
		
	@Test(priority = 1)
	public void testUsermanual() {
		new TestBase2().baseStep();
		UsermanualPage usermanualpage = new UsermanualPage(driver);
		usermanualpage.usermanualMethod();
	}
}