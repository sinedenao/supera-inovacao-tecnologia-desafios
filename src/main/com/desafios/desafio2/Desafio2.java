package main.com.desafios.desafio2;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Recebe string
        System.out.println("Digite o valor:");
        String numeroStr = scanner.nextLine();

		scanner.close();

        BigDecimal qtde = new BigDecimal(numeroStr.replace(",", "."));

        int[] notas = {100, 50, 20, 10, 5, 2};
        BigDecimal[] moedas = {new BigDecimal("1.00"), new BigDecimal("0.50"),
                new BigDecimal("0.25"), new BigDecimal("0.10"), new BigDecimal("0.05"), new BigDecimal("0.01")};

        System.out.println("Quantidade de Notas:");
        boolean usouNota = false;
        for (int i = 0; i < notas.length; i++) {
            int quantidadeNotas = qtde.divide(new BigDecimal(notas[i]), 0, RoundingMode.DOWN).intValue();
            if(quantidadeNotas!=0) {
            	System.out.println(quantidadeNotas + " nota(s) de R$ " + notas[i] + ".00");
            	usouNota = true;
            }
            qtde = qtde.remainder(new BigDecimal(notas[i]));
        }
        if(usouNota == false)
        {
        	System.out.println("Não foram utilizadas notas.");
        }
        System.out.println("Quantidade de Moeda:");
        boolean usouMoeda = false;
        for (int i = 0; i < moedas.length; i++) {
            int quantidadeMoedas = qtde.divide(moedas[i], 2, RoundingMode.DOWN).intValue();
            if(quantidadeMoedas!=0) {	
            	System.out.println(quantidadeMoedas + " moeda(s) de R$ " + moedas[i]);
            	usouMoeda = true;
            }
            qtde = qtde.remainder(moedas[i]);
        }
        if(usouMoeda == false)
        {
        	System.out.println("Não foram utilizadas moedas.");
        }
    }
}
