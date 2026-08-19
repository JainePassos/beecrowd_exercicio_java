package ex1061;

import java.util.Scanner;

public class TempoDeUmEvento {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        leitura.next(); //Para ler o dia.
        int dia1 = leitura.nextInt();
        int hora1 = leitura.nextInt();
        leitura.next(); //:
        int minuto1 = leitura.nextInt();
        leitura.next(); //:
        int segundo1 = leitura.nextInt();

        leitura.next(); //Para ler o dia.
        int dia2 = leitura.nextInt();
        int hora2 = leitura.nextInt();
        leitura.next(); //:
        int minuto2 = leitura.nextInt();
        leitura.next(); //:
        int segundo2 = leitura.nextInt();

        int Inicio = (dia1 * 86400) + (hora1 * 3600) + (minuto1 * 60) + segundo1;
        int Final = (dia2 * 86400) + (hora2 * 3600) + (minuto2 * 60) + segundo2;

        int Duracao = Final - Inicio;

        int dias = Duracao / 86400;
        Duracao = Duracao % 86400;

        int horas = Duracao / 3600;
        Duracao = Duracao % 3600;

        int minutos = Duracao / 60;
        int segundos = Duracao % 60;

        System.out.println(dias + " dia(s)");
        System.out.println(horas + " hora(s)");
        System.out.println(minutos + " minuto(s)");
        System.out.println(segundos + " segundo(s)");


    }
}
