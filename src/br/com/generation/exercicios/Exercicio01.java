package br.com.generation.exercicios;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		/*
		 * 1. Faça um sistema que leia a idade de uma pessoa 
		 * expressa em anos, meses e dias e mostre-a expressa 
		 * apenas em dias.
		 * 
		 * @author Helen Lissa Sonoda
		 * Date: 01/10/2021
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int y, m, d, total;
		
		System.out.println("Digite sua idade em anos: ");
		y = sc.nextInt();
		
		System.out.println("Agora digite os meses: ");
		m = sc.nextInt();
		
		System.out.println("E por fim digite os dias: ");
		d = sc.nextInt();
		
		sc.close();
		
		total = (y*365) + (m*30) + d;
		
		System.out.println("\nSua idade é igual a: " + total + " dia(s).\n");
		
	}
}