		/*
		 * 1. Fa�a um programa que receba tr�s inteiros e 
		 * diga qual deles � o maior.
		 * 
		 * @author Helen Lissa Sonoda
		 * Date: 04/10/2021
		 */

package br.com.generation.condicionais;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1, num2, num3, highNum = 0;
		
		System.out.println("Digite o 1� n�mero: ");
		num1 = sc.nextInt();
		
		System.out.println("Digite o 2� n�mero: ");
		num2 = sc.nextInt();
		
		System.out.println("Digite o 3� n�mero: ");
		num3 = sc.nextInt();
		
		if(num1 > num2 && num1 > num3) {
			highNum = num1;
		} else if (num2 > num3) {
			highNum = num2;	
		} else {
			highNum = num3;
		}
		
		System.out.println("\nO maior n�mero �: " + highNum);
		sc.close();
	}
}
