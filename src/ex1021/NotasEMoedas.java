package ex1021;

import java.io.IOException;
import java.util.Scanner;

public class NotasEMoedas {
    public static void main(String[] args) throws IOException {

        Scanner leitura = new Scanner(System.in);

        double valor = leitura.nextDouble();

        int centavos = (int) Math.round(valor * 100);

        System.out.println("NOTAS:");
        System.out.println(centavos/10000 + " nota(s) de R$ 100.00");
        centavos %= 10000;
        System.out.println(centavos/5000 + " nota(s) de R$ 50.00");
        centavos %= 5000;
        System.out.println(centavos/2000 + " nota(s) de R$ 20.00");
        centavos %= 2000;
        System.out.println(centavos/1000 + " nota(s) de R$ 10.00");
        centavos %= 1000;
        System.out.println(centavos/500 + " nota(s) de R$ 5.00");
        centavos %= 500;
        System.out.println(centavos/200 + " nota(s) de R$ 2.00");
        centavos %= 200;

        System.out.println("MOEDAS:");
        System.out.println(centavos/100 + " moeda(s) de R$ 1.00");
        centavos %= 100;
        System.out.println(centavos/50 + " moeda(s) de R$ 0.50");
        centavos %= 50;
        System.out.println(centavos/25 + " moeda(s) de R$ 0.25");
        centavos %= 25;
        System.out.println(centavos/10 + " moeda(s) de R$ 0.10");
        centavos %= 10;
        System.out.println(centavos/5 + " moeda(s) de R$ 0.05");
        centavos %= 5;
        System.out.println(centavos/1 + " moeda(s) de R$ 0.01");

    }
}
