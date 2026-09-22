package ex1115;

import java.util.Scanner;

public class Quadrante {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X = 1;
        int Y = 1;

        int i = 0;
        while (i != X || i != Y) {

            X = sc.nextInt();
            Y = sc.nextInt();

            if (X == 0 || Y == 0){
                break;
           }else if (X > 0 && Y > 0 ) {
                System.out.println("primeiro");
            } else if (X < 0 && Y > 0) {
                System.out.println("segundo");
            } else if (X < 0 && Y < 0) {
                System.out.println("terceiro");
            }else if (X > 0 && Y < 0 ){
                System.out.println("quarto");
            }

            i++;
        }

    }
}
