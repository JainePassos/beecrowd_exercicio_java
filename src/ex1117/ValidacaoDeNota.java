package ex1117;

import java.util.Arrays;
import java.util.Scanner;

public class ValidacaoDeNota {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double N = 0;
        double Nota1 = 0;
        double Nota2 = 0;
        double Media = 0;

        for (int i = 1; i!= N ;i++) {

            Nota1 = sc.nextDouble();
            //Nota2 = sc.nextDouble();
            if(Nota1 < 0 || Nota1 >10 || Nota2 < 0 || Nota2 >10){
                System.out.println("nota invalida");
            }if (Nota1 > 0 && Nota1 <=10 && Nota2 > 0 && Nota2 <= 10) {
                Media = (Nota1 + Nota2)/2;
                System.out.printf("media = %.2f",Media);
            }

        }

    }
}
