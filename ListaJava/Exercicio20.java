package ListaJava;

import java.util.Scanner;

public class Exercicio20 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantidade = 20;
        int contador = 0;

        for (int i = 1; i <= quantidade; i++) {
            System.out.print("Digite o n�mero " + i + ": ");
            int numero = scanner.nextInt();
            if (numero > 8) {
                contador++;
            }
        }

        System.out.println("N�mero de n�meros maiores que 8: " + contador);

        scanner.close();
    }
}
