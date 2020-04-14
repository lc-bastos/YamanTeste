package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Quando;
import screens.Actitivities;

public class Action_steps {
	Actitivities yaman = new Actitivities();

	@Dado("realizo login na ferramenta")
	public void realizo_login_na_ferramenta() {
		yaman.RealizarLogin();
	}
	
	@Quando("acesso a tela de oportunidade")
	public void acesso_a_tela_de_oportunidade() {
		yaman.AcessarTelaOportunidade();
	}
	
	@Quando("cadastro novas oportunidades")
	public void cadastro_novas_oportunidades() {
	yaman.CadastrarNovasOportunidades();
	}
	
	
}
