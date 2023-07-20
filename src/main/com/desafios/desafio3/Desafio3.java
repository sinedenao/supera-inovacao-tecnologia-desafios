package main.com.desafios.desafio3;

import java.util.Scanner;

public class Desafio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade:");
        int n = scanner.nextInt();
        System.out.println("Digite os valores alvo:");
        int k = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Digite os valores do array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
		scanner.close();

        int count = 0;

        // Loop para percorrer todos os pares possíveis de elementos
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                // Verificar se a diferença entre os elementos é igual a k
                if (Math.abs(arr[i] - arr[j]) == k) {
                    count++;
                }
            }
        }
        // Imprimir a quantidade de numeros pares
        System.out.println(count);
    }
}
