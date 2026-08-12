package ex1047;

import java.io.IOException;
import java.util.Scanner;

public class TempoDeJogoComMinutos {
    public static void main(String[] args) throws IOException {

        Scanner leitura = new Scanner(System.in);

        int horaInicial = leitura.nextInt();
        int minutoInicial = leitura.nextInt();

        int horaFinal = leitura.nextInt();
        int minutoFinal = leitura.nextInt();

        int inicio = horaInicial * 60 + minutoInicial;
        int fim = horaFinal * 60 + minutoFinal;

        int duracao;

        if (fim <= inicio) {
            duracao = (24 * 60 - inicio) + fim;
        } else {
            duracao = fim - inicio;
        }

        int duracaoHora = duracao / 60;
        int duracaoMinuto = duracao % 60;

        System.out.println("O JOGO DUROU " + duracaoHora
                + " HORA(S) E " + duracaoMinuto + " MINUTO(S)");
    }
}
