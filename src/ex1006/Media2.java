package ex1006;

import java.io.IOException;
import java.util.Scanner;

public class Media2 {
    public static void main(String[] args) throws IOException {

        Scanner leitura = new Scanner(System.in);
        double A = leitura.nextDouble();
        double B = leitura.nextDouble();
        double C = leitura.nextDouble();

        double media = (A * 2 + B * 3 + C * 5 )/10;

        System.out.printf("MEDIA = %.1f%n",media);

    }
}
