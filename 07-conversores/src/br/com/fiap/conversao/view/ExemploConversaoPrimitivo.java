package br.com.fiap.conversao.view;

import javax.swing.JOptionPane;

public class ExemploConversaoPrimitivo {
	
	//Converter uma String em um tipo primitivo
	public static void main(String[] args) {
		
		//Declarar uma String
		String idade = JOptionPane.showInputDialog("Digite a idade ");
		
		//Converter para os tipos primitivos byte, short, int long, float e double
		byte valorByte = Byte.parseByte(idade);
		
		short valorShort = Short.parseShort(idade);
		
		int valorInt = Integer.parseInt(idade);
		
		long valorLong = Long.parseLong(idade);
		
		float valorFloat = Float.parseFloat(idade);
		
		double valorDouble = Double.parseDouble(idade);
		
		//Exibir a soma doa valores
		double soma = valorByte + valorShort + valorInt + valorLong + valorFloat + valorDouble;
		
		JOptionPane.showMessageDialog(null, soma);//Exibe um valor para o usuario
		
		//Declarar uma String ler um boolean
		String maiorIdade = JOptionPane.showInputDialog("É maior de idade?");
		
		
		//Converter a String para um boolean
		//parseBoolean() --> retorna verdadero se a string for "true" ou false, caso contrario.
		boolean maioridade = Boolean.parseBoolean(maiorIdade);
		
		
		//Exibir o boolean
		JOptionPane.showMessageDialog(null, maioridade);
		
		
	}
}
