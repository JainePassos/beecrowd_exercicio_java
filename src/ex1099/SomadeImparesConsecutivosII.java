package ex1099;

import java.util.Scanner;

public class SomadeImparesConsecutivosII {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int N = sc.nextInt();
            int X = 0;
            int Y = 0;
            int Contador = 0;
            int Total = 0;

            for (int i = 0; i < N ; i++) {
                X = sc.nextInt();
                Y = sc.nextInt();

                Total = 0;

                if(X > Y){

                    Contador = Y +1;
                    for (int j = Contador; j < X ; j++) {
                        if(j % 2==1){
                            Total+=j;
                        }
                    }

                } else  {
                    Contador =X +1;
                    for (int j = Contador; j < Y ; j++) {

                        if(j % 2==1){
                            Total+=j;
                        }
                    }
                }
                System.out.println(Total);


            }


    }
}
