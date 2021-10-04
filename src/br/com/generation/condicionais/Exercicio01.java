		/*
		 * 1. Faça um programa que receba três inteiros e 
		 * diga qual deles é o maior.
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
		
		System.out.println("Digite o 1º número: ");
		num1 = sc.nextInt();
		
		System.out.println("Digite o 2º número: ");
		num2 = sc.nextInt();
		
		System.out.println("Digite o 3º número: ");
		num3 = sc.nextInt();
		
		if(num1 > num2 && num1 > num3) {
			highNum = num1;
		} else if (num2 > num3) {
			highNum = num2;	
		} else {
			highNum = num3;
		}
		
		System.out.println("\nO maior número é: " + highNum);
		sc.close();
	}
}
