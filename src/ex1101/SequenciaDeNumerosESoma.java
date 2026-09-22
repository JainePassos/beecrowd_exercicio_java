package ex1101;

import java.util.Scanner;

public class SequenciaDeNumerosESoma {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int M = 0;
        int N = 0;
        int Total = 0;
        int Contador = 0;

        for (int i = 0; i <= M && i <= N; i++) {
            M = sc.nextInt();
            N = sc.nextInt();

            Total = 0;

            if(M <= 0 || N <=0){
                break;
            } else if (M > N) {

                Contador = N;
                for (int j = Contador; j <= M; j++) {
                    Total +=j;
                    System.out.print(j+ " ");
                }

            } else if (M < N) {
                Contador = M;
                for (int j = Contador; j <= N; j++) {
                    Total +=j;
                    System.out.print(j+ " ");
                }

            }
            System.out.println("Sum=" + Total);
        }
    }
}