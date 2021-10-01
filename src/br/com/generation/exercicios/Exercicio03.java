package br.com.generation.exercicios;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		/*
		 * 3. Faça um sistema que leia o tempo de duração de um evento 
		 * em uma fábrica expressa em segundos e mostre-o expresso em 
		 * horas, minutos e segundos.
		 * 
		 * @author Helen Lissa Sonoda
		 * Date: 01/10/2021
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int sec, min, hours, calcMin, restSec;
		
		System.out.println("Digite a duração de um evento em segundos: ");
		sec = sc.nextInt();
		
		sc.close();
		
		//cálculo
		calcMin = sec / 60;
		restSec = sec % 60;
		hours = calcMin / 60;
		min = calcMin % 60;
		
		System.out.println("\nA duração do evento é de: " + 
							hours + " horas " + 
							min + " minutos " + 
							restSec + " segundos. \n");
	}
}