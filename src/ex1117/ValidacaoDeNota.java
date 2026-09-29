package ex1117;

import java.util.Scanner;

public class ValidacaoDeNota {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double Nota = 0;
        double Soma = 0;
        int Contador = 0;
        double Media = 0;

        for (int i = 1; i != Nota; i++) {
            Nota = sc.nextDouble();

            if (Nota >= 0 && Nota <= 10) {
                Soma+= Nota;
                Contador++;
                if (Contador == 2) {
                    Media = Soma / 2;
                    System.out.printf("media = %.2f\n", Media);
                    break;
                }
            }else {
                System.out.println("nota invalida");
            }

        }
    }
}
