package ex1043;

import java.io.IOException;
import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) throws IOException {

        Scanner leitura = new Scanner(System.in);
        double A = leitura.nextDouble();
        double B = leitura.nextDouble();
        double C = leitura.nextDouble();
        double Perimetro = 0;
        double Area = 0;


        if(A + B > C && A + C > B && B + C > A){
            Perimetro = A + B + C;
            System.out.printf("Perimetro = %.1f%n",Perimetro);
        }else{
            Area = ((A + B) * C)/2;
            System.out.printf("Area = %.1f%n",Area);
        }

    }
}
