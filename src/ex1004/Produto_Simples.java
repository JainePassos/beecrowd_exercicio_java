package ex1004;

import java.io.IOException;
import java.util.Scanner;

public class Produto_Simples {
    public static void main(String[] args) throws IOException {

        Scanner leitura = new Scanner(System.in);
        int V1 = leitura.nextInt();
        int V2 = leitura.nextInt();

        int PROD = V1 * V2;

        System.out.println("PROD = " + PROD);
    }
}
