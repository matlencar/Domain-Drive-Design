package br.com.fiap.string.view;

public class ExemploMetodosString {

	public static void main(String[] args) {
		
		//Declarar uma String
		String estado = "Minas Gerais";
		
		//Exibir a quantidade de caracteres
		int qtd = estado.length();
		System.out.println(estado + " tem " + qtd + " caracteres");
		
		//Recuperar o caractere da 7 posição do estado e exibir o caractere
		char letra = estado.charAt(6);
		System.out.println("A setima letra do estaado é \"" + letra + "\"");
		
		//estado e substituir o espaço por nada e calculou a qtd de caracteres 
		qtd = estado.replace("", "").length();
		System.out.println("Caracteres: " + qtd);
		
		//Recuperar a posição do primeiro caractere "a" da string
		int posicao = estado.indexOf("a");
		System.out.println("A primeira letra \"a\" esta na posição: " + posicao);
		
		//Recuperar o primeiro nome do estado
		String primeiroNome = estado.substring(0,estado.indexOf(" "));
		
		//Exibir o primeiro nome
		System.out.println(primeiroNome);
		
		//Recuperar o ultimo nome do estado
		String ultimoNome = estado.substring(0, estado.lastIndexOf(" ") + 1);
		
		//Exibir o ultimo nome
		System.out.println(ultimoNome);
		
		//Exibir o nome do estado com todas as letras maiusculas
		String estadoMaiusculo = estado.toUpperCase();
		System.out.println(estadoMaiusculo);
		
		//Exibir o nome do estado com todas as letras minusculas
		System.out.println(estado.toLowerCase());
		
		//Exibir o nome do estado trocando o "Sul" por "Norte"
		System.out.println(estado.replace("Sul", "Norte"));
	}

}
