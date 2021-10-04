		/*
		 * 2. Faça um programa que entre com três números e 
		 * coloque em ordem crescente.
		 * 
		 * @author Helen Lissa Sonoda
		 * Date: 04/10/2021
		 */

package br.com.generation.condicionais;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a, b, c;
		
		System.out.println("Digite o 1º número: ");
		a = sc.nextInt();
		
		System.out.println("Digite o 2º número: ");
		b = sc.nextInt();
		
		System.out.println("Digite o 3º número: ");
		c = sc.nextInt();
		
		if (a > b && b > c){
			System.out.println("\nOs números em ordem crescente são: " + c + ", " + b + ", " + a);
		
		} else if (a > c && c > b){
			System.out.println("\nOs números em ordem crescente são: " + b + ", " + c + ", " + a);
        
		} else if (b > a && a > c){
			System.out.println("\nOs números em ordem crescente são: " + c + ", " + a + ", " + b);
            
		} else if (b > c && c > a){
			System.out.println("\nOs números em ordem crescente são: " + a + ", " + c + ", " + b);
            
		} else if (c > b && b > a){
			System.out.println("\nOs números em ordem crescente são: " + a + ", " + b + ", " + c);
            
		} else if (c > a && a > b){
			System.out.println("\nOs números em ordem crescente são: " + b + ", " + a + ", " + c);
        }
		sc.close();
	}

}
