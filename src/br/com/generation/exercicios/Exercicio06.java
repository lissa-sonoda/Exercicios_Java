package br.com.generation.exercicios;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
		/*
		 * 6. Construa um programa que, tendo como dados de entrada 
		 * dois pontos quaisquer no plano, P(x1, y1) e P(x2, y2), 
		 * escreva a distância entre eles. A fórmula que efetua tal 
		 * cálculo é: d = a raiz quadrada de ((x2-x1)^2 + (y2-y1)^2)
		 * 
		 * @author Helen Lissa Sonoda
		 * Date: 01/10/2021
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int x1, x2, y1, y2;
		double d, a, b;
		
		System.out.println("Digite o valor de x1: ");
		x1 = sc.nextInt();

		System.out.println("Digite o valor de y1: ");
		y1 = sc.nextInt();
		
		System.out.println("Digite o valor de x2: ");
		x2 = sc.nextInt();
		
		System.out.println("Digite o valor de y2: ");
		y2 = sc.nextInt();
		
		sc.close();

		a = Math.pow((x2-x1), 2);
		b = Math.pow((y2-y1), 2);

		d = Math.sqrt((a+b));
		
		System.out.println("\nO resultado da distância é de: " + d + "\n");		
	}
}