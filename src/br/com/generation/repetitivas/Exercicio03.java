		/*
		 * 3. Solicitar a idade de várias pessoas e imprimir: 
		 * Total de pessoas com menos de 21 anos. 
		 * Total de pessoas com mais de 50 anos. 
		 * O programa termina quando idade for =-99. (WHILE)
		 * 
		 * @author Helen Lissa Sonoda
		 * Date: 05/10/2021
		 */

package br.com.generation.repetitivas;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		int idade = 0, menor = 0, maior = 0;
		
		while(idade != -99) {
			
			System.out.println("Digite sua idade: ");
			idade = s.nextInt();
			
			if(idade >= 0 && idade <= 21) {
				menor++;
			}
			else if(idade >= 50 && idade <= 120) {
				maior++;
			}
		}
		System.out.println("\nPessoas com menos de 21 anos: " + menor);
		System.out.println("Pessoas com mais de 50 anos: " + maior);
		s.close();
	}

}
