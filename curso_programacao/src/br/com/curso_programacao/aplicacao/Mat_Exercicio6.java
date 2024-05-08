package br.com.curso_programacao.aplicacao;

import java.util.Locale;
import java.util.Scanner;

public class Mat_Exercicio6 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		Locale.setDefault(Locale.US);
		
		double A, B, C, pi = 3.14159;
		
		A = input.nextDouble();
		B = input.nextDouble();
		C = input.nextDouble();
		
		double triangulo = (A*C)/2.0;
		double circulo = pi*Math.pow(C, 2);
		double trapezio = (A+B)*C/2;
		double quadrado = Math.pow(B, 2);
		double retangulo = A*B;
		
		System.out.printf("TRIANGULO: %.3f %n", triangulo);
		System.out.printf("CIRCULO: %.3f %n", circulo);
		System.out.printf("TRAPEZIO: %.3f %n", trapezio);
		System.out.printf("QUADRADO: %.3f %n", quadrado);
		System.out.printf("RETANGULO: %.3f ", retangulo);
		
		input.close();		

	}

}
