package ListaJava;

import java.util.Scanner;

public class Exercicio14 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantidade = 10;
        int soma = 0;

        for (int i = 1; i <= quantidade; i++) {
            System.out.print("Digite o n�mero " + i + ": ");
            int numero = scanner.nextInt();
            soma += numero;
        }

        System.out.println("A soma dos 10 n�meros digitados �: " + soma);

        scanner.close();
    }
}
