package ex1060;

import java.util.Scanner;

public class NumerosPositivos {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double N1 = leitura.nextDouble();
        double N2 = leitura.nextDouble();
        double N3 = leitura.nextDouble();
        double N4 = leitura.nextDouble();
        double N5 = leitura.nextDouble();
        double N6 = leitura.nextDouble();
        int Contador = 0;

        if(N1 > 0){
            Contador++;
        }if (N2 > 0){
            Contador+=1;
        }if (N3 > 0){
            Contador+=1;
        }if (N4 > 0){
            Contador+=1;
        }if (N5 > 0){
            Contador+=1;
        }if (N6 > 0){
            Contador+=1;
        }
        System.out.println(Contador + " valores positivos");
    }
}
