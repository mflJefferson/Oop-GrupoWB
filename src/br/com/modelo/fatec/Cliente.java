package br.com.modelo.fatec;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("serial")
public class Cliente implements Serializable {
	public String nome;
	public String telefone;
	public String dtNascimento;
	public String genero;
	public int idade;
	public List<Servico> s = new ArrayList<Servico>();

	public List<Servico> getS() {
		return s;
	}

	public void setS(List<Servico> s) {
		this.s = s;
	}

	public String getNome() {
		return nome;
	}
	
	//construtor com scanner
	
	public Cliente(String texto) {
		nome = texto;
	}
	

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public String getDtNascimento() {
		return dtNascimento;
	}
	
	public void setDtNascimento(String dtNascimento) {
		this.dtNascimento = dtNascimento;
	}
	
	public String getGenero() {
		return genero;
	}
	
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	

}
