package ex1094;
import java.util.Scanner;

public class Experiencias {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int Animal = 0, TotalCobais=0, TotalCoelhos=0, TotalRatos=0, TotalSapos=0;
        double PercentualDeCoelhos=0, PercentualDeRatos=0, PercentualDeSapos=0;
        String Caracter;

        for (int i = 0; i < N; i++) {
            Animal = sc.nextInt();
            Caracter = sc.next();
            TotalCobais += Animal;

            if (Caracter.equals("C")){
                TotalCoelhos += Animal;
            } else if (Caracter.equals("R")) {
                TotalRatos += Animal;
            }else if (Caracter.equals("S")){
                TotalSapos += Animal;
            }


        }
        PercentualDeCoelhos = (double) TotalCoelhos * 100 /TotalCobais;
        PercentualDeRatos = (double) TotalRatos * 100 /TotalCobais;
        PercentualDeSapos = (double) TotalSapos * 100 /TotalCobais;

        System.out.println("Total: " + TotalCobais + " cobaias");
        System.out.println("Total de coelhos: " + TotalCoelhos);
        System.out.println("Total de ratos: " + TotalRatos);
        System.out.println("Total de sapos: " + TotalSapos);

        System.out.printf("Percentual de coelhos: %.2f %%\n",PercentualDeCoelhos);
        System.out.printf("Percentual de ratos: %.2f %%\n",PercentualDeRatos);
        System.out.printf("Percentual de sapos: %.2f %%\n",PercentualDeSapos);
    }

}
