package ex1015;

import java.io.IOException;
import java.util.Scanner;

public class Distancia_Entre_Dois_Pontos {
    public static void main(String[] args) throws IOException {

        Scanner leitura = new Scanner(System.in);
        double X1 = leitura.nextDouble();
        double Y1 = leitura.nextDouble();
        double X2 = leitura.nextDouble();
        double Y2 = leitura.nextDouble();

        double DISTANCIA = Math.sqrt((X2 - X1) * (X2 - X1) + (Y2 - Y1) * (Y2 - Y1));

        System.out.printf("%.4f%n",DISTANCIA);

    }
}
