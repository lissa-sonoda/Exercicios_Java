package br.com.generation.exercicios;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		/*
		 * 4. Escreva  um sistema que leia três números 
		 * inteiros e positivos (A, B, C) e calcule a 
		 * seguinte expressão: 
		 * D=(R+S)/2.0, onde R=(A+B)^2 e S=(B+C)^2
		 * 
		 * @author Helen Lissa Sonoda
		 * Date: 01/10/2021
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int a, b, c;
		double d, r, s;
		
		System.out.println("Digite o valor de A: ");
		a = sc.nextInt();
		
		System.out.println("Digite o valor de B: ");
		b = sc.nextInt();
		
		System.out.println("Digite o valor de C: ");
		c = sc.nextInt();
		
		sc.close();
		
		//cálculo
		r = Math.pow((a + b), 2);
		s = Math.pow((b + c), 2);
		d = (r + s)/2;
		
		System.out.println("\nO resultado de D é igual a: " + d);
	}
}