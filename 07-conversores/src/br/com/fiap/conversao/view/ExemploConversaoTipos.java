package br.com.fiap.conversao.view;

public class ExemploConversaoTipos {
	
	//Converter um tipo primitivo em outro tipo primitivo
	public static void main(String[] args) {
		
		//Convers�o implicita (automatica)
		// byte > short > int > long > float > double
		
		byte idade = 10;
		int idadeInt = idade;
		long idadeLong = idadeInt;
		float idadeFloat = idadeLong;
		
		//Convers�o explicita
		float peso = 75.5f; //f ->tipo float
		int pesoInt = (int) peso; //cast -> for�ar o valor a ser do tipo especificado no parenteses
		
		System.out.println(pesoInt);
	}

}
