		/*
		 * 3. Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
		 * a) Uma matriz M1 cujos elementos serão as somas dos elementos 
		 * de mesma posição das matrizes N1 e N2;
		 * 
		 * b) Uma matriz M2 cujos elementos serão as diferenças dos 
		 * elementos de mesma posição das matrizes N1 e N2.
		 * 
		 * @author Helen Lissa Sonoda
		 * Date: 06/10/2021
		 */

package br.com.generation.vetores;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		double [][] n1 = new double[4][6];
		double [][] n2 = new double[4][6];
		double [][] m1 = new double[4][6];
		double [][] m2 = new double[4][6];
		
		int row, col;
		
		// inserir valores de N1
		System.out.println("\n********** Digite a Matriz N1 **********\n");
		
		for(row = 0; row < n1.length; row++) {
			for(col = 0; col < n1[row].length; col++) {
				System.out.println("Digite o nº da posição " + row + ", " + col + ": ");
				n1[row][col] = s.nextDouble();
			}
		}
		
		// inserir valores de N2
		System.out.println("\n********** Digite a Matriz N2 **********\n");
		
		for(row = 0; row < n2.length; row++) {
			for(col = 0; col < n2[row].length; col++) {
				System.out.println("Digite o nº da posição " + row + ", " + col + ": ");
				n2[row][col] = s.nextDouble();
			}
		}
		
		// cálculo da soma -> M1
		for(row = 0; row < m1.length; row++) {
			for(col = 0; col < m1[row].length; col++) {
				m1[row][col] = n1[row][col] + n2[row][col];
			}
		}
		
		// cálculo da subtração -> M2
		for(row = 0; row < m2.length; row++) {
			for(col = 0; col < m2[row].length; col++) {
				m2[row][col] = n1[row][col] - n2[row][col];
			}
		}
		
		System.out.println("\n*************** Matriz N1 ***************\n");
		
		for(row = 0; row < n1.length; row++) {
			for(col = 0; col < n1[row].length; col++) {
				System.out.print(n1[row][col] + "  ");
			}
			System.out.println();
		}
		
		System.out.println("\n*************** Matriz N2 ***************\n");
		
		for(row = 0; row < n2.length; row++) {
			for(col = 0; col < n2[row].length; col++) {
				System.out.print(n2[row][col] + "  ");
			}
			System.out.println();
		}
		
		System.out.println("\n*************** Matriz M1 ***************\n");
		
		for(row = 0; row < m1.length; row++) {
			for(col = 0; col < m1[row].length; col++) {
				System.out.print(m1[row][col] + "  ");
			}
			System.out.println();
		}
		
		System.out.println("\n*************** Matriz M2 ***************\n");
		
		for(row = 0; row < m2.length; row++) {
			for(col = 0; col < m2[row].length; col++) {
				System.out.print(m2[row][col] + "  ");
			}
			System.out.println();
		}
		
	}
}
