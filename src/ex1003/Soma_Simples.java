package ex1003;

import java.io.IOException;
import java.util.Scanner;

public class Soma_Simples {

    public static void main(String[] args) throws IOException {

        Scanner leitura = new Scanner(System.in);
        int A = leitura.nextInt();
        int B = leitura.nextInt();

        int SOMA = A + B;

        System.out.println("SOMA = " + SOMA);

    }
}
