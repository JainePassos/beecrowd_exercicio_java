package ex1049;

import java.io.IOException;
import java.util.Scanner;

public class Animal {
    public static void main(String[] args) throws IOException {
        Scanner leitura = new Scanner(System.in);
        String tipo1 = leitura.nextLine();
        String tipo2 = leitura.nextLine();
        String tipo3 = leitura.nextLine();
        String Animal = " ";

        if (tipo1.equals("vertebrado") && tipo2.equals("ave")  && tipo3.equals("carnivoro") ){
            Animal = "aguia";
        } else if (tipo1.equals("vertebrado") && tipo2.equals("ave")  && tipo3.equals("onivoro")) {
            Animal = "pomba";
        } else if (tipo1.equals("vertebrado") && tipo2.equals("mamifero") && tipo3.equals("onivoro")) {
            Animal = "homem";
        } else if (tipo1.equals("vertebrado") && tipo2.equals("mamifero") && tipo3.equals("herbivoro")) {
            Animal = "vaca";
         }else if (tipo1.equals("invertebrado") && tipo2.equals("inseto") && tipo3.equals("hematofafo")){
            Animal = "pulga";
        }else if (tipo1.equals("invertebrado") && tipo2.equals("inseto")&& tipo3.equals("herbivoro")) {
            Animal = "lagarta";
        } else if (tipo1.equals("invertebrado") && tipo2.equals("anelideo") && tipo3.equals("hematofago")) {
            Animal = "sanguessuga";
        }else if (tipo1.equals("invertebrado") && tipo2.equals("anelideo") && tipo3.equals("onivoro")) {
            Animal = "minhoca";
        }
        System.out.println(Animal);
    }
}
