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
			System.out.println("Idade: " + cliente.getIdade());
			System.out.println("Genero: " + cliente.getGenero());
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
		Date d = sdf.parse(c.dtNascimento);
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		int ano = cal.get(Calendar.YEAR);
		int mes = cal.get(Calendar.MONTH) + 1;
		int dia = cal.get(Calendar.DATE);
		LocalDate l1 = LocalDate.of(ano, mes, dia);
		LocalDate a1 = LocalDate.now();
		c.id = a1.toEpochDay();
		Period dif1 = Period.between(l1, a1);
		c.idade = dif1.getYears();
		System.out.println("Por favor, digite o seu genero: ");
		c.genero = (ctrl.texto());
		Servico s = new Servico(ctrl.texto());
		System.out.println("Por favor, digite o serviço/produto que você utiliza: ");
		s.nomeServico = (ctrl.texto());
		c.servicos.add(s);
		clientes.add(c);
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
