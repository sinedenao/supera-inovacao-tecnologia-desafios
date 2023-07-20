package main.com.desafios.desafio1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Desafio1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Favor inserir numeros inteiros:\n");
		int qtdeInteiros = scanner.nextInt();
		List<Integer> pares = new ArrayList<>();
		List<Integer> impares = new ArrayList<>();

		// Verifica se é par ou impar e coloca na Lista.
		for (int i = 0; i < qtdeInteiros; i++) {
			int inteiro = scanner.nextInt();
			if (inteiro % 2 == 0) {
				pares.add(inteiro);
			} else {
				impares.add(inteiro);
			}
		}
		scanner.close();

		//Ordena o array de numeros pares de forma crescente e impares de forma decrescente
		Collections.sort(pares);
		Collections.sort(impares, Comparator.reverseOrder());

		// Imprimir os números pares
		for (int par : pares) {
			System.out.println(par);
		}

		// Imprimir os números ímpares
		for (int impar : impares) {
			System.out.println(impar);
		}
	}	
}
