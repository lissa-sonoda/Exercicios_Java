		/*
		 * 2. Fa�a um programa que entre com tr�s n�meros e 
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
		
		System.out.println("Digite o 1� n�mero: ");
		a = sc.nextInt();
		
		System.out.println("Digite o 2� n�mero: ");
		b = sc.nextInt();
		
		System.out.println("Digite o 3� n�mero: ");
		c = sc.nextInt();
		
		if (a > b && b > c){
			System.out.println("\nOs n�meros em ordem crescente s�o: " + c + ", " + b + ", " + a);
		            
        } else if (a > c && c > b){
            System.out.println("\nOs n�meros em ordem crescente s�o: " + b + ", " + c + ", " + a);
            
        } else if (b > a && a > c){
            System.out.println("\nOs n�meros em ordem crescente s�o: " + c + ", " + a + ", " + b);
            
        } else if (b > c && c > a){
            System.out.println("\nOs n�meros em ordem crescente s�o: " + a + ", " + c + ", " + b);
            
        } else if (c > b && b > a){
            System.out.println("\nOs n�meros em ordem crescente s�o: " + a + ", " + b + ", " + c);
            
        } else if (c > a && a > b){
            System.out.println("\nOs n�meros em ordem crescente s�o: " + b + ", " + a + ", " + c);
        } 
		
		sc.close();
	}

}
