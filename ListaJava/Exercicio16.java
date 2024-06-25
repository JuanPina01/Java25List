package ListaJava;

import java.util.Scanner;

public class Exercicio16 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantidade = 20;
        int soma = 0;

        for (int i = 1; i <= quantidade; i++) {
            System.out.print("Digite a idade da pessoa " + i + ": ");
            int idade = scanner.nextInt();
            soma += idade;
        }

        double media = (double) soma / quantidade;

        System.out.printf("A média das idades das 20 pessoas é: %.2f\n", media);

        scanner.close();
    }
}
