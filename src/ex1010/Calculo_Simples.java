package ex1010;

import java.util.Scanner;

public class Calculo_Simples {
    public static void main(String[] args){

        Scanner leitura = new Scanner(System.in);
        int Cod = leitura.nextInt();
        int Qtd = leitura.nextInt();
        double Valor = leitura.nextDouble();

        int Cod2 = leitura.nextInt();
        int Qtd2 = leitura.nextInt();
        double Valor2 = leitura.nextDouble();

        double Pagar = (Qtd * Valor) + (Qtd2 * Valor2);

        System.out.printf("VALOR A PAGAR: R$ %.2f%n",Pagar );

    }
}
