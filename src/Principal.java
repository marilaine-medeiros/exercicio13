//13) Faça um algoritmo que leia 20 números e, ao final, escreva quantos estão entre 0 e 100.

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int quantidade = 0;
        int i = 1; // contador de iterações

        while (i <= 20) {
            System.out.println(" Digite o " + i + " ° número: ");
            int numero = scanner.nextInt();
// Verifica se o número está entre 0 e 100
            if (numero >= 0 && numero <= 100) {
                quantidade++;

            }
            i++;

           }
        System.out.println(" Quantidade de números entre 0 e 100: " + quantidade);
        scanner.close();

    }
}
