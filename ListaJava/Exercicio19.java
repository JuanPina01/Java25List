package ListaJava;

import java.util.Scanner;

public class Exercicio19 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a cota��o do d�lar: ");
        double cotacaoDolar = scanner.nextDouble();
        System.out.print("Digite a quantidade de d�lares: ");
        double quantidadeDolares = scanner.nextDouble();

        double valorEmReais = quantidadeDolares * cotacaoDolar;

        System.out.printf("O valor em reais � R$ %.2f\n", valorEmReais);

        scanner.close();
    }
}
