package ListaJava;

import java.util.Scanner;

public class Exercicio09 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double salarioMinimo = 1212.00;

        System.out.print("Digite o sal�rio do usu�rio: ");
        double salarioUsuario = scanner.nextDouble();

        double quantSalariosMinimos = salarioUsuario / salarioMinimo;

        System.out.printf("O usu�rio ganha %.2f sal�rios m�nimos.\n", quantSalariosMinimos);

        scanner.close();
    }
}

