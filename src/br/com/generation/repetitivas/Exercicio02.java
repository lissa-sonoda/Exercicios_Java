		/*
		 * 2. Ler 10 números e imprimir quantos são pares 
		 * e quantos são ímpares. (FOR)
		 * 
		 * @author Helen Lissa Sonoda
		 * Date: 05/10/2021
		 */

package br.com.generation.repetitivas;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int i, num, par = 0, impar = 0;
		
		for(i = 0; i <= 9; i++) {
			System.out.println("Digite um número: ");
			num = sc.nextInt();
			
			if(num % 2 == 0) {
				par++;
			}
			else {
				impar++;
			}
		}
		
		System.out.println("\nForam inseridos: " + par + " número(s) par(es).");
		System.out.println("Foram inseridos: " + impar + " número(s) ímpar(es).");
		sc.close();
	}
}
