package ex1007;

import java.util.Scanner;

public class Diferenca {
    public static void main(String[] args){

        Scanner leitura = new Scanner(System.in);
        int A = leitura.nextInt();
        int B = leitura.nextInt();
        int C = leitura.nextInt();
        int D = leitura.nextInt();

        int diferenca = (A * B - C * D );

        System.out.println("DIFERENCA = " + diferenca);

    }
}
