package ex1145;
import java.util.Scanner;

public class SequenciaLogica2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = 0;
        int Y = 0;
        X = sc.nextInt();
        Y = sc.nextInt();

        for (int i = 1; i <= Y ; i++) {
            System.out.print(i);
            if(i%X == 0){

                System.out.println("");
            }else {
                System.out.print(" ");
            }

        }


    }
}