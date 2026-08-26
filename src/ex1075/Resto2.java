package ex1075;
import java.util.Scanner;

public class Resto2 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int N = leitura.nextInt();

        for (int i = 1; i < 10000 ; i++) {
            if (i % N == 2){
                System.out.println(i);
            }
        }


    }
}
