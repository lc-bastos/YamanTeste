package screens;

import static org.junit.Assert.assertTrue;


import Locators.Locators;

public class Check extends Locators{

	public void ValidarDadosHome() {
		assertTrue(_lblLogin.isDisplayed());
	}

	public void ValidarTelaOpotunidade() {
		assertTrue(_lblOpotunidades.isDisplayed());
	}

}
