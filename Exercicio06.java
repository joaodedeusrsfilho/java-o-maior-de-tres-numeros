package com.junior.curso_java_basico.aula15;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		// Faca um programa que pegue 3 numeros e mostre o maior deles
		Scanner ler = new Scanner(System.in);
		int numero1, numero2, numero3 = 0;
		
		System.out.println("Digite o primeiro numero: ");
		numero1 = ler.nextInt();
		
		System.out.println("Digite o segundo numero: ");
		numero2 = ler.nextInt();
		
		System.out.println("Digite o terceiro numero: ");
		numero3 = ler.nextInt();
		
		if (numero1 >= numero2 && numero1 >= numero3) {
			System.out.println(numero1 + " E maior");
		} else if (numero2 >= numero1 && numero2 >= numero3) {
			System.out.println(numero2 + " E maior");
		} else if (numero3 >= numero1 && numero3 >= numero2) {
			System.out.println(numero3 + " E maior");
		}
		
	}

}
