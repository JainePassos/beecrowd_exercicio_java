package ex1064;

import java.util.Scanner;

public class PositivosEMedia {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        double [] Numeros  = new double[6];
        double Valores = 0;
        int Contador = 0;

        for (int i = 0; i < 6 ; i++) {
            Numeros[i] = leitura.nextDouble();

            if (Numeros[i] > 0){
                Contador+=1;
                Valores += Numeros[i];
            }
        }

        System.out.println(Contador + " valores positivos");
        System.out.printf("%.1f\n",Valores /Contador);

    }
}

