package br.com.curso_programacao.aplicacao;

import java.util.Scanner;

public class Mat_Exercicio1 {

	public static void main(String[] args) {
		
		int x, y;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o valor de x: ");
		
		x = input.nextInt();
		
		System.out.println("Digite o valor de y: ");
		
		y = input.nextInt();
		
		System.out.println("SOMA = " + (x + y));
		
		input.close();

	}

}