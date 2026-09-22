package ex1114;

import java.util.Scanner;

public class SenhaFixa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Senha = 2002;

        for (int i = 0; i != Senha ; i++) {

            int X = sc.nextInt();

            if(Senha == X){
                System.out.println("Acesso Permitido");
                break;
            }else {
                System.out.println("Senha Invalida");
            }

        }
    }
}
