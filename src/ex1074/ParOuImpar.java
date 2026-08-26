package ex1074;

import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int N = leitura.nextInt();
        int[] X = new int[N];

        for (int i = 0; i < N; i++) {
            X[i] = leitura.nextInt();

            if(X[i] == 0){
                System.out.println("NULL");
            }
            if( X[i] % 2 == -1){
                System.out.println("ODD NEGATIVE");
            }if(X[i] % 2 == 1){
                System.out.println("ODD POSITIVE");
            }if(X[i] > 0 && X[i] % 2 == 0 ){
                System.out.println("EVEN POSITIVE");
            }if( X[i] < 0 && X[i] % 2 == 0){
                System.out.println("EVEN NEGATIVE");
            }

        }

    }
}

