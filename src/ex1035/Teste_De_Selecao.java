package ex1035;

import java.io.IOException;
import java.util.Scanner;

public class Teste_De_Selecao {
    public static void main(String[] args) throws IOException {
        Scanner Valor = new Scanner(System.in);
        int A = Valor.nextInt();
        int B = Valor.nextInt();
        int C = Valor.nextInt();
        int D = Valor.nextInt();
        int Soma1 = C + D;
        int Soma2 = A + B;

        if (B > C && D > A && Soma1 > Soma2 && C > 0 && D > 0 && A % 2 == 0 ){
            System.out.println("Valores aceitos");

        }else {
            System.out.println("Valores nao aceitos");
        }

    }
}
