package ListaJava;

import java.util.Scanner;

public class Exercicio18 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantidade = 10;
        String nomeMaisNova = "";
        int idadeMaisNova = Integer.MAX_VALUE;

        for (int i = 1; i <= quantidade; i++) {
            System.out.print("Digite o nome da pessoa " + i + ": ");
            String nome = scanner.nextLine();
            System.out.print("Digite a idade da pessoa " + i + ": ");
            int idade = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do scanner

            if (idade < idadeMaisNova) {
                idadeMaisNova = idade;
                nomeMaisNova = nome;
            }
        }

        System.out.println("A pessoa mais nova é: " + nomeMaisNova);

        scanner.close();
    }
}
