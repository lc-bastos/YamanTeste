package RunnerYaman;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import setup.Run;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features", glue = { "steps" }, plugin = "pretty")

public class RunnerYaman {
	static Run runner = new Run();
	static WebDriver driver;

	@BeforeClass
	public static void setup() throws Exception {
		System.out.println("Abrindo navegador");
		runner.IniciarNavegador();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		runner.FecharNavegador();
		System.out.println("Navegador finalizado");
	}
}
