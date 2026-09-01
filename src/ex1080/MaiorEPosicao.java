package ex1080;

import java.util.Scanner;

public class MaiorEPosicao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] N = new int[100];
        int Maior = 0;
        int Posicao = 0;

        for (int i = 0; i < 100; i++) {
            N[i] = sc.nextInt();
            if(N[i] > Maior){
                Maior = N[i];
                Posicao = i +1;
            }

        }
        System.out.println(Maior);
        System.out.println(Posicao);
    }
}
