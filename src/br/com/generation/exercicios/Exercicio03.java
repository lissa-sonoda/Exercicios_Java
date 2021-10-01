package br.com.generation.exercicios;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		/*
		 * 3. Fa�a um sistema que leia o tempo de dura��o de um evento 
		 * em uma f�brica expressa em segundos e mostre-o expresso em 
		 * horas, minutos e segundos.
		 * 
		 * @author Helen Lissa Sonoda
		 * Date: 01/10/2021
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int sec, min, hours, calcMin, restSec;
		
		System.out.println("Digite a dura��o de um evento em segundos: ");
		sec = sc.nextInt();
		
		sc.close();
		
		//c�lculo
		calcMin = sec / 60;
		restSec = sec % 60;
		hours = calcMin / 60;
		min = calcMin % 60;
		
		System.out.println("\nA dura��o do evento � de: " + 
							hours + " horas " + 
							min + " minutos " + 
							restSec + " segundos. \n");
	}
}