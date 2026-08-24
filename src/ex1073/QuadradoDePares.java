package ex1073;

import java.util.Scanner;

public class QuadradoDePares {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int N = leitura.nextInt();

        for (int i = 1; i < N; i++) {
            i +=1;

            System.out.println(i + "^2 = " + i*i);


        }

    }
}
