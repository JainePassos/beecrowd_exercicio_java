package ex1131;

import java.util.Scanner;

public class Grenais {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int Inter = 0;
        int Gremio = 0 ;
        int InterV = 0;
        int GremioV = 0;
        int N = 0;
        int Grenal = 0;
        int Empates = 0;
        String Vencedor =" ";


        while (N != 2){

            Inter = sc.nextInt();
            Gremio = sc.nextInt();

            System.out.println("Novo grenal (1-sim 2-nao)");
            N = sc.nextInt();


            if(Inter > Gremio){
                InterV++;

            } else if (Gremio > Inter) {
                GremioV++;

            }else {
                Empates++;

            }
            if (GremioV > InterV){
                Vencedor = "Gremio venceu mais";
            }else if (GremioV < InterV){
                Vencedor = "Inter venceu mais";
            }else {
                Vencedor = " ";
            }

            Grenal+= Grenal;
            switch (N){
                case 1:

                    break;

                case 2:
                    System.out.println("Inter:"+InterV);
                    System.out.println("Gremio:"+GremioV);
                    System.out.println(Grenal +" grenais");
                    Grenal++;
                    System.out.println(Grenal);
                    System.out.println("Empates:"+Empates);
                    System.out.println(Vencedor);
                    break;
            }
        }



    }
}
