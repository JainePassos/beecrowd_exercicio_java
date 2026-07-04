package ex1014;

import java.io.IOException;
import java.util.Scanner;

public class Consumo {

    public static void main(String[] args) throws IOException {

        Scanner leitura = new Scanner(System.in);
        int X = leitura.nextInt();
        float Y = leitura.nextFloat();

        double Cmedio = X / Y;

        System.out.printf("%.3f km/l%n",Cmedio);

    }
}
