package br.com.fiap.string.view;

public class ExemploMetodosString {

	public static void main(String[] args) {
		
		//Declarar uma String
		String estado = "São Paulo";
		
		//Exibir a quantidade de caracteres
		int qtd = estado.length();
		System.out.println(estado + " tem " + qtd + " caracteres");
		
		//Recuperar o caractere da 7 posição do estado e exibir o caractere
		char letra = estado.charAt(6);
		System.out.println("A setima letra do estaado é \"" + letra + "\"");
		
		//estado e substituir o espaço por nada e calculou a qtd de caracteres 
		qtd = estado.replace("", "").length();
		System.out.println("Caracteres: " + qtd);
	}

}
