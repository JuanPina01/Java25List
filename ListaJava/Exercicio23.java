package ListaJava;

import java.util.Scanner;

public class Exercicio23 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantidade = 20;
        int contador0a100 = 0;
        int contador101a200 = 0;
        int contadorMais200 = 0;

        for (int i = 1; i <= quantidade; i++) {
            System.out.print("Digite o número " + i + ": ");
            int numero = scanner.nextInt();
            if (numero >= 0 && numero <= 100) {
                contador0a100++;
            } else if (numero >= 101 && numero <= 200) {
                contador101a200++;
            } else if (numero > 200) {
                contadorMais200++;
            }
        }

        System.out.println("Quantidade de números entre 0 e 100: " + contador0a100);
        System.out.println("Quantidade de números entre 101 e 200: " + contador101a200);
        System.out.println("Quantidade de números maiores que 200: " + contadorMais200);

        scanner.close();
    }
}
