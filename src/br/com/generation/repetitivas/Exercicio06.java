		/*
		 * 6. Escrever um programa que receba vários números inteiros no 
		 * teclado. E no final imprimir a média dos números múltiplos de 3. 
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
			num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
			if(num != 0) {
				if(num % 3 == 0) {
					cont++;
					soma += num;
					media = (soma / cont);
				}
			}
		} while(num != 0);
		
		JOptionPane.showMessageDialog(null, "A média dos números múltiplos de 3 é: " + 
					media, "Resultado - Aviso", JOptionPane.INFORMATION_MESSAGE);
	}
}
