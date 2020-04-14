package Util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class utils {
	
	public static void Digitar (By elemento , String valor) {
		elemento.toString();
		((WebElement) elemento).sendKeys(valor);
	}
	
	public static void Clicar(By elemento) {
		elemento.toString();
		((WebElement) elemento).click();
	}

}
