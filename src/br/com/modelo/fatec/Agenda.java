package br.com.modelo.fatec;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.function.Predicate;

import br.com.negocio.fatec.Controle;

@SuppressWarnings("serial")
public class Agenda implements Serializable{
	public List<Cliente> clientes = new ArrayList<Cliente>();
	public List<Servico> servicos = new ArrayList<Servico>();
	transient SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
	

	public void listarClientes() {
		for (Cliente cliente : clientes) {
			System.out.println("Nome: " + cliente.getNome());
			System.out.println("Telefone: " + cliente.getTelefone());
			System.out.println("Idade: " + cliente.getIdade() + " Anos");
			System.out.println("Genero: " + cliente.getGenero());
			
//			System.out.println("Nome: " + cliente.getNome());
//			System.out.println("Telefone: " + cliente.getTelefone());
//			System.out.println("Idade: " + cliente.getIdade() + " Anos");
//			System.out.println("Genero: " + cliente.getGenero());
//			System.out.println("Serviços/Produtos " + Ser);
//			System.out.println("");
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
		Controle ctrl = new Controle();
		Cliente c = new Cliente(null);
		System.out.println("Por favor, digite um nome para o contato");
		c.nome = (ctrl.texto());
		System.out.println("Por favor, digite um telefone para o contato");
		c.telefone = (ctrl.texto());
		System.out.println("Por favor, digite a data de seu nascimento (AAAA/MM/DD)");
		c.dtNascimento = (ctrl.texto());
		try {
			c.setIdade(conversaoIdade(c.dtNascimento));
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("Por favor, digite o seu genero: ");
		c.genero = (ctrl.texto());
		System.out.println("### Qual serviço/produto você utiliza? ###");
		System.out.println("1 - Manicure");
		System.out.println("2 - Pedicure");
		System.out.println("3 - Pintura de cabelo");
		System.out.println("4 - Remoção de rugas");
		System.out.println("5 - Remoção de manchas na pele");
		System.out.println("6 - Aplicação de botox");
		System.out.println("7 - Tratamento para emagrecimento");
		System.out.println("8 - Redução de medidas");
		System.out.println("9 - Corte de cabelo");
		System.out.println("10 - Modelagem");
		System.out.println("11 - Corte de barba");
		System.out.println("12 - Tratamento para queda de cabelo");
		System.out.println("13 - Venda de produtos especializados");
		System.out.println("0 - Terminar cadastro");
		Servico s = new Servico();
		int op = 100;
		while (op != 0) {
			switch(ctrl.opcao()) {
			case 1:{
				s.nomeServico = ("Manicure");
				s.setsGenero(c.getGenero());
				s.setCont(1);
				servicos.add(s);
				break;
			}
			case 2:{
				s.nomeServico = ("Pedicure");
				s.setsGenero(c.getGenero());
				s.setCont(1);
				servicos.add(s);
				break;
			}
			case 3:{
				s.nomeServico = ("Pintura de cabelo");
				s.setsGenero(c.getGenero());
				s.setCont(1);
				servicos.add(s);
				break;
			}
			case 4:{
				s.nomeServico = ("Remoção de rugas");
				s.setsGenero(c.getGenero());
				s.setCont(1);
				servicos.add(s);
				break;
			}
			case 5:{
				s.nomeServico = ("Remoção de machas na pele");
				s.setsGenero(c.getGenero());
				s.setCont(1);
				servicos.add(s);
				break;
			}
			case 6:{
				s.nomeServico = ("Aplicação de botox");
				s.setsGenero(c.getGenero());
				s.setCont(1);
				servicos.add(s);
				break;
			}
			case 7:{
				s.nomeServico = ("Tratamento para emagrecimento");
				s.setsGenero(c.getGenero());
				s.setCont(1);
				servicos.add(s);
				break;
			}
			case 8:{
				s.nomeServico = ("Redução de medidas");
				s.setsGenero(c.getGenero());
				s.setCont(1);
				servicos.add(s);
				break;
			}
			case 9:{
				s.nomeServico = ("Corte de cabelo");
				s.setsGenero(c.getGenero());
				s.setCont(1);
				servicos.add(s);
				break;
			}
			case 10:{
				s.nomeServico = ("Modelagem");
				s.setsGenero(c.getGenero());
				s.setCont(1);
				servicos.add(s);
				break;
			}
			case 11:{
				s.nomeServico = ("Corte de barba");
				s.setsGenero(c.getGenero());
				s.setCont(1);
				servicos.add(s);
				break;
			}
			case 12:{
				s.nomeServico = ("Tratamento para queda de cabelo");
				s.setsGenero(c.getGenero());
				s.setCont(1);
				servicos.add(s);
				break;
			}
			case 13:{
				s.nomeServico = ("Venda de produtos especializados");
				s.setsGenero(c.getGenero());
				s.setCont(1);
				servicos.add(s);
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
	public void editarCliente() throws ParseException {
		System.out.println("Qual Cliente você deseja editar?");
		Controle ctrl = new Controle();
		String nome = ctrl.texto();
		for(Cliente c: clientes) {
			if (c.getNome().equalsIgnoreCase(nome)) {
				System.out.println("Entre com o novo nome: ");
				c.setNome(ctrl.texto());
				System.out.println("Seu novo telefone: ");
				c.setTelefone(ctrl.texto());
				System.out.println("O dia de seu nascimento (AAAA/MM/DD): ");
				c.setDtNascimento(ctrl.texto());
				c.setIdade(conversaoIdade(c.getDtNascimento()));
			}
			else {
				System.out.println("Não há cliente com esse nome");
			}
		}
		
		
	}
	
	
	public void removerCliente(){
		System.out.println("Qual Cliente você deseja excluir?");
		Controle ctrl = new Controle();
		String nome = ctrl.texto();
		Predicate<Cliente> condition = cliente -> cliente.getNome().equalsIgnoreCase(nome);
		clientes.removeIf(condition);
		} //Funcionou C#r%lh@ predicate removeIf best method
	
	public void sair() throws ParseException{
		System.exit(0); 
	}
	public int idadeMedia() {
		int idade = 0;
		int size = 0;
		int m = 0;
		for(Cliente c: clientes) {
			idade = idade + c.getIdade();
			size = clientes.size();
		}
		m = idade / size;
		System.out.println("A idade média de todos nossos clientes é: " + m);
		return m;
	}
	public int idadeMediaF() {
		int idade = 0;
		int size = 0;
		int m = 0;
		for(Cliente c: clientes) {
			if (c.genero.equalsIgnoreCase("F")) {
				idade = idade + c.getIdade();
				size++;
			}
		}
		m = idade / size;
		System.out.println("A idade média de nossas clientes é: " + m);
		return m;
	}
	
	public int idadeMediaM() {
		int idade = 0;
		int size = 0;
		int m = 0;
		for(Cliente c: clientes) {
			if (c.genero.equalsIgnoreCase("M")) {
				idade = idade + c.getIdade();
				size++;
			}
		}
		m = idade / size;
		System.out.println("A idade média de nossos clientes é: " + m);
		return m;
	}
	public void maisPopular() {
		int maior = 0;
		for (Servico s : servicos) {
			if (s.getCont() > maior) {
				maior = s.getCont();
				Servico max = new Servico(s);
				max = s;
				System.out.println("O serviço mais popular é o:" + max.getNomeServico());
			}
		}
	}
	public void maisPopularF() {
		int maior = 0;
		for (Servico s : servicos) {
			if (s.getsGenero().equalsIgnoreCase("F")) {
				if (s.getCont() > maior) {
					maior = s.getCont();
					Servico max = new Servico(s);
					max = s;
					System.out.println("O serviço mais popular entre as mulheres é o:" + max.getNomeServico());
				}
			}
		}
	}
	public void maisPopularM() {
		int maior = 0;
		for (Servico s : servicos) {
			if (s.getsGenero().equalsIgnoreCase("M")) {
				if (s.getCont() > maior) {
					maior = s.getCont();
					Servico max = new Servico(s);
					max = s;
					System.out.println("O serviço mais popular entre os homens é o:" + max.getNomeServico());
				}
			}
		}
	}
	
}
