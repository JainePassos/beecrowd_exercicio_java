package ex1065;

import java.util.Scanner;

public class ParesEntreCincoNumeros {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        int[] Numero = new int[5];
        int Contador = 0;

        for (int i = 0; i < 5; i++) {
            Numero[i] = leitura.nextInt();

            if (Numero[i] % 2 == 0){
                Contador +=1;

            }
        }
        System.out.println(Contador + " valores pares");
    }
}
