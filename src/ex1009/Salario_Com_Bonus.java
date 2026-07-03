package ex1009;

import java.util.Scanner;

public class Salario_Com_Bonus {
    public static void main(String[] args){

        Scanner leitura = new Scanner(System.in);
        String Nome = leitura.next();
        double Salario = leitura.nextDouble();
        double Vendas = leitura.nextDouble();

        double TOTAL = Salario + (Vendas * 15/100);

        System.out.printf("TOTAL = R$ %.2f%n", TOTAL );

    }
}
