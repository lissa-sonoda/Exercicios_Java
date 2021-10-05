		/*
		 * 6. Escrever um programa que receba v�rios n�meros inteiros no 
		 * teclado. E no final imprimir a m�dia dos n�meros m�ltiplos de 3. 
		 * Para sair digitar 0(zero).(DO...WHILE)
		 * 
		 * @author Helen Lissa Sonoda
		 * Date: 05/10/2021
		 */

package br.com.generation.repetitivas;

import javax.swing.JOptionPane;

public class Exercicio06 {

	public static void main(String[] args) {
		
		int num, soma = 0, cont = 0;
		double media = 0;
		
		do {
			num = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero"));
			if(num != 0) {
				if(num % 3 == 0) {
					cont++;
					soma += num;
					media = (soma / cont);
				}
			}
		} while(num != 0);
		
		JOptionPane.showMessageDialog(null, "A m�dia dos n�meros m�ltiplos de 3 �: " + 
					media, "Resultado - Aviso", JOptionPane.INFORMATION_MESSAGE);
	}
}
