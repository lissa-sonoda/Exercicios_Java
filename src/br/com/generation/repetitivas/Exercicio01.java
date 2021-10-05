		/*
		 * 1. Informar todos os números de 1000 a 1999 que 
		 * quando divididos por 11 obtemos resto = 5. (FOR)
		 * 
		 * @author Helen Lissa Sonoda
		 * Date: 05/10/2021
		 */

package br.com.generation.repetitivas;

public class Exercicio01 {

	public static void main(String[] args) {
		
		int i, cont = 0;
		
		for(i = 1000; i <= 1999; i++) {
			if(i % 11 == 5) {
				System.out.println(i + "\n");
				cont++;
			}
		}
		System.out.println("Existem: " + cont + " números.");
	}
}
