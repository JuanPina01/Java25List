package ListaJava;

import java.util.Scanner;

public class Exercicio11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome do vendedor: ");
        String nome = scanner.nextLine();
        System.out.print("Sal�rio fixo do vendedor: ");
        double salarioFixo = scanner.nextDouble();
        System.out.print("Total de vendas efetuadas pelo vendedor: ");
        double totalVendas = scanner.nextDouble();

        double comissao = totalVendas * 0.15; // 15% de comiss�o
        double salarioFinal = salarioFixo + comissao;

        System.out.println("Nome: " + nome);
        System.out.printf("Sal�rio fixo: R$ %.2f\n", salarioFixo);
        System.out.printf("Sal�rio final no m�s: R$ %.2f\n", salarioFinal);

        scanner.close();
    }
}
