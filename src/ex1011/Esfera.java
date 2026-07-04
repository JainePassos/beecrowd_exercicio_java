package ex1011;

import java.io.IOException;
import java.util.Scanner;

public class Esfera {
    public static void main(String[] args) throws IOException {

        Scanner leitura = new Scanner(System.in);
        int R = leitura.nextInt();
        double pi = 3.14159;

        double VOLUME = (4.0/3) * pi * R* R * R;


        System.out.printf("VOLUME = %.3f%n", VOLUME);

    }
}
