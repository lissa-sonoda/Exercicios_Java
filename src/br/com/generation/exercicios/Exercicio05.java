package br.com.generation.exercicios;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		/*
		 * 5. Faça um sistema que leia as 3 notas de um aluno e calcule 
		 * a média final deste aluno. Considerar que a média é ponderada 
		 * e que o peso das notas é: 2, 3 e 5, respectivamente.
		 * 
		 * @author Helen Lissa Sonoda
		 * Date: 01/10/2021
		 */

		Scanner sc = new Scanner(System.in);
		
		String name;
		double nota[], m;
		int i;
		
		nota = new double[3];
		
		System.out.println("Digite o nome do(a) aluno(a): ");
		name = sc.next();
		
		System.out.println(" ----Utilize a vírgula para números reais---- \n");
		for(i = 0; i < 3; i++) {
			System.out.println("Digite a " + (i + 1) + "ª nota: ");
			nota[i] = sc.nextDouble();
		}
		
		sc.close();
		
		m = ((nota[0]*2) + (nota[1]*3) + (nota[2]*5))/10;
		
		System.out.println("\nO(A) aluno(a) " + name + " teve a média final de: " + m +
							"\n");
	}
}