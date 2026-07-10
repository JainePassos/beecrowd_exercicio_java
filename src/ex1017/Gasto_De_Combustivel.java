package ex1017;

import java.io.IOException;
import java.util.Scanner;

public class Gasto_De_Combustivel {
    public static void main(String[] args) throws IOException {

        Scanner leitura = new Scanner(System.in);
        int horas = leitura.nextInt();
        int velocidade = leitura.nextInt();
        double kml = 12;

        double Litros = (horas * velocidade)/kml;
        System.out.printf("%.3f%n",Litros);
    }
}
