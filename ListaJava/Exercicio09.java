package ListaJava;

import java.util.Scanner;

public class Exercicio09 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double salarioMinimo = 1212.00;

        System.out.print("Digite o salário do usuário: ");
        double salarioUsuario = scanner.nextDouble();

        double quantSalariosMinimos = salarioUsuario / salarioMinimo;

        System.out.printf("O usuário ganha %.2f salários mínimos.\n", quantSalariosMinimos);

        scanner.close();
    }
}

