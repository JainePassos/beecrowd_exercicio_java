package ex1079;

import java.util.Scanner;

public class MediasPonderadas {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int N = leitura.nextInt();

        for (int i = 1; i <= N ; i++) {
            double n1 = leitura.nextDouble();
            double n2 = leitura.nextDouble();
            double n3 = leitura.nextDouble();
            System.out.printf("%.1f\n",(n1 * 0.2)+(n2 * 0.3)+(n3 * 0.5));
        }


    }
}
