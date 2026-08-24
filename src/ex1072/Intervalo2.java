package ex1072;

import java.util.Scanner;

public class Intervalo2 {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        int N = leitura.nextInt();
        int[] X = new int[N]; // VETOR QUE GUARDA OS VALORES SEPARADAMENTE E LER A QUANTIDADES DE VEZES BASEADOS EM N
        int In = 0;
        int Out = 0;

        for (int i = 0; i < N ; i++) {

             X[i] = leitura.nextInt();

            if (X[i] > 0 && X[i]<=20){
                In++;
            }else {
                Out++;
            }

        }

        System.out.println(In + " in");
        System.out.println(Out + " out");
    }
}
