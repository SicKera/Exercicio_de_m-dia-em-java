package br.com.curso_programacao.aplicacao;

import java.util.Locale;
import java.util.Scanner;

public class Mat_Exercicio2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Double A, R, pi = 3.14159;
		
		Scanner input = new Scanner (System.in);
		R = input.nextDouble();
		
		A = pi*Math.pow(R, 2);
		
		input.close();
		
		System.out.printf("%nA = %.4f%n", A);
		
		
		

	}

}
