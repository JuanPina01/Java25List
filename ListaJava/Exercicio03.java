package ListaJava;

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o saldo médio no último ano: ");
        double saldoMedio = scanner.nextDouble();

        double credito = calcularCredito(saldoMedio);

        System.out.printf("Saldo médio: R$ %.2f\n", saldoMedio);
        System.out.printf("Crédito especial: R$ %.2f\n", credito);

        scanner.close();
    }

    public static double calcularCredito(double saldoMedio) {
        if (saldoMedio <= 200) {
            return saldoMedio * 0.1;
        } else if (saldoMedio > 200 && saldoMedio <= 300) {
            return saldoMedio * 0.2;
        } else if (saldoMedio > 300 && saldoMedio <= 400) {
            return saldoMedio * 0.3;
        } else if (saldoMedio > 400) {
            return saldoMedio * 0.4;
        } else {
            return 0;
        }
    }
}
