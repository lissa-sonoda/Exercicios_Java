package br.com.generation.exercicios;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		/*
		 * 2. Faça um sistema que leia a idade de uma 
		 * pessoa expressa em dias e mostre-a expressa 
		 * em anos, meses e dias.
		 * 
		 * @author Helen Lissa Sonoda
		 * Date: 01/10/2021
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int d, dToday, days, m, y, restD;
		
		System.out.println("Digite o dia de hoje: ");
		dToday = sc.nextInt();
		
		System.out.println("Digite sua idade em dias: ");
		d = sc.nextInt();
		
		sc.close();
		
		//cálculo
		days = d - dToday;
		y = days / 365;
		restD = days % 365;
		m = restD / 30;

		System.out.println("\n\nSua idade: " + y + " ano(s) " +
							m + " mes(es) " + dToday + " dia(s).\n");
	}
}