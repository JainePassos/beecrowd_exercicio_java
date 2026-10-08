package ex1142;

import java.util.Scanner;

public class PUM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = 0;
        int J = 1;
        int A = 2;
        int Y = 3;
        int j = 1;

        N = sc.nextInt();
        while (j <= N){
            System.out.println(J + " " + A + " " + Y + " PUM");
            j++;
            J+=4;
            A+=4;
            Y+=4;
        }
    }
}
