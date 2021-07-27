package br.com.dio;

import br.com.dio.model.gato;

public class primeiroprograma {

	public static void main(String[] args) {
		
		gato gato = new gato();
		livros livros = new livros();
		
		System.out.println(gato);
	}
}


class livros{
	private String nome;
	private String npag;
}