package ibtikar.SDP;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;

public class ActDeactAccountTest extends TestBase2{
	
	protected String att = "";
	
	@Test(priority = 1)
	public void testActDeactAccount() {
		new TestBase2().baseStep();
		ActDeactAccountPage actDeactAccount = new ActDeactAccountPage(driver);
		actDeactAccount.actDeactAccountMethod();
		assertEquals(actDeactAccount.actDeactStatusCheck(), att);
	}
}