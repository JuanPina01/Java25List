package ListaJava;

import java.util.Scanner;

public class Exercicio25 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int soma = 0;
        int contador = 0;
        int numero;

        do {
            System.out.print("Digite um número (negativo para encerrar): ");
            numero = scanner.nextInt();
            if (numero >= 0) {
                soma += numero;
                contador++;
            }
        } while (numero >= 0 && contador < 10); // Encerra após 10 números ou número negativo

        System.out.println("A soma dos números digitados é: " + soma);

        scanner.close();
    }
}
