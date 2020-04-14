package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import screens.Actitivities;

public class Check_steps {
	Actitivities yaman = new Actitivities();

	@Dado("que vejo a tela do site aberta")
	public void que_vejo_a_tela_do_site_aberta() {
		yaman.ValidarHome();
	}
	
	@Entao("vejo minhas oportunidades cadastradas")
	public void vejo_minhas_oportunidades_cadastradas() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
}
