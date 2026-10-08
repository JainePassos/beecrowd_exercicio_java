package ex1133;
import java.util.Scanner;

public class RestodaDivisao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = 0;
        int Y = 0;

        X = sc.nextInt();
        Y = sc.nextInt();

        for (int i = X+1; i < Y ; i++) {
            if(i % 5 == 2 || i % 5 == 3){
                System.out.println(i);
            }

        }

        for (int j = 1+Y ; j < X ; j++) {
            if(j % 5 == 2 ||j % 5 == 3){
                System.out.println(j);
            }
        }
    }
}
