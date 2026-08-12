package ex1044;

import java.io.IOException;
import java.util.Scanner;

public class Multiplos {
    public static void main(String[] args) throws IOException {

        Scanner leitura = new Scanner(System.in);
        int A = leitura.nextInt();
        int B = leitura.nextInt();

        if(A % B == 0 || B % A == 0 ){
            System.out.println("Sao Multiplos");

        }else {
            System.out.println("Nao sao Multiplos");
        }


    }
}
