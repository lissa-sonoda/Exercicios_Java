		/*
		 * 2. Um dado � lan�ado 10 vezes e o valor correspondente � anotado. Fa�a um programa que 
		 * gere um vetor com os lan�amentos, escreva esse vetor. A seguir determine e imprima a 
		 * m�dia aritm�tica dos lan�amentos, contabilize e apresente tamb�m quantas foram as 
		 * ocorr�ncias da maior pontua��o.
		 * 
		 * @author Helen Lissa Sonoda
		 * Date: 06/10/2021
		 */

package br.com.generation.vetores;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int [] dado = new int [10];
		int i;
		double soma = 0, media = 0;
		int highP = 0, cont = 0;
		
		for(i = 0; i < dado.length; i++) {
			System.out.println("Digite o " + (i+1) + "� valor:");
			dado[i] = s.nextInt();
			
			while(dado[i] < 1 || dado[i] > 6) {
				System.out.println("Valor inv�lido.\n");
				System.out.println("Digite o " + (i+1) + "� valor:");
				dado[i] = s.nextInt();
			}
			soma += dado[i];
			if(dado[i] > highP) {
				highP = dado[i];
			}
		}
		media = soma/dado.length;
		System.out.println();
		
		for(i = 0; i < dado.length; i++) {
			if(dado[i] == highP) {
				cont++;
			}
			System.out.println("O " + (i+1) + "� valor �: " + dado[i]);
		}
		
		System.out.println("\nA m�dia calculada �: " + media);
		System.out.println("\nA quantidade de ocorr�ncias da maior pontua��o " + highP + " � de " + cont + " vez(es).");
	}
}
