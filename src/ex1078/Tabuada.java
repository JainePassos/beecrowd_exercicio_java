package ex1078;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int N = leitura.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " x " + N + " = " + (i*N));
        }
    }
}
