package ex1149;
import java.util.Scanner;

public class SomandoInteirosConsecutivos {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        int A = sc.nextInt();
        int N = sc.nextInt();
        int Total = 0;
        int total = 0;

        while (N <= 0){
            N = sc.nextInt();
        }
        for (int i = 0; i <= N-1 ; i++) {
            Total = A + i;
            total+= Total;
        }
        System.out.println(total);
    }

}
