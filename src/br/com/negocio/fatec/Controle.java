package br.com.negocio.fatec;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

import br.com.modelo.fatec.Agenda;

public class Controle {
	public Scanner scanner;

	public Controle() {
		scanner = new Scanner(System.in);
	}

	public int opcao() {
		int op = scanner.nextInt();
		return op;
	}

	public String texto() {
		String t = scanner.nextLine();
		return t;
	}
	
	public Agenda carregar() throws Exception{
		FileInputStream entrada = new FileInputStream("agenda.txt");
		ObjectInputStream leitor = new ObjectInputStream(entrada);
		Object ob = leitor.readObject();
		Agenda ag = (Agenda) ob;
		leitor.close();
		
		return ag;
	}
	
	public void salvar(Agenda ag) throws Exception{
		FileOutputStream saida = new FileOutputStream("agenda.txt");
		ObjectOutputStream escritor = new ObjectOutputStream(saida);
		escritor.writeObject(ag);
		escritor.close();
		
	}
	
	@Override
	protected void finalize() throws Throwable {
		scanner.close();
	}
}
