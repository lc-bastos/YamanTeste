package screens;

import setup.LeitorMassaDados;

public class Actitivities {

	Action action = new Action();
	Check check = new Check();

	public void ValidarHome() {
		check.ValidarDadosHome();
	}

	public void RealizarLogin() {
		action.InserirDadosDeLogin();
	}

	public void AcessarTelaOportunidade() {
		action.AcessarMenuOpotunidade();
		check.ValidarTelaOpotunidade();

	}

	public void CadastrarNovasOportunidades() {
		action.AcessarTelaNovaOportunidade();
		action.PreencherTodosOsCampos();

	}

}
