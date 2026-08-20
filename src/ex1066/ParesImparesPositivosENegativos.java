package ex1066;

import java.util.Scanner;

public class ParesImparesPositivosENegativos {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int[] Numero = new int[5];
        int Par = 0;
        int Impar = 0;
        int Positivo = 0;
        int Negativo = 0;

        for (int i = 0; i < 5 ; i++) {
           Numero[i] = leitura.nextInt();

            if (Numero[i] % 2 == 0){
                Par++;

            }else {
                Impar +=1;
            }
            if(Numero[i] > 0){
                Positivo++;

            }  if(Numero[i] < 0){
                Negativo++;
            }

        }

        System.out.println(Par +" valor(es) par(es)");
        System.out.println(Impar +" valor(es) impar(es)");
        System.out.println(Positivo +" valor(es) positivo(s)");
        System.out.println(Negativo +" valor(es) negativo(s)");

    }
}
