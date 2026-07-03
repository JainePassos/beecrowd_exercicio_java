package ex1005;

import java.io.IOException;
import java.util.Scanner;

public class Media1 {

    public static void main(String[] args) throws IOException {

        Scanner leitura = new Scanner(System.in);

        double V1 = leitura.nextDouble();
        double V2 = leitura.nextDouble();

        double media = (V1 * 3.5 + V2 * 7.5) / 11;

        System.out.printf("MEDIA = %.5f%n", media);
    }
}
