		/*
		 * 5. Crie um programa que leia um número do teclado até 
		 * que encontre um número igual a zero. No final, mostre 
		 * a soma dos números digitados.(DO...WHILE)
		 * 
		 * @author Helen Lissa Sonoda
		 * Date: 05/10/2021
		 */

package br.com.generation.repetitivas;

import javax.swing.JOptionPane;

public class Exercicio05 {

	public static void main(String[] args) {
			
		int num, soma = 0;
		
		do {
			num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
			soma += num;
		}while(num != 0);
		
		JOptionPane.showMessageDialog(null, "O resultado da soma é de: " + 
				soma, "Resultado", JOptionPane.INFORMATION_MESSAGE);
	}
}
