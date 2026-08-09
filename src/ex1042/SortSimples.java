package ex1042;

import java.io.IOException;
import java.util.Scanner;

public class SortSimples {
    public static void main(String[] args) throws IOException {

        Scanner leitura = new Scanner(System.in);
        int A = leitura.nextInt();
        int B = leitura.nextInt();
        int C = leitura.nextInt();
        int troca = 0;
        int originalA = A;
        int originalB = B;
        int originalC = C;


        if(A > B){

            troca = A;
            A = B;
            B = troca;

        }
        if(A > C){
            troca = A;
            A = C;
            C = troca;
        }
        if(B > C){
            troca = B;
            B = C;
            C = troca;
        }
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
        System.out.println();
        System.out.println(originalA);
        System.out.println(originalB);
        System.out.println(originalC);

    }


}
