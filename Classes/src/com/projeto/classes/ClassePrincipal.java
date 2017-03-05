package com.projeto.classes;

public class ClassePrincipal {

	public static void main(String[] args) {
		Casa minhaCasa = new Casa();
		minhaCasa.cor = "Azul";
		
		System.out.println(minhaCasa.cor);
		
		minhaCasa.abrirGaragem();
	}

}
