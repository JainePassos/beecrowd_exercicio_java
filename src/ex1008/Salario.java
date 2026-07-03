package ex1008;

import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        int Fun = leitura.nextInt();
        int Horas = leitura.nextInt();
        double ValHo = leitura.nextDouble();

        double Salary = Horas * ValHo;

        System.out.printf("NUMBER = %d%nSALARY = U$ %.2f%n",Fun,Salary);

    }
}
