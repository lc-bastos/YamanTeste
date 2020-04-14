package screens;

import Locators.Locators;
import Util.utils;
import setup.LeitorMassaDados;


public class Action extends Locators {
 
	LeitorMassaDados massaDados = new LeitorMassaDados();
	
	
	public void InserirDadosDeLogin() {
		utils.Digitar(_User, "Lucas Bastos");
		utils.Digitar(_Password, "8765");
	}

	public void AcessarMenuOpotunidade() {
		utils.Clicar(_btnMenu);
		Thread.sleep(2000);
		utils.Clicar(_btnVendas);
		
	}

	public void AcessarTelaNovaOportunidade() {
		utils.Clicar(_bntNovaOpotunidade);		
	}

	public void PreencherTodosOsCampos() {
	
		
	}

}
