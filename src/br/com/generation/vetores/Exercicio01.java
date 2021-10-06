		/*
		 * 1. Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma atividade 
		 * e o escreva em seguida. Encontre após a maior pontuação e a apresente. 
		 * 
		 * @author Helen Lissa Sonoda
		 * Date: 06/10/2021
		 */

package br.com.generation.vetores;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		double [] pont = new double[5];
		int i; //contador
		double highP = 0;
		
		for(i = 0; i < 5; i++) {
			System.out.println("Digite o " + (i+1) + "º valor: ");
			pont[i] = s.nextDouble();
			
			if(pont[i] > highP) {
				highP = pont[i];
			}
		}
		System.out.println("\nA maior pontuação é: " + highP);
		s.close();
	}
}
