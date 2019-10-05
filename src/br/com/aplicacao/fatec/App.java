package br.com.aplicacao.fatec;

import br.com.modelo.fatec.Agenda;
import br.com.negocio.fatec.Controle;
import br.com.negocio.fatec.Menu;

public class App {
	public static void main(String[] args) throws Exception {
		Menu neymar = new Menu();
		Agenda ag = new Agenda();
		Controle c = new Controle();
		//c.carregar(ag);
		neymar.boasVindas();
		int opcao = 100;
		while(opcao != 0) {
			neymar.menu();
			Controle ctrl = new Controle();
			opcao = ctrl.opcao();
			if(opcao == 1) {
				ag.inserirClientes();
			}
			if(opcao == 2) {
				ag.listarClientes();
			}
			if(opcao == 3) {
				ag.listarClientesAlfabetica();
			}
			if(opcao == 4) {
				ag.listarClienteGeneroF();
			}
			if(opcao == 5) {
				ag.listarClienteGeneroM();
			}
			if(opcao ==6) {
				ag.removerCadastro();
			}
			
		}
		c = new Controle();
		c.salvar(ag);
		
	}
}