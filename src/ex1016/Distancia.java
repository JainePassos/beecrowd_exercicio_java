package ex1016;

import java.io.IOException;
import java.util.Scanner;

public class Distancia {
    public static void main(String[] args) throws IOException {

        Scanner leitura = new Scanner(System.in);
        int CarroA = leitura.nextInt();

        int CarroX = 60;
        int CarroY = 90;
        int Minutos = 60;


        int DISTANCIA = (CarroY + CarroX)/Minutos * CarroA;

        System.out.println(DISTANCIA+" minutos");

    }
}
