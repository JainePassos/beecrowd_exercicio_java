package ex1002;

import java.util.Scanner;

public class Area_do_Circulo_1002 {
    public static void main(String[] args) {
        double n = 3.14159;

        Scanner leitura = new Scanner(System.in);
        double raio = leitura.nextDouble();
        double area = n * raio * raio;

        System.out.printf("A=%.4f%n",area);
    }

}
