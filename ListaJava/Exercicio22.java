package ListaJava;

import java.util.Scanner;

public class Exercicio22 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantidade = 20;
        int contador0a100 = 0;

        for (int i = 1; i <= quantidade; i++) {
            System.out.print("Digite o número " + i + ": ");
            int numero = scanner.nextInt();
            if (numero >= 0 && numero <= 100) {
                contador0a100++;
            }
        }

        System.out.println("Quantidade de números entre 0 e 100: " + contador0a100);

        scanner.close();
    }
}
