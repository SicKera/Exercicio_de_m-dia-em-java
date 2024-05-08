package br.com.curso_programacao.aplicacao;

import java.util.Locale;
import java.util.Scanner;

public class Mat_Exercicio4 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		Locale.setDefault(Locale.US);
		
		int id_num, hour;
		double hour_salary, total_salary;
		
		id_num = input.nextInt();
		hour = input.nextInt();
		hour_salary = input.nextDouble();
		
		total_salary = hour_salary*hour;
		
		System.out.println("NUMBER = " + id_num);
		System.out.printf("SALARY = U$ %.2f%n", total_salary);
		
		
		
		input.close();
	}

}
