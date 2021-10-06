		/*
		 * 4. Crie um programa que receba valores do usuário para preencher uma
		 * matriz 3X3, e em seguida, exiba a soma dos valores dela e a soma dos 
		 * valores da primeira diagonal, ou seja, diagonal principal.
		 * 
		 * @author Helen Lissa Sonoda
		 * Date: 06/10/2021
		 */

package br.com.generation.vetores;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int [][] matriz = new int [3][3];
		int row, col, somaT = 0, somaD = 0;
		
		for(row = 0; row < matriz.length; row++) {			//linha
			for(col = 0; col < matriz[row].length; col++) { //coluna
				System.out.println("Digite o nº da posição " + row + ", " + col + ": ");
				matriz[row][col] = s.nextInt();
				
				somaT += matriz[row][col];
			}
		}
		somaD = matriz[0][0] + matriz[1][1] + matriz[2][2];
		
		System.out.println("\n******** Matriz ********\n");
		
		for(row = 0; row < matriz.length; row++) {
			for(col = 0; col < matriz[row].length; col++) {
				System.out.print(matriz[row][col] + "  ");
			}
			System.out.println();
		}
		
		System.out.println("\nA soma total é de: " + somaT);
		System.out.println("A soma da diagonal é de: " + somaD);
	}
}
