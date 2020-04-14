package setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Run {
	static WebDriver driver;

	public void IniciarNavegador() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\lcarmoba\\eclipse-workspace\\YamanAutomation\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://startupflex.com.br/crm/");
	}
	
	public void FecharNavegador() {
		driver.close();
	}
}
