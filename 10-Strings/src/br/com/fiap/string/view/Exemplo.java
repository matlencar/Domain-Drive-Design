package br.com.fiap.string.view;

public class Exemplo {

	public static void main(String[] args) {
		
		//Caracteres de escape
		// \n (quebra a linha)
		// \t (tabula��o)
		// \" (caractere " na string) \' (aspas simples na string) \\ (barra invertida na string)
		String endereco = "\tAvenida Lins de Vasconcelos, 1222 \nCambuci \n\"FIAP\" \\ \"";
		System.out.println(endereco);
		
		String pais = "Brasil";
		//Concatenar o pais com a lingua
		pais += "Portugues";
		//Concatenar com a capita� do pais (utilizando o m�todo concat)
		pais = pais.concat("Brasilia");
		System.out.println(pais);
	}

}
