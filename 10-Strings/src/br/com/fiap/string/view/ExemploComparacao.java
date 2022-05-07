package br.com.fiap.string.view;

public class ExemploComparacao {

	public static void main(String[] args) {
		
		String praia = "Ilhabela";
		String praia2 = "Ilhabela";
		
		//Comparar as duas string
		if(praia.equals(praia2)) {
			System.out.println("Iguais");
		} else {
			System.out.println("Diferentes");
		}
		
		
		//Comparar duas strings sem considerar o case (maiusculo e minusculas)
		if(praia.equalsIgnoreCase(praia2)) {
			System.out.println("Iguais");
		} else {
			System.out.println("Diferentes");
		}
	}

}
