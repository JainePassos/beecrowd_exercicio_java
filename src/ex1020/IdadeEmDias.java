package ex1020;
import java.io.IOException;
import java.util.Scanner;

public class IdadeEmDias {
    public class Main {

        public static void main(String[] args) throws IOException {
            Scanner leitura = new Scanner(System.in);

            int IdadeDias = leitura.nextInt();

            int Ano = IdadeDias / 365;
            IdadeDias = IdadeDias % 365;

            int Mes = IdadeDias / 30;
            IdadeDias = IdadeDias % 30;

            int Dias = IdadeDias;

            System.out.println(Ano + " ano(s)");
            System.out.println(Mes + " mes(es)");
            System.out.println(Dias + " dia(s)");

        }
    }
}
