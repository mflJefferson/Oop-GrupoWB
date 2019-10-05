package br.com.modelo.fatec;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

import br.com.negocio.fatec.Controle;

public class Agenda {
	public List<Cliente> clientes = new ArrayList<Cliente>();
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
	

	public void listarClientes() {
		for (Cliente cliente : clientes) {
			System.out.println("Nome: " + cliente.getNome());
			System.out.println("Telefone: " + cliente.getTelefone());
			System.out.println("Idade: " + cliente.getIdade() + " Anos");
			System.out.println("Genero: " + cliente.getGenero());
			System.out.println("Serviços/Produtos " +cliente.getServicos());
		}
	}
	
	public void listarClientesAlfabetica() {
		clientes.sort(Comparator.comparing(Cliente::getNome));
		for(Cliente cliente : clientes) {
			System.out.println("Nome: " + cliente.getNome());
		}
	}
	
	public void listarClienteGeneroM() {
		clientes.sort(Comparator.comparing(Cliente::getNome));
		String masc = "m";
		for(Cliente c : clientes) {
			if (c.getGenero().equalsIgnoreCase(masc))
				System.out.println("Nome: "+ c.getNome());
		}
	}
	
	public void listarClienteGeneroF() {
		clientes.sort(Comparator.comparing(Cliente::getNome));
		String fem = "f";
		for(Cliente c : clientes) {
			if (c.getGenero().equalsIgnoreCase(fem))
				System.out.println("Nome: "+ c.getNome());
		}
	}

	public void inserirClientes() throws ParseException {
		System.out.println("Por favor, digite um nome para o contato");
		Controle ctrl = new Controle();
		Cliente c = new Cliente(ctrl.texto());
		c.nome = (ctrl.texto());
		System.out.println("Por favor, digite um telefonome para o contato");
		c.telefone = (ctrl.texto());
		System.out.println("Por favor, digite a data de seu nascimento (AAAA/MM/DD)");
		c.dtNascimento = (ctrl.texto());
		LocalDate a2 = LocalDate.now();
		c.id = a2.toEpochDay();
		c.idade = conversaoIdade(c.dtNascimento);
		System.out.println("Por favor, digite o seu genero: ");
		c.genero = (ctrl.texto());
		System.out.println("### Qual serviço/produto você utiliza? ###");
		System.out.println("1 - Manicure");
		System.out.println("2 - Pedicure");
		System.out.println("3 - Remoção de rugas");
		System.out.println("4 - Aplicação de botox");
		System.out.println("5 - Corte de cabelo");
		System.out.println("6 - Corte de barba");
		System.out.println("0 - Terminar cadastro");
		int op = 100;
		while (op != 0) {
			switch(ctrl.opcao()) {
			case 1:{
				c.servicos.add("Manicure");
				break;
			}
			case 2:{
				c.servicos.add("Pedicure");
				break;
			}
			case 3:{
				c.servicos.add("Remoção de rugas");
				break;
			}
			case 4:{
				c.servicos.add("Aplicação de botox");
				break;
			}
			case 5:{
				c.servicos.add("Corte de cabelo");
				break;
			}
			case 6:{
				c.servicos.add("Corte de barba");
				break;
			}
			case 0:{
				op = 0;
				break;
			}
			
			}
			
		}
		clientes.add(c);
	}
	
	public int conversaoIdade(String dtNascimento) throws ParseException {
		int i;
		Date d = sdf.parse(dtNascimento);
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		int ano = cal.get(Calendar.YEAR);
		int mes = cal.get(Calendar.MONTH) + 1;
		int dia = cal.get(Calendar.DATE);
		LocalDate l1 = LocalDate.of(ano, mes, dia);
		LocalDate a1 = LocalDate.now();
		Period dif1 = Period.between(l1, a1);
		i = dif1.getYears();
		return i;	
	}
	
	public Cliente getCliente(String nome) {
		for(Cliente c: clientes) {
			if(c.getNome().equalsIgnoreCase(nome)) {
				return c;
			}
		}
		return null;
	}
	
	public void removerCadastro(int x){
		clientes.remove(x);
	}
	
	public void sair() throws ParseException{
		System.exit(0); 	
	}
	
}
