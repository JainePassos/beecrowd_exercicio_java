package ex1116;

import java.util.Scanner;

public class DividindoXPorY {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double X = 0;
        double Y = 0;

        double divisao;
        for (int i = 1; i <= N ; i++) {
            X = sc.nextDouble();
            Y = sc.nextDouble();

            if(X >= 0 && Y < 0 || Y > 0  ){
                divisao = X / Y;
                System.out.printf("%.1f\n",divisao);
            } else if (X > 0 && Y == 0 ) {
                System.out.println("divisao impossivel");
            }


        }
    }
}
