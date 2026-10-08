package ex1143;

import java.util.Scanner;

public class QuadradoEAoCubo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = 0;


        N = sc.nextInt();
        for (int i = 1; i <= N ; i++) {

            System.out.println(i + " " + i*i + " " + i*i*i);
        }
    }
}
