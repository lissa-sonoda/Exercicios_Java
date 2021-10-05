		/*
		 * 5. Crie um programa que leia um n�mero do teclado at� 
		 * que encontre um n�mero igual a zero. No final, mostre 
		 * a soma dos n�meros digitados.(DO...WHILE)
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
			num = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero: "));
			soma += num;
		}while(num != 0);
		
		JOptionPane.showMessageDialog(null, "O resultado da soma � de: " + 
				soma, "Resultado", JOptionPane.INFORMATION_MESSAGE);
	}
}
