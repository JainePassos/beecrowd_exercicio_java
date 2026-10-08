package ex1134;

import java.util.Scanner;

public class TipodeCombustivel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Alcool = 0;
        int Gasolina = 0;
        int Diesel = 0;
        int N = 0;

       while (N != 4 || N < 1 || N > 4) {
           N = sc.nextInt();

           if(N == 1){
               Alcool++;
           }if (N == 2){
               Gasolina++;
           }if (N == 3){
               Diesel++;
           }
           if( N == 4){
               break;
           }
       }
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: "+ Alcool);
        System.out.println("Gasolina: "+Gasolina);
        System.out.println("Diesel: "+Diesel);


    }

}
