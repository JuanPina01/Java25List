package ListaJava;

import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o saldo atual: ");
        double saldo = scanner.nextDouble();

        double saldoReajustado = saldo * 1.015; // 1.5% de reajuste

        System.out.printf("Saldo reajustado: R$ %.2f\n", saldoReajustado);

        scanner.close();
    }
}
