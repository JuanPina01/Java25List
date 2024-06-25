package ListaJava;

import java.util.Scanner;

public class Exercicio21 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da compra: ");
        double valorCompra = scanner.nextDouble();

        double valorPrestacao = valorCompra / 5;

        System.out.printf("Valor de cada prestação: R$ %.2f\n", valorPrestacao);

        scanner.close();
    }
}
