package br.com.generation.exercicios;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		
		/*
		 * 8. O custo ao consumidor de um carro novo � a soma do custo de 
		 * f�brica com a percentagem do distribuidor e dos impostos 
		 * (aplicados ao custo de f�brica). Supondo que a percentagem do 
		 * distribuidor seja de 28% e os impostos de 45%, escrever um sistema 
		 * que leia o custo de f�brica de um carro e escreva o custo ao consumidor.
		 * 
		 * @author Helen Lissa Sonoda
		 * Date: 01/10/2021
		 */
		
		Scanner sc = new Scanner(System.in);
		
		double costFact, costC, tax, dist;
		
		tax = 0.28;
		dist = 0.45;
		
		System.out.println("-----(Aten��o! Para valores reais utilize a v�rgula)-----" + 
			   "\n\nDigite o valor do carro a custo de f�brica: ");
		costFact = sc.nextDouble();
		
		sc.close();
		
		costC = costFact + (costFact * tax) + (costFact * dist);
		
		System.out.println("\nO valor do carro a custo de f�brica inserido � de: R$ " + 
							costFact);
		System.out.println("\nO custo de um carro novo ao consumidor � de: R$ " + 
							costC + "\n");
	}
}