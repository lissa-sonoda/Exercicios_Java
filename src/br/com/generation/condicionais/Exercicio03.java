		/*
		 * 3. Faça um programa que receba a idade de uma pessoa 
		 * e mostre na saída em qual categoria ela se encontra:
		 * 10-14 infantil
		 * 15-17 juvenil
		 * 18-25 adulto
		 * 
		 * @author Helen Lissa Sonoda
		 * Date: 04/10/2021
		 */

package br.com.generation.condicionais;

import javax.swing.JOptionPane;

public class Exercicio03 {

	public static void main(String[] args) {
		
		int age = 0;
		
		age = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: "));
		if(age >= 10 && age <= 14) {
			JOptionPane.showMessageDialog(null, "Você se encaixa na categoria Infantil.", 
					"Resultado", JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);
		}
		else if(age >= 15 && age <= 17) {
			JOptionPane.showMessageDialog(null, "Você se encaixa na categoria Juvenil.", 
					"Resultado", JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);
		}
		else if(age >= 18 && age <= 25) {
			JOptionPane.showMessageDialog(null, "Você se encaixa na categoria Adulto.", 
					"Resultado", JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);
		}
		else {
			JOptionPane.showMessageDialog(null, "Essa idade não se encaixa em nenhuma categoria.", 
					"Resultado", JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);
		}
	}
}
