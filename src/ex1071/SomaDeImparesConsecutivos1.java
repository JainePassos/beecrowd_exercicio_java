package ex1071;

import java.util.Scanner;

public class SomaDeImparesConsecutivos1 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        int X = leitura.nextInt();
        int Y = leitura.nextInt();
        int Soma = 0 ;

        int maior = Math.max(X,Y); //comparar o maior valor
        int menor = Math.min(X,Y); //comparar o menor valor

        for (int i = menor +1; i < maior ; i++) {
            if(i % 2 != 0){
                Soma +=i;
            }
        }

        System.out.println(Soma);


    }
}
