		/*
		 * 4. Faça um programa em que permita a entrada de um 
		 * número qualquer e exiba se este número é par ou ímpar. 
		 * Se for par exiba também a raiz quadrada do mesmo; 
		 * se for ímpar exiba o número elevado ao quadrado.
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
		
		num = Integer.parseInt(JOptionPane.showInputDialog("Entre com um número inteiro:"));
		if(num % 2 == 0) {
			sqr = Math.sqrt(num);
			JOptionPane.showMessageDialog(null, "O número é par. \nE sua raiz quadrada é: " + 
					sqr, "Resultado", JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);
		}
		else {
			pow = Math.pow(num, 2.0);
			JOptionPane.showMessageDialog(null, "O número é ímpar. \nE elevado ao quadrado é: " + 
					pow, "Resultado", JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);
		}
	}
}
