		/*
		 * 4. Fa�a um programa em que permita a entrada de um 
		 * n�mero qualquer e exiba se este n�mero � par ou �mpar. 
		 * Se for par exiba tamb�m a raiz quadrada do mesmo; 
		 * se for �mpar exiba o n�mero elevado ao quadrado.
		 * 
		 * @author Helen Lissa Sonoda
		 * Date: 04/10/2021
		 */

package br.com.generation.condicionais;

import javax.swing.JOptionPane;

public class Exercicio04 {
	
	public static void main(String[] args) {
		
		int num = 0;
		double sqr, pow;
		
		num = Integer.parseInt(JOptionPane.showInputDialog("Entre com um n�mero inteiro:"));
		if(num % 2 == 0) {
			sqr = Math.sqrt(num);
			JOptionPane.showMessageDialog(null, "O n�mero � par. \nE sua raiz quadrada �: " + 
					sqr, "Resultado", JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);
		}
		else {
			pow = Math.pow(num, 2.0);
			JOptionPane.showMessageDialog(null, "O n�mero � �mpar. \nE elevado ao quadrado �: " + 
					pow, "Resultado", JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);
		}
	}
}
