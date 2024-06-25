package ListaJava;

import java.util.Scanner;

public class Exercicio25 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int soma = 0;
        int contador = 0;
        int numero;

        do {
            System.out.print("Digite um n�mero (negativo para encerrar): ");
            numero = scanner.nextInt();
            if (numero >= 0) {
                soma += numero;
                contador++;
            }
        } while (numero >= 0 && contador < 10); // Encerra ap�s 10 n�meros ou n�mero negativo

        System.out.println("A soma dos n�meros digitados �: " + soma);

        scanner.close();
    }
}
