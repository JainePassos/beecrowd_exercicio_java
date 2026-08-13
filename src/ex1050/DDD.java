package ex1050;

import java.io.IOException;
import java.util.Scanner;

public class DDD {
    public static void main(String[] args) throws IOException {
        Scanner leitura = new Scanner(System.in);
        int Numero = leitura.nextInt();
        String DDD = " ";

        if(Numero == 61){
            DDD = "Brasilia";
        } else if (Numero == 71) {
            DDD = "Salvador";
        }else if (Numero == 11) {
            DDD = "Sao Paulo";
        }else if (Numero == 21) {
            DDD = "Rio de Janeiro";
        }else if (Numero == 32) {
            DDD = "Juiz de Fora";
        }else if (Numero == 19) {
            DDD = "Campinas";
        }else if (Numero == 27) {
            DDD = "Vitoria";
        }else if (Numero == 31) {
            DDD = "Belo Horizonte";
        }else {
         System.out.println("DDD nao cadastrado");
            return;
        }
        System.out.println(DDD);
    }
}
