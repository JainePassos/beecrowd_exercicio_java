package ex1046;

import java.io.IOException;
import java.util.Scanner;

public class TempoDeJogo {
    public static void main(String[] args) throws IOException {

        Scanner leitura = new Scanner(System.in);
        int inicio = leitura.nextInt();
        int fim = leitura.nextInt();
        int duracao = 0;

        if( inicio >= fim ){
            duracao = (24 - inicio) + fim;
        }else {
            duracao = fim - inicio;
        }
        System.out.println("O JOGO DUROU " + duracao + " HORA(S)");

    }
}
