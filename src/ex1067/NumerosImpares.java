package ex1067;

import java.util.Scanner;

public class NumerosImpares {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int N = leitura.nextInt();
        int contador;
        for ( contador = 1; contador < N; contador+=2) {

            System.out.println(contador);

        }
        if (N % 2 == 1){
            System.out.println(N);
        }

    }
}
