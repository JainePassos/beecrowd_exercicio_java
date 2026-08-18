package ex1051;

import java.io.IOException;
import java.util.Scanner;

public class ImpostoDeRenda {

    public static void main(String[] args) throws IOException {


        Scanner leitura = new Scanner(System.in);
        double Salario = leitura.nextDouble();
        double ValorAPagar = 0;

        if(Salario > 4500){
            ValorAPagar = (Salario - 4500)* 0.28;
            ValorAPagar += (4500 - 3000 )* 0.18;
            ValorAPagar += (3000 - 2000)*0.08;

        }else if (Salario > 3000){
            ValorAPagar += (Salario - 3000) * 0.18;
            ValorAPagar += (3000 - 2000)*0.08;
        } else if (Salario > 2000) {
            ValorAPagar += (Salario - 2000) * 0.08;
        }

        if(Salario<= 2000 ){
            System.out.println("Isento");
        }else {
            System.out.printf("R$ %.2f\n", ValorAPagar);
        }

    }

}
