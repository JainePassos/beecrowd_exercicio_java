package ex1048;

import java.util.Scanner;

public class AumentoDeSalario {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        double salario = leitura.nextDouble();
        double percentual = 0;
        double novoSalario = 0;
        double reajuste = 0;
        int p = 0;

        if(salario >=0 && salario <= 400){
            p = 15;
            percentual = 15.0;
            reajuste = (percentual * salario)/100;
            novoSalario = salario + reajuste;
        } else if (salario >= 400.1 && salario <= 800.00) {
            p = 12;
            percentual = 12.0;
            reajuste = (percentual * salario)/100;
            novoSalario = salario + reajuste;
        } else if (salario >=800.01 && salario <= 1200.00) {
            p = 10;
            percentual = 10.0;
            reajuste = (percentual * salario)/100;
            novoSalario = salario + reajuste;
        }else if (salario >=1200.01 && salario <= 2000.00){
            p = 7;
            percentual = 7.0;
            reajuste = (percentual * salario)/100;
            novoSalario = salario + reajuste;
        } else{
            p = 4;
            percentual = 4.0;
            reajuste = (percentual * salario)/100;
            novoSalario = salario + reajuste;
        }
        System.out.printf("Novo salario: %.2f\n", novoSalario);
        System.out.printf("Reajuste ganho: %.2f\n", reajuste);
        System.out.println("Em percentual: " + p + " %");

    }
}
