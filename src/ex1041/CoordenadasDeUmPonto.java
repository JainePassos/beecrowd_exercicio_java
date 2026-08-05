package ex1041;

import java.io.IOException;
import java.util.Scanner;

public class CoordenadasDeUmPonto {

    public static void main(String[] args) throws IOException {

        Scanner leitura = new Scanner(System.in);
        double X = leitura.nextDouble();
        double Y = leitura.nextDouble();

        if (Y == 0 && X == 0){
            System.out.println("Origem");
        } else if (X == 0 && Y !=0) {
            System.out.println("Eixo Y");
        } else if (X !=0 && Y ==0) {
            System.out.println("Eixo X");
        } else if (X > 0 &&  Y > 0) {
            System.out.println("Q1");
        }else if (X < 0 && Y >0) {
            System.out.println("Q2");
        } else if (X < 0 && Y < 0) {
            System.out.println("Q3");
        }else {
            System.out.println("Q4");
        }

    }
}
