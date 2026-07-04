package ex1012;

import java.io.IOException;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) throws IOException {

        Scanner leitura = new Scanner(System.in);
        double A = leitura.nextDouble();
        double B = leitura.nextDouble();
        double C = leitura.nextDouble();
        double pi = 3.14159;
        double TRIANGULO = (A * C) /2;
        double CIRCULO = (2 * pi * C * C)/2;
        double TRAPEZIO = (A + B) * C/2;
        double QUADRADO = (B * B);
        double RETANGULO = (A * B);



        System.out.printf("TRIANGULO: %.3f%n", TRIANGULO);
        System.out.printf("CIRCULO: %.3f%n", CIRCULO);
        System.out.printf("TRAPEZIO: %.3f%n", TRAPEZIO);
        System.out.printf("QUADRADO: %.3f%n", QUADRADO);
        System.out.printf("RETANGULO: %.3f%n", RETANGULO);
    }
}
