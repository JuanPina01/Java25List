package ListaJava;

import java.util.Arrays;

public class Exercicio04 {

    public static void main(String[] args) {
        int a = 15, b = 7, c = 21;

        int[] valores = {a, b, c};
        Arrays.sort(valores);

        System.out.println("Valores em ordem descendente:");
        for (int i = valores.length - 1; i >= 0; i--) {
            System.out.println(valores[i]);
        }
    }
}
