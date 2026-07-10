package ex1019;

import java.io.IOException;
import java.util.Scanner;

public class Conversao_De_Tempo {

    public static void main(String[] args) throws IOException {

        Scanner leitura = new Scanner(System.in);
        int N = leitura.nextInt();

        int Horas = N /3600;
        N = N % 3600;

        int Minutos = N / 60;
        N = N % 60;

        int Segundos = N;

        System.out.printf("%d:%d:%d%n",Horas, Minutos, Segundos);

    }
}
