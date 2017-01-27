package br.org.smartcompras.models;

public abstract class Lista {

	int idLista;
	String nomeLista;
	String tipoLista;
	double valor;
	
		
	public double calcularLista() {
		return 0;
	}
	
	public boolean compartilharLista(){
		return false;
	}
	
	
	public boolean gerarLista(){
		return false;
	}
}
