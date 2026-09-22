package ex1113;

import java.util.Scanner;

public class CrescenteEDecrescente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         int X = 0;
         int Y = 1;

            do{
                 X = sc.nextInt();
                 Y = sc.nextInt();

                if (X > Y || Y <0) {
                    System.out.println("Decrescente");
                }else if (X < Y || X < 0){
                    System.out.println("Crescente");
                }

            }while (X != Y);



        }
    }

