package ex1013;

import java.io.IOException;
import java.util.Scanner;

public class O_Maior {
    public static void main(String[] args) throws IOException {

        Scanner leitura = new Scanner(System.in);
        int a = leitura.nextInt();
        int b = leitura.nextInt();
        int c = leitura.nextInt();

        int MaiorAB = (a+b+ Math.abs(a-b))/2;
        int MAIOR = (MaiorAB+c+ Math.abs(MaiorAB-c))/2;

        System.out.println(MAIOR+" eh o maior");

    }
}

