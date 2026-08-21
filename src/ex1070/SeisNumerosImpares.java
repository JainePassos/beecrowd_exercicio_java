package ex1070;
import java.util.Scanner;

public class SeisNumerosImpares {

    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        int N = leitura.nextInt();


        if (N % 2 ==1){
            System.out.println(N);
        }else {
            N += 1;
            System.out.println(N);
        }

        for (int i = 0; i < 5 ; i++) {

            N += 2;
            System.out.println(N);

        }



    }
}
