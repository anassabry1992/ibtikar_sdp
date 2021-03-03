package ibtikar.SDP;

import org.openqa.selenium.WebDriver;

public class TestBase2{
	
	protected TestBase testbase = new TestBase();
	protected WebDriver driver;
	protected String url = "https://sports-portal.ibtik.net/";
	protected String username = "user@sdp.com";
	protected String password = "P@$$w0rd";
	
	public void baseStep() {
		testbase.openMyBrowser(url);
		LoginPage loginpage = new LoginPage(testbase.driver);
		loginpage.loginMethod(username, password);
	}
}
