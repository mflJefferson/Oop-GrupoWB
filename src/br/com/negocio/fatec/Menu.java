package br.com.negocio.fatec;

public class Menu {
	public void boasVindas() {
		System.out.println("Bem vindo a melhor agenda do mundo!");
	}
	public void menu() {
		System.out.println("### Menu ###");
		System.out.println("1 - Inserir cliente");
		System.out.println("2 - Listar cliente");
		System.out.println("3 - Listar cliente de forma alfabética");
		System.out.println("4 - Listar clientes do genero feminino");
		System.out.println("5 - Listar clientes do genero masculino");
		System.out.println("6 - Editar cliente");
		System.out.println("7 - Excluir cliente");
		System.out.println("8 - Mostrar idade média dos clientes");
		System.out.println("9 - Idade média dos clientes do sexo feminino");
		System.out.println("10 - Idade média dos clientes do sexo masculino");
		System.out.println("11 - O nosso serviço mais popular");
		System.out.println("12 - O nosso serviço mais popular entre os clientes do sexo feminino");
		System.out.println("13 - O nosso serviço mais popular entre os clientes do sexo masculino");
		System.out.println("0 - Sair");
	}
}