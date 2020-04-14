package setup;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import org.openqa.selenium.WebElement;

public class LeitorMassaDados {

	public void LeitorMassaDados(WebElement campo , String arquivoMassa) {
		
		File arquvivoCSV = new File("C:\\Users\\lcarmoba\\eclipse-workspace\\YamanAutomation\\src\\main\\resources\\massaDados\\testeleitor.csv");
		try {
			String linha = new String();
			Scanner leitor = new Scanner(arquvivoCSV);
			leitor.nextLine();
			while(leitor.hasNext()){
				linha = leitor.nextLine();
				String[] valor = linha.split(",");
				
				System.out.println(valor[0] + valor[2]);
				
				
			}
		}catch (FileNotFoundException e) {
			
		}
	
}

	}