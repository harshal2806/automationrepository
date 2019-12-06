package Youtube;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DownloadFile1 {
	@Test
	public void MahaOnline() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		ChromeDriver dr = new ChromeDriver();
		
		dr.get("https://mahampsc.mahaonline.gov.in/MPSC/MPSCHome.aspx");
		dr.findElement(By.id("FormsPH_lblInstructionSet")).click();

	}

}
