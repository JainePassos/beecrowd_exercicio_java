package ex1036;

import java.util.Scanner;

public class Formula_De_Bhaskara {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        double A = leitura.nextDouble();
        double B = leitura.nextDouble();
        double C = leitura.nextDouble();

        double Delta = (B * B) - (4 * A * C);

        if (A == 0 || Delta < 0) {

            System.out.println("Impossivel calcular");
        } else {
            double R1 = (-B + (Math.sqrt(Delta))) / (2 * A);
            double R2 = (-B - (Math.sqrt(Delta))) / (2 * A);

            System.out.printf("R1 = %.5f%n", R1);
            System.out.printf("R2 = %.5f%n", R2);
        }
    }
}