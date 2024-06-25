package ListaJava;

import java.util.Scanner;

public class Exercicio17 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantidade = 20;
        int contador = 0;

        for (int i = 1; i <= quantidade; i++) {
            System.out.print("Digite a idade da pessoa " + i + ": ");
            int idade = scanner.nextInt();
            if (idade >= 18) {
                contador++;
            }
        }

        System.out.println("Número de pessoas maiores de idade: " + contador);

        scanner.close();
    }
}
