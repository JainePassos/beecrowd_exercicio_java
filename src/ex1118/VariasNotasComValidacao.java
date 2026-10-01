package ex1118;

import java.util.Scanner;

public class VariasNotasComValidacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double Nota = 0;
        double Soma = 0;
        double Contador = 0;
        double Media = 0;
        int X = 0;

              while (X != 2 ) {

                  Nota = sc.nextDouble();

                  if(Nota > 0 && Nota <= 10){
                      Soma += Nota;
                      Contador++;
                  }
                  if (Nota < 0 || Nota > 10) {
                      System.out.println("nota invalida");
                  }
                  if (Contador == 2) {
                      Media = Soma / 2;
                      System.out.printf("media = %.2f\n", Media);
                      System.out.println("novo calculo (1-sim 2-nao)");
                          X = sc.nextInt();
                          while (X < 1 || X > 2){
                              System.out.println("novo calculo (1-sim 2-nao)");
                              X = sc.nextInt();
                          }

                      Soma = 0;
                      Contador = 0;
                      Nota = 0;

                      switch (X) {

                          case 1:

                           break;
                          case 2:
                              break;
                  }



                  }
              }


    }

}