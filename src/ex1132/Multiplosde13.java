package ex1132;

import java.util.Scanner;

public class Multiplosde13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = 0;
        int Y = 0;
        int M1 = 0;

        X = sc.nextInt();
        Y = sc.nextInt();

        for (int i = X; i <= Y ; i++) {
            if (i % 13 != 0 ){
                M1+=i;

            }

        }

        for (int j = X; j >= Y ; j--) {
            if (j % 13 != 0){
                M1+=j;

            }

        }
        System.out.println(M1);
    }
}
