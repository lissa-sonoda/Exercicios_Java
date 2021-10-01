package br.com.generation.exercicios;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		
		/*
		 * 7. Um sistema de equações lineares do tipo: 
		 * ax + by = c
		 * dx + ey = f
		 * pode ser resolvido segundo mostrado abaixo: 
		 * x = (ce-bf)/(ae-bd)
		 * y = (af-cd)/(ae-bd)
		 * Escreva um sistema que lê os coeficientes a,b,c,d,e e f e 
		 * calcula e mostra os valores de x e y. 
		 * 
		 * @author Helen Lissa Sonoda
		 * Date: 01/10/2021
		 */
		
		Scanner sc = new Scanner(System.in);
		
		double a, b, c, d, g, f, x, y;
		
		System.out.println(" ----Utilize a vírgula para números reais---- \n");
		System.out.println("Digite o coeficiente de a: ");
		a = sc.nextDouble();
		
		System.out.println("Digite o coeficiente de b: ");
		b = sc.nextDouble();
		
		System.out.println("Digite o coeficiente de c: ");
		c = sc.nextDouble();
		
		System.out.println("Digite o coeficiente de d: ");
		d = sc.nextDouble();
		
		System.out.println("Digite o coeficiente de e: ");
		g = sc.nextDouble();
		
		System.out.println("Digite o coeficiente de f: ");
		f = sc.nextDouble();
		
		sc.close();

		x = ((c*g) - (b*f)) / ((a*g) - (b*d));
		y = ((a*f) - (c*d)) / ((a*g) - (b*d));
		
		System.out.println("\nO resultado de x é igual a: " + x);
		System.out.println("\nO resultado de y é igual a: " + y + "\n");
	}
}