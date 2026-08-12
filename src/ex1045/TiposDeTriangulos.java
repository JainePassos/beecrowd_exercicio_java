package ex1045;

import java.io.IOException;
import java.util.Scanner;

public class TiposDeTriangulos {
    public static void main(String[] args) throws IOException {

        Scanner leitura = new Scanner(System.in);
        double A = leitura.nextDouble();
        double B = leitura.nextDouble();
        double C = leitura.nextDouble();
        double troca;

        if(A < B){
            troca = A;
            A = B;
            B = troca;
        }if(A < C){
            troca = A;
            A = C;
            C = troca;
        }if (B< C){
            troca = B;
            B = C;
            C = troca;
        }
        if(A >= B +C){
            System.out.println("NAO FORMA TRIANGULO");
        }else {
            if (A * A == B * B + C * C) {
                System.out.println("TRIANGULO RETANGULO");
            }
            if (A * A > B * B + C * C) {
                System.out.println("TRIANGULO OBTUSANGULO");
            }
            if (A * A < B * B + C * C) {
                System.out.println("TRIANGULO ACUTANGULO");
            }
            if (A == B && A == C && B == C) {
                System.out.println("TRIANGULO EQUILATERO");
            } else if (A == B || A == C || B == C) {
                System.out.println("TRIANGULO ISOSCELES");
            }
        }

    }
}
