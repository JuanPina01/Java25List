package ListaJava;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um n�mero inteiro: ");
        int numero = scanner.nextInt();

        if (numero % 10 == 0) {
            System.out.println(numero + " � divis�vel por 10.");
        } else if (numero % 5 == 0) {
            System.out.println(numero + " � divis�vel por 5.");
        } else if (numero % 2 == 0) {
            System.out.println(numero + " � divis�vel por 2.");
        } else {
            System.out.println(numero + " n�o � divis�vel por 10, 5 ou 2.");
        }

        scanner.close();
    }
}
