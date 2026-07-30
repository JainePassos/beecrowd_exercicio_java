package ex1038;

import java.io.IOException;
import java.util.Scanner;

public class Lanche {
    public static void main(String[] args) throws IOException {

        Scanner leitura = new Scanner(System.in);

        int codigo = leitura.nextInt();
        int Qtd = leitura.nextInt();
        double CachorroQ = 4.0;
        double Xsalada = 4.50;
        double Xbacon = 5.00;
        double TorradaSimples = 2.00;
        double Refrigerante = 1.50;

        double Total;

        if(codigo == 1){
            Total = Qtd * CachorroQ;
            System.out.printf("Total: R$ %.2f%n",Total);
        }else if (codigo == 2){
            Total = Qtd * Xsalada;
            System.out.printf("Total: R$ %.2f%n",Total);
        } else if (codigo == 3){
            Total = Qtd * Xbacon;
            System.out.printf("Total: R$ %.2f%n",Total);
        } else if (codigo == 4) {
            Total = Qtd * TorradaSimples;
            System.out.printf("Total: R$ %.2f%n",Total);
        } else if (codigo == 5){
            Total = Qtd * Refrigerante;
            System.out.printf("Total: R$ %.2f%n",Total);
        }

    }
}
