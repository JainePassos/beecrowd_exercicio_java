package ex1001;

import java.io.IOException;
import java.util.Scanner;

public class Extremamente_Basico_1001 {
    public static void main(String[] args) throws IOException {

        int A;
        int B;

        Scanner leitura = new Scanner(System.in);
        A = leitura.nextInt();
        B = leitura.nextInt();

        int X = A + B;

        System.out.println("X = " + X);

    }
}
