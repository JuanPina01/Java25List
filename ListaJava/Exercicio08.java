package ListaJava;

import java.util.Scanner;

public class Exercicio08 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Porcentagem do IPI a ser acrescido: ");
        double ipi = scanner.nextDouble();

        System.out.print("Código da peça 1: ");
        int codigo1 = scanner.nextInt();
        System.out.print("Valor unitário da peça 1: ");
        double valor1 = scanner.nextDouble();
        System.out.print("Quantidade de peças 1: ");
        int quantidade1 = scanner.nextInt();

        System.out.print("Código da peça 2: ");
        int codigo2 = scanner.nextInt();
        System.out.print("Valor unitário da peça 2: ");
        double valor2 = scanner.nextDouble();
        System.out.print("Quantidade de peças 2: ");
        int quantidade2 = scanner.nextInt();

        double valorTotal = calcularValorTotal(ipi, valor1, quantidade1, valor2, quantidade2);

        System.out.printf("Valor total a ser pago: R$ %.2f\n", valorTotal);

        scanner.close();
    }

    public static double calcularValorTotal(double ipi, double valor1, int quantidade1, double valor2, int quantidade2) {
        double totalSemIPI = (valor1 * quantidade1) + (valor2 * quantidade2);
        double totalComIPI = totalSemIPI * (ipi / 100 + 1);
        return totalComIPI;
    }
}
