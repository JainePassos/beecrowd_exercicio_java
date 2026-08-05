package ex1040;

import java.io.IOException;
import java.util.Scanner;

public class Media3 {

public static void main(String[] args) throws IOException {

    Scanner leitura = new Scanner(System.in);
    double N1 = leitura.nextDouble();
    double N2 = leitura.nextDouble();
    double N3 = leitura.nextDouble();
    double N4 = leitura.nextDouble();
    double media;
    double Media = (N1 * 2 + N2 * 3 + N3 * 4 + N4 * 1) / 10.0;

    if (Media >= 7.0) {
        System.out.printf("Media: %.1f%n", Media - 1e-9);
        System.out.println("Aluno aprovado.");
    } else if (Media < 5.0) {
        System.out.printf("Media: %.1f%n", Media - 1e-9);
        System.out.println("Aluno reprovado.");
    } else {
        double N5 = leitura.nextDouble();
        System.out.printf("Media: %.1f%n", Media - 1e-9);
        System.out.println("Aluno em exame.");
        System.out.printf("Nota do exame: %.1f%n", N5);
        media = (Media + N5) / 2.0;
        if (media >= 5.0) {
            System.out.println("Aluno aprovado.");
            System.out.printf("Media final: %.1f%n", media - 1e-9);
        } else {
            System.out.println("Aluno reprovado.");
            System.out.printf("Media final: %.1f%n", media - 1e-9);
        }

    }
  }
}