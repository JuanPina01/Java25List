package ListaJava;

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Mostrando opções disponíveis
        System.out.println("Prato: 1 - Vegetariano, 2 - Peixe, 3 - Frango, 4 - Carne");
        System.out.println("Sobremesa: 1 - Abacaxi, 2 - Sorvete diet, 3 - Mousse diet, 4 - Mousse chocolate");
        System.out.println("Bebida: 1 - Chá, 2 - Suco de laranja, 3 - Suco de melão, 4 - Refrigerante diet");

        // Solicitando escolhas do usuário
        System.out.print("Escolha o prato: ");
        int prato = scanner.nextInt();
        System.out.print("Escolha a sobremesa: ");
        int sobremesa = scanner.nextInt();
        System.out.print("Escolha a bebida: ");
        int bebida = scanner.nextInt();

        // Calculando calorias totais
        int caloriasPrato = calcularCaloriasPrato(prato);
        int caloriasSobremesa = calcularCaloriasSobremesa(sobremesa);
        int caloriasBebida = calcularCaloriasBebida(bebida);

        int caloriasTotais = caloriasPrato + caloriasSobremesa + caloriasBebida;

        // Exibindo o resultado
        System.out.println("A quantidade total de calorias da refeição é: " + caloriasTotais);

        scanner.close();
    }

    // Métodos auxiliares para calcular calorias
    public static int calcularCaloriasPrato(int escolha) {
        switch (escolha) {
            case 1:
                return 180; // Calorias do vegetariano
            case 2:
                return 230; // Calorias do peixe
            case 3:
                return 250; // Calorias do frango
            case 4:
                return 350; // Calorias da carne
            default:
                return 0; // Opção inválida
        }
    }

    public static int calcularCaloriasSobremesa(int escolha) {
        switch (escolha) {
            case 1:
                return 75; // Calorias do abacaxi
            case 2:
                return 110; // Calorias do sorvete diet
            case 3:
                return 170; // Calorias do mousse diet
            case 4:
                return 200; // Calorias do mousse chocolate
            default:
                return 0; // Opção inválida
        }
    }

    public static int calcularCaloriasBebida(int escolha) {
        switch (escolha) {
            case 1:
                return 20; // Calorias do chá
            case 2:
                return 70; // Calorias do suco de laranja
            case 3:
                return 100; // Calorias do suco de melão
            case 4:
                return 10; // Calorias do refrigerante diet
            default:
                return 0; // Opção inválida
        }
    }
}
